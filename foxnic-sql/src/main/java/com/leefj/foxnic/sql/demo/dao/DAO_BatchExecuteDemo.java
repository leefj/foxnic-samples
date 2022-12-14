package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.commons.lang.ArrayUtil;
import com.github.foxnic.commons.lang.StringUtil;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.commons.log.PerformanceLogger;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.sql.expr.Expr;
import com.github.foxnic.sql.parameter.BatchParamBuilder;
import com.leefj.foxnic.sql.demo.config.DBInstance;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DAO_BatchExecuteDemo {


    public static void main(String[] args) {

        demo1();

    }

    /**
     * 批量执行
     * */
    public static void demo1() {

        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();

        // 准备插入的 SQL 语句
        String insert="insert into example_address " +
                "(id, name, phone_number, address, region_type, region_location, create_by, create_time, " +
                "update_by, update_time, deleted, delete_by, delete_time, version) " +
                "values (?, ?, ?, ?, ?, null, null, ?, ?, ?, 0, null, null, 1)";
        // 性能日志对象
        PerformanceLogger logger=new PerformanceLogger();
        // 性能采集埋点
        logger.collect("常规插入开始");
        for (int i = 0; i < 100; i++) {
            String id="batch-"+IDGenerator.getNanoId(6);
            dao.execute(insert,id,"leefj","13852562523","宁波","国内",new Date(),"110", new Date());
        }
        // 性能采集埋点
        logger.collect("常规插入结束");
        // 性能采集埋点
        logger.collect("批量插入开始");
        BatchParamBuilder paramBuilder=new BatchParamBuilder();
        for (int i = 0; i < 100; i++) {
            String id="batch-"+IDGenerator.getNanoId(6);
            paramBuilder.add(id,"leefj","13852562523","宁波","国内",new Date(),"110", new Date());
        }
        int[] result=dao.batchExecute(insert,paramBuilder.getBatchList());
        // 性能采集埋点
        logger.collect("批量插入结束");
        // 打印性能对比
        logger.info("执行效率对比");
        // 输出结果
        for (int i : result) {
            System.out.println("结果："+ i);
        }
    }

}
