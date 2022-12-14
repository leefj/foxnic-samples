package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.crud.CRUDBySQLDemo;

import java.util.Date;

public class DAO_ExecuteDemo {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }


    /**
     * 1、直接传入字符串的 SQL 语句，并执行
     * */
    public static void  demo1() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        // 生成 ID
        String id= IDGenerator.getNanoId(8);
        // 插入
        String insert="insert into example_address (id, name, phone_number, address, region_type, region_location, create_by, " +
                "create_time, update_by, update_time, deleted, delete_by, delete_time, version) " +
                "VALUES (?, ?, ?, ?, ?, NULL, NULL, ?, ?, ?, 0, NULL, NULL, 1)";
        int i=dao.execute(insert,id,"leefj","13852562523","宁波","国内",new Date(),"110", new Date());
        Logger.info("插入 ： "+i);
        // 更新
        i=dao.execute("update example_address set address=? where id=?","上海",id);
        Logger.info("更新 ： "+i);
        // 删除
        i=dao.execute("delete from example_address where id=?",id);
        Logger.info("删除 ： "+i);
    }

    /**
     * 2、对象化SQL语句的方式执行
     * */
    public static void  demo2() {
        // 请移步至 CRUDBySQLDemo 类查看
        CRUDBySQLDemo.main(new String[0]);
    }

    /**
     * 3、利用SQL对象的  ExecutableSQL 特性执行
     * */
    public static void  demo3() {

        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        // 生成 ID
        String id= IDGenerator.getNanoId(8);

        // 插入：通过 DAO 创建一个与 DAO 绑定的 Insert 语句对象
        int i=dao.insert("example_address")
                .set("id",id)
                .set("name","leefj")
                // 如果是 null 则不连入SQL语句
                .setIf("phone_number","13852562523")
                .set("address","宁波")
                .set("region_type","国内")
                .set("create_time",new Date())
                // 设置数据库表达式
                .setExpr("update_time","now()")
                // 执行语句
                .execute();
        Logger.info("插入 ： "+i);

        // 更新
        i=dao.update("example_address").set("address","上海")
                .where("id=?",id)
                // 返回至顶层的 Update 语句对象
                .top()
                .execute();
        Logger.info("更新 ： "+i);

        // 删除
        i=dao.delete("example_address")
                .where("id=?",id)
                // 返回至顶层的 Update 语句对象
                .top()
                .execute();
        Logger.info("删除 ： "+i);
    }

}
