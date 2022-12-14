package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.sql.expr.Expr;
import com.github.foxnic.sql.expr.SQL;
import com.leefj.foxnic.sql.demo.config.DBInstance;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DAO_MulitExecuteDemo {


    public static void main(String[] args) {

        demo1();

    }

    /**
     * 多个语句一起执行，这些语句在一个事务内
     * */
    public static void demo1() {

        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        // 生成 ID
        String id= IDGenerator.getNanoId(8);
        // 插入
        Expr insert=new Expr("insert into example_address (id, name, phone_number, address, region_type, region_location, create_by, create_time, update_by, update_time, deleted, delete_by, delete_time, version) " +
                "VALUES (?, ?, ?, ?, ?, NULL, NULL, ?, ?, ?, 0, NULL, NULL, 1)",
                id,"leefj","13852562523","宁波","国内",new Date(),"110", new Date());
        Expr update=new Expr("update example_address set address=? where id=?","上海",id);
        Expr delete=new Expr("delete from example_address where id=?",id);
        // 事务内同时执行多个语句，多参数并列
        Integer result=dao.multiExecute(insert,update,delete);
        // 把多个语句单独执行时影响的行数累加后返回
        Logger.info("result = "+result);

        // 产生一个 SQL 对象与字符串混合的 List
        String sqlstr="delete from example_address where id='"+id+"'";
        List sqls= Arrays.asList(insert,update,delete,sqlstr);
        // 事务内同时执行多个语句，传入列表，
        result=dao.multiExecute(sqls);
        // 把多个语句单独执行时影响的行数累加后返回
        Logger.info("result = "+result);

    }

}
