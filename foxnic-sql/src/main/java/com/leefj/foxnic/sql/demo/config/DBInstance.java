package com.leefj.foxnic.sql.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.foxnic.commons.encrypt.AESUtil;
import com.github.foxnic.commons.environment.OSType;
import com.github.foxnic.commons.io.FileUtil;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.commons.property.YMLProperties;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.spec.DAOBuilder;
import com.github.foxnic.sql.GlobalSettings;
import com.github.foxnic.sql.meta.DBType;

import javax.sql.DataSource;
import java.io.File;

public enum DBInstance {


	/**
	 *  默认的 MySQL 8 数据库
	 * */
	DEFAULT("com.mysql.cj.jdbc.Driver","tD5wkJAfnCt04A+Y+QN5GA==","ODGx5F84xpWJgfRFnzAaYhViHJqrTO3uxxDZ2lRlZNk=","ai+mCm8asbK9SNrQDk7ac29neidjdgHp2jFU7HYbZZM7XPIVnc3jn040SCi2ghsOJmvzo7Z8DsMWz0GJtHzk5fVkSVq8PVTLpt97W7e4//KN1tJ8luj3f2R4xGk6d01pnyaG7DyU2tsIMcGZTOl8T0kLJom6Izu9ePptW1UPa7MuTPWKDKUSCYKdQSv51ASxJE99hLodGgxEtGeRBhnlDigwekNCLkMQGvjVKTeDRDsro2ghN1qDTzmyCaGJQxMq",true),
	/**
	 *  其它自定义的数据库
	 * */
	OTHER("com.mysql.cj.jdbc.Driver","user","passwd","jdbc:mysql://66.92.240.43:3306/foxnic-web?useSSL=false&serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&allowPublicKeyRetrieval=true",false);


	private String passwd ;
	private String user ;
	private String url ;
	private String driver;

	/**
	 * 是否加密连接信息
	 * */
	private boolean encrypt;



	private DBInstance(String driver, String user, String passwd, String url,boolean encrypt) {
		this.encrypt=encrypt;
		this.driver=driver;
		this.user=decryptIf(user);
		this.passwd=decryptIf(passwd);
		this.url=decryptIf(url);

	}


	private DAO dao;

	public DAO dao() {

		if(this.dao!=null) return this.dao;

		DBType dbType=DBType.parseFromURL(this.url);
		//
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(this.driver);
		dataSource.setUrl(this.url);
		dataSource.setUsername(this.user);
		dataSource.setPassword(this.passwd);
		// mysql 关闭，Oracle 建议开启
		if(dbType==DBType.ORACLE) {
			dataSource.setPoolPreparedStatements(true);
		}
		DAOBuilder builder=new DAOBuilder();
		try {
			dao=builder.datasource(dataSource).build();
			GlobalSettings.DEFAULT_SQL_DIALECT=this.dao.getSQLDialect();
			return dao;
		} catch (Exception e) {
			Logger.error("创建DAO错误",e);
			return null;
		}
	}

	private static  AESUtil AES_UTIL=null;

	private String decryptIf(String str) {

		if(!this.encrypt) return str;
		if(AES_UTIL==null) {
			File file = null;
			if (OSType.isWindows()) {
				file = new File("d:/foxnic/passwd.txt");
			} else if (OSType.isMac()) {
				file = new File("/Users/Shared/foxnic/passwd.txt");
			}
			String passwd = FileUtil.readText(file);
			//
			AES_UTIL = new AESUtil(passwd);
		}
		//
	 	return AES_UTIL.decryptData(str);

	}


}
