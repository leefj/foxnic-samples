package com.leefj.webfull.framework.support.datasource;

import com.github.foxnic.commons.collection.CollectorUtil;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.dao.cache.CacheProperties;
import com.github.foxnic.dao.dataperm.DataPermManager;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.spec.DAOBuilder;
import com.github.foxnic.dao.sql.loader.SQLoader;
import com.github.foxnic.springboot.spring.SpringUtil;
import com.github.foxnic.sql.meta.DBDataType;
import com.github.foxnic.sql.treaty.DBTreaty;
import org.github.foxnic.web.constants.db.FoxnicWeb;
import org.github.foxnic.web.domain.changes.ChangeInstance;
import org.github.foxnic.web.domain.system.DictItem;
import org.github.foxnic.web.domain.system.DictItemVO;
import org.github.foxnic.web.framework.cache.FoxnicDataCacheManager;
import org.github.foxnic.web.framework.dao.DBConfigs;
import org.github.foxnic.web.framework.proxy.ProxyContext;
import org.github.foxnic.web.proxy.system.DictItemServiceProxy;
import com.leefj.webfull.relation.FoxnicWebRelationManager;
import org.github.foxnic.web.session.SessionUser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

@Configuration
public class DAOConfig {

	@Value("${"+DatasourceConfig.PRIMARY_DATASOURCE_CONFIG_KEY+".printSQL}")
	private Boolean printSQL;

	@Value("${"+DatasourceConfig.PRIMARY_DATASOURCE_CONFIG_KEY+".printSQLSimple}")
	private Boolean printSQLSimple;

	@Value("${"+DatasourceConfig.PRIMARY_DATASOURCE_CONFIG_KEY+".printSQLCallstack}")
	private Boolean printSQLCallstack;

	@Value("${develop.start-relation-monitor}")
	private  Boolean startRelationMonitor=false;

	@Bean(DBConfigs.PRIMARY_DAO)
	@Primary
	public DAO primaryDAO (
			@Qualifier(DatasourceConfig.PRIMARY_DATA_SOURCE_NAME) DataSource dataSource,DBTreaty dbTreaty) {
		try {
			if(printSQL==null) printSQL=false;

 			//????????????????????????????????????????????????????????????
			DBConfigs.reset(dataSource,DatasourceConfig.PRIMARY_DATASOURCE_CONFIG_KEY,null);

			DAO dao= (new DAOBuilder().datasource(dataSource)).build();
			dao.setPrintSQL(printSQL);
			dao.setPrintSQLSimple(printSQLSimple);
			dao.setPrintSQLCallstack(printSQLCallstack);
			dao.setDBTreaty(dbTreaty);

			//????????????
			FoxnicWebRelationManager relationManager=new FoxnicWebRelationManager();
			if(startRelationMonitor) {
				relationManager.startMonitor();
			}
			dao.setRelationManager(relationManager);

			//????????????
			FoxnicDataCacheManager cacheManager=new FoxnicDataCacheManager();
	 		CacheProperties cacheProperties=new CacheProperties(SpringUtil.getEnvProperties("foxnic.cache"));
			cacheManager.setCacheProperties(cacheProperties);
			cacheManager.setRelationManager(relationManager);

			dao.setDataCacheManager(cacheManager);

			//???????????????????????????
			dao.setDataPermManager(getDataPermManager(dao));

			//???????????????????????????
			dao.setSequenceTable(FoxnicWeb.SYS_SEQUENCE.$NAME);
			dao.setSequenceProcedure("NEXT_VAL");


			//??????SQL??????
			SQLoader.addTQLScanPackage(dao,SpringUtil.getStartupClass().getPackage().getName());
			ComponentScan sc=(ComponentScan)SpringUtil.getStartupClass().getAnnotation(ComponentScan.class);
			for (String pkg : sc.basePackages()) {
				SQLoader.addTQLScanPackage(dao,pkg);
			}

			Logger.info("dao is ready : \n\n"+dao.toString()+"\n");

			return dao;
		} catch (Exception e) {
			Logger.error("??????DAO??????",e);
			return null;
		}
	}

