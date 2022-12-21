package com.leefj.foxnic.sql.demo.tpl.module1;

import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.sql.loader.SQLoader;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.tpl.TplTop;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TplM1 extends TplTop {

    @Test
    public void  scope_demo_in_M1() {
        // 创建 DAO
        DAO dao= DBInstance.DEFAULT.dao();
        // 初始化 SQLoader
        initSQLoader(dao);
        //
        String result = null;
        result = dao.queryString("#query_0");
        System.out.println(result);
        assertTrue("module1@query_0".equals(result));

        result = dao.queryString("#m1_query_1");
        System.out.println(result);
        assertTrue("module1@query_1".equals(result));

        // 允许执行上级级包内定义的语句
        result = dao.queryString("#top_query_1");
        System.out.println(result);
        assertTrue("moduleTop@query_1".equals(result));

        // 不允许执行其它同级包内定义的语句
        try {
            dao.queryString("#m2_query_1");
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }

    }



}
