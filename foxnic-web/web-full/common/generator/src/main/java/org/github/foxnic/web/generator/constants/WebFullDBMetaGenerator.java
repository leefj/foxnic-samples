package org.github.foxnic.web.generator.constants;

import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.generator.builder.constants.DBMetaClassFile;
import org.github.foxnic.web.generator.config.WebFullConfigs;


public class WebFullDBMetaGenerator {

	/**
	 * 运行main函数生成代码
	 * */
	public static void main(String[] args) throws Exception {
		WebFullDBMetaGenerator g = new WebFullDBMetaGenerator();
		g.buildDBMeta();
	}

	private WebFullConfigs configs;
	private DAO dao;

	public WebFullDBMetaGenerator() {
		// 这里无所谓，service-system 可以不修改
		this.configs=new WebFullConfigs("webfull-service-example");
		this.dao=this.configs.getDAO();
	}

	/**
	 * 生成DBMeta数据
	 * */
	private void buildDBMeta() {
		DBMetaClassFile dbMetaBuilder=new DBMetaClassFile(dao,configs.getDomainProject(),this.configs.getProjectConfigs().getDomainConstantsPackage(),"WebFullTables");
		dbMetaBuilder.setTableFilter(table->{
			table=table.toLowerCase();
			// 仅生成以 example_ 开头的表
			if(table.startsWith("webfull_")) return true;
			return false;
		});
		dbMetaBuilder.save(true);
	}
}
