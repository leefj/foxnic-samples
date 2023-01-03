package com.leefj.foxnic.sql.demo.generator;

import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.generator.builder.constants.DBMetaClassFile;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class ExampleDBMetaGenerator {
	/**
	 * 运行main函数生成代码
	 * */
	public static void main(String[] args) throws Exception {
		ExampleDBMetaGenerator g = new ExampleDBMetaGenerator();
		g.buildDBMeta();
	}
	/**
	 * 生成DBMeta数据
	 * */
	private void buildDBMeta() {
		// 初始化 DAO 对象
		DAO dao= DBInstance.DEFAULT.dao();
		// 初始化全局设置
		GeneratorUtil.initGlobalSettings();
		// 初始化 DBMetaClassFile 构建器
		DBMetaClassFile dbMetaBuilder=new DBMetaClassFile(dao,GeneratorUtil.getProject(), "com.leefj.foxnic.sql.demo.config","ExampleTables");
		// 过滤与排除不需要的表
		dbMetaBuilder.setTableFilter(table->{
			table=table.toLowerCase();
			// 仅生成以 example_ 开头的表
			if(table.startsWith("example_")) return true;
			return false;
		});
		// 保存为 Java 代码
		dbMetaBuilder.save(true);
	}
}
