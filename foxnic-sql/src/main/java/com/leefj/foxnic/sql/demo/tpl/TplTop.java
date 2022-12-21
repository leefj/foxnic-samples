package com.leefj.foxnic.sql.demo.tpl;

import com.github.foxnic.commons.bean.BeanUtil;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.sql.loader.SQLoader;
import com.github.foxnic.springboot.spring.SpringUtil;
import com.github.foxnic.sql.expr.SQL;
import com.github.foxnic.sql.meta.DBType;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TplTop {

    public void initSQLoader(DAO dao) {
        // 设置SQL扫描范围
        SQLoader.addTQLScanPackage(dao, TplTop.class.getPackage().getName());
        SQLoader.setPrintDetail(true);
    }

    @Test
    public void  scope_demo_in_Top() {
        // 创建 DAO
        DAO dao= DBInstance.DEFAULT.dao();
        // 初始化 SQLoader
        initSQLoader(dao);
        String result = null;
        // 执行当前包下的语句
        result = dao.queryString("#query_0");
        System.out.println(result);
        assertTrue("moduleTop@query_0".equals(result));
        // 不允许执行下级包内定义的语句
        try {
            dao.queryString("#m1_query_1");
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void  demo_4_dbType() {
        // 创建 DAO
        DAO dao= DBInstance.DEFAULT.dao();
        // 初始化 SQLoader
        initSQLoader(dao);
        String result = null;
        // 执行当前包下的语句
        result = dao.queryString("#top_query_2");
        System.out.println(result);
        if(dao.getDBType()== DBType.MYSQL) {
            assertTrue("moduleTop@query_2#mysql".equals(result));
        } else {
            assertTrue("moduleTop@query_2#default".equals(result));
        }
    }

}
