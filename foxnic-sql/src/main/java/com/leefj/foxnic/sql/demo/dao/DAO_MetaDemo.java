package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.meta.DBMetaDemo;

public class DAO_MetaDemo {

    public static void main(String[] args) {
        demo_1();
        System.out.println("-----------------------------------------");
        demo_2();
        System.out.println("-----------------------------------------");
        try {
            demo_3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------");
        demo_4();
    }

    /**
     * DAO 打印基本信息
     * */
    public static void demo_1() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao=DBInstance.DEFAULT.dao();
        // 当前连接的 Schema
        System.out.println("schema = "+dao.getSchema());
        // 当前连接字符串
        System.out.println("url = "+dao.getUrl());
        // 当前登录的账户
        System.out.println("userName = "+dao.getUserName());
        // 输出数据库类型
        System.out.println("dbType = "+dao.getDBType());
        // 数据库 SQL 方言
        System.out.println("dialect = "+dao.getSQLDialect());
        // 数据库时间
        System.out.println("now = "+dao.getDateTime());
        // 连接标识
        System.out.println("dbId = "+dao.getDBConnectionIdentity());
        // 数据库标识
        System.out.println("dbId = "+dao.getDbIdentity());
        // 最后执行的 SQL 语句
        System.out.println("lastSQL = "+dao.getLatestSQL());
        // 最后执行的 SQL 语句
        System.out.println("lastSQLStr = "+dao.getLatestSQLString());
        // 最大查询数量限制
        System.out.println("queryLimit = "+dao.getQueryLimit());
        // 逻辑值
        System.out.println("true value in db is "+dao.getDBTreatyLogicValue(true));
        System.out.println("false value in db is "+dao.getDBTreatyLogicValue(false));
    }

    /**
     * 表解结构元数据示例
     * */
    public static void demo_2() {
        // 其它元数据请移步
        DBMetaDemo.demo_1();
    }

    /**
     * 校验单次查询数量，需要 dao.setQueryLimit() 方法设置
     * */
    public static void demo_3() {
        RcdSet rs=DBInstance.DEFAULT.dao().query("select * from sys_menu limit 100");
        // 异常：查询结果行数超过 queryLimit 限制，当前限制为 20
        System.out.println(rs.size());
    }


    /**
     * SQL 日志打印控制
     * */
    public static void demo_4() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao=DBInstance.DEFAULT.dao();
        // 输出日志
        dao.query("select * from sys_dict where deleted = ? and code =? ",0,"sex");
        // 在线程内暂停日志打印
        dao.pausePrintThreadSQL();
        // 无日志输出
        dao.query("select 2");
        // 继续打印日志i
        dao.resumePrintThreadSQL();
        // 输出日志
        dao.query("select 3");
    }


}
