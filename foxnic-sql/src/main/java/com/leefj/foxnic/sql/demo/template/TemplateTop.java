package com.leefj.foxnic.sql.demo.template;

import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.sql.loader.SQLoader;
import com.github.foxnic.sql.expr.Expr;
import com.github.foxnic.sql.expr.SQLTpl;
import com.github.foxnic.sql.meta.DBType;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class TemplateTop {

    public void initSQLoader(DAO dao) {
        // 设置SQL扫描范围
        SQLoader.addTQLScanPackage(dao, TemplateTop.class.getPackage().getName());
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


    /**
     * 简单示例
     * */
    @Test
    public void demo_0() {
        // 创建 DAO
        DAO dao = DBInstance.DEFAULT.dao();
        // 初始化 SQLoader
        initSQLoader(dao);
        String result = null;
        // 执行当前包下的语句
        result = dao.queryString("#query_0");
        System.out.println(result);
    }

    /**
     * 执行特定数据库的语句
     * */
    @Test
    public void  demo_1_dbType() {
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

    /**
     * 获取并处理模板对象
     * */
    @Test
    public void  demo_2_template() {
        // 创建 DAO
        DAO dao= DBInstance.DEFAULT.dao();
        // 初始化 SQLoader
        initSQLoader(dao);
        // 获得模板对象
        SQLTpl template= dao.getTemplate("#top_query_3");
        // 设置模板变量
        template.putVar("fields",new String[]{"itm.code","label"});
        // 设置 SQL 置换对象
        template.putVar("QUESTION_LIST_1",new Expr("and itm.label like ?","%修%"));
        template.putVar("QUESTION_LIST_2",new Expr("and itm.code like ?","%r%"));
        // 设置模板中的 SQL 绑定变量
        template.setParameters("%e%","%r%",1);
        // 输出
        System.out.println(template.getSQL());
        // 执行查询，利用 QueryableSQL 接口特性
        RcdSet rs=template.query();
        // 遍历与输出
        for (Rcd r : rs) {
            System.out.println(r.toJSONObject());
        }
    }



}