	private DataPermManager getDataPermManager(DAO dao) {
		DataPermManager dataPermManager=new DataPermManager();

		//????????????????????????(??????)
		dataPermManager.registerGlobalContextGetter(Date.class,"demo",()->{
			return new Date();
		});

		//????????????????????????(?????????sexDictCodes )
		dataPermManager.registerGlobalContextGetter(List.class,"sexDictCodes",()->{
			DictItemVO sample=new DictItemVO();
//			sample.setDictCode(DictEnum.SEX.code());
			List<DictItem> dictItems= DictItemServiceProxy.api().queryList(sample).data();
			List<String> codes= CollectorUtil.collectList(dictItems,(x)->{return x.getCode();});
			return codes;
		});

		//????????????????????????(??????)
		dataPermManager.registerGlobalContextGetter(String[].class,"misc",()->{
			SessionUser user=(SessionUser)dao.getDBTreaty().getSubject();
//			List<User> users1=dao.query("select * from sys_user where name like ?","%admin%").toEntityList(User.class);
//			List<User> users2=dao.queryEntities(User.class,"select * from sys_user where name like ?", "%adm%");
//			List<User> users3=dao.queryEntities(User.class,new ConditionExpr("name like ?", "%adm%"));
//
//			String[] sub = {
//					"select",
//					"*",
//					"from",
//					"sys_user"
//			};
//			String sql=SQL.joinSQLs(sub);
//			dao.query(sql);

			return user.permission().getBusiRoleIds();
		});

		//??????Po?????????????????????(??????)
		dataPermManager.registerLocalContextGetter(ChangeInstance.class,Logger.class,"demo",()->{
			return System.currentTimeMillis();
		});

		//??????Po?????????????????????(??????)
		dataPermManager.registerLocalContextGetter(ChangeInstance.class,List.class,"sexDictCodes",()->{
			DictItemVO sample=new DictItemVO();
//			sample.setDictCode(DictEnum.SEX.code());
			List<DictItem> dictItems= DictItemServiceProxy.api().queryList(sample).data();
			List<String> codes= CollectorUtil.collectList(dictItems,(x)->{return x.getCode();});
			return codes;
		});

		//??????Po?????????????????????(??????)
		dataPermManager.registerLocalContextGetter(ChangeInstance.class,String[].class,"misc",()->{
			SessionUser user=(SessionUser)dao.getDBTreaty().getSubject();
			return user.permission().getBusiRoleIds();
		});





		return  dataPermManager;
	}

	@Bean
	public DBTreaty getDBTreaty() {

		DBTreaty dbTreaty=new DBTreaty();
		//
		dbTreaty.setAllowDeleteWithoutWhere(false);
		dbTreaty.setAllowUpdateWithoutWhere(false);

		//
		dbTreaty.setUserIdDataType(DBDataType.STRING);

		//
		dbTreaty.setTenantIdField("tenant_id");
		//
		dbTreaty.setCreateTimeField("create_time");
		dbTreaty.setCreateUserIdField("create_by");
		//
		dbTreaty.setUpdateTimeField("update_time");
		dbTreaty.setUpdateUserIdField("update_by");
		//
		dbTreaty.setDeletedField("deleted");
		dbTreaty.setDeleteTimeField("delete_time");
		dbTreaty.setDeleteUserIdField("delete_by");
		//
		dbTreaty.setVersionField("version");
		//
		dbTreaty.setAutoCastLogicField(false);
		// ?????? false ?????????????????????
		dbTreaty.setFalseValue(0);
		// ?????? true ?????????????????????
		dbTreaty.setTrueValue(1);

		//?????????????????????????????????
		if(SpringUtil.isReady()) {

			dbTreaty.setSubjectHandler(()->{
				SessionUser user=SessionUser.getCurrent();
				return user;
			});

			dbTreaty.setLoginUserIdHandler(()->{
				String userId=null;
				SessionUser user=SessionUser.getCurrent();
				if(user!=null) {
					userId = user.getUserId();
				} else {
					userId = ProxyContext.getCalleeId();
				}
				return userId;
			});


			dbTreaty.setTenantIdHandler(()->{
				SessionUser user=SessionUser.getCurrent();
				if(user==null) return ProxyContext.getCalleeTenantId();
				if(user.getUser()!=null && user.getUser().getActivatedTenant()!=null) {
					return user.getActivatedTenantId();
				}
				return null;
			});
		}

		//
		return dbTreaty;
	}



}
