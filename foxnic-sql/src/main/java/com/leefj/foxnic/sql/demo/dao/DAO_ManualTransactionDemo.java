package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.sql.expr.Insert;
import com.github.foxnic.sql.expr.Select;
import com.leefj.foxnic.sql.demo.config.DBInstance;

import java.util.Date;

public class DAO_ManualTransactionDemo {

    public static void main(String[] args) {
        demo1(true);
        demo1(false);
    }

    /**
     * 1、查询不分页记录集
     * */
    public static void demo1(boolean exp) {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao=DBInstance.DEFAULT.dao();
        String id = null;
        try {
            // 启动事务
            dao.beginTransaction();
            System.out.println("开始事务");
            // 插入数据
            id=insertAddress(dao,"13777-"+exp);
            if(exp) {
                throw new RuntimeException("模拟异常");
            }
            // 提交
            dao.commit();
            System.out.println("提交事务");
        } catch (Exception e) {
            // 回滚
            dao.rollback();
            System.out.println("回滚事务");
        }

        Rcd address=queryAddress(dao,id);
        if(address==null) {
            System.out.println("数据未插入");
        } else {
            System.out.println("数据已插入");
        }
    }

    /**
     * 插入数据
     * */
    public static String insertAddress(DAO dao,String phone) {
        // 创建语句对象
        Insert insert=new Insert("example_address");
        String id= IDGenerator.getSnowflakeIdString();
        // 设置值
        insert.set("id",id)
                .set("name","leefj")
                // 如果是 null 则不连入SQL语句
                .setIf("phone_number",phone)
                .set("address","宁波")
                .set("region_type","国内")
                .set("create_time",new Date())
                // 设置数据库表达式
                .setExpr("update_time","now()");
        // 输出语句
        System.out.println(insert.getSQL());
        // 执行语句
        Integer suc=dao.execute(insert);
        // 如果执行成功，返回ID，否则返回 null
        if(suc==1) {
            return id;
        } else {
            return null;
        }
    }

    /**
     * 查询
     * */
    public static Rcd queryAddress(DAO dao,String id) {
        // 创建语句对象
        Select select=new Select("example_address");
        // 设置值
        select.where().and("id=?",id);
        // 输出语句
        System.out.println(select.getSQL());
        // 执行语句
        Rcd address=dao.queryRecord(select);
        // 如果执行成功，返回记录对象，否则返回 null
        return address;
    }
}
