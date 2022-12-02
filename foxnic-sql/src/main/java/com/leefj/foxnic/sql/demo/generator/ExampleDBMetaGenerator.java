package com.leefj.foxnic.sql.demo.generator;

import com.github.foxnic.commons.project.maven.MavenProject;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.generator.builder.constants.DBMetaClassFile;
import com.github.foxnic.generator.config.GlobalSettings;
import com.leefj.foxnic.sql.demo.config.DBInstance;


public class ExampleDBMetaGenerator {

	/**
	 * 运行main函数生成代码
	 * */
	public static void main(String[] args) throws Exception {
		ExampleDBMetaGenerator g = new ExampleDBMetaGenerator();
		g.buildDBMeta();
	}

	private DAO dao;

	public ExampleDBMetaGenerator() {
		this.dao= DBInstance.DEFAULT.dao();
	}

	/**
	 * 生成DBMeta数据
	 * */
	private void buildDBMeta() {

		GeneratorUtil.initGlobalSettings();

		DBMetaClassFile dbMetaBuilder=new DBMetaClassFile(dao,GeneratorUtil.getProject(), "com.leefj.foxnic.sql.demo.config","ExampleTables");
		dbMetaBuilder.setTableFilter(table->{
			table=table.toLowerCase();
			// 仅生成以 example_ 开头的表
			if(table.startsWith("example_")) return true;
			return false;
		});
		dbMetaBuilder.save(true);
	}
}
