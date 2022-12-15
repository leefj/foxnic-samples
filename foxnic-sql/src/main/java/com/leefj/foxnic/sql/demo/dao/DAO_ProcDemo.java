package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.commons.collection.MapUtil;
import com.github.foxnic.dao.procedure.StoredFunction;
import com.github.foxnic.dao.procedure.StoredProcedure;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.sql.meta.DBDataType;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.Test;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.GenericStoredProcedure;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Types;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class DAO_ProcDemo {


    /**
     * 数据库函数调用测试
     * */
    @Test
    public void test_func() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        // 从 dao 拿到存储函数对象
        StoredFunction<BigDecimal> function =dao.getStoredFunction("demo_func",BigDecimal.class);
        // 按顺序传入参数
        BigDecimal result= function.execute(1.1,2.2);
        // 检查结果
        assertTrue(result.doubleValue()==3.30);
    }

    /**
     * 数据库存储过程调用测试
     * */
    @Test
    public void test_proc() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        // 从 dao 拿到存储过程对象
        StoredProcedure procedure =dao.getStoredProcedure("demo_proc");
        // 定义参数
        procedure.declareParameter("a", DBDataType.STRING);
        procedure.declareParameter("b", DBDataType.DECIMAL);
        procedure.declareOutParameter("c",DBDataType.DECIMAL);
        procedure.declareOutParameter("d",DBDataType.DECIMAL);
        // 传入 Map 类型参数
        Map<String,Object> result= procedure.execute(MapUtil.asMap("a",1.1,"b",2.2));
        // 获得多个返回值
        BigDecimal c=(BigDecimal) result.get("c");
        BigDecimal d=(BigDecimal) result.get("d");
        // 检查结果
        assertTrue(c.doubleValue()==3.30);
        assertTrue(d.doubleValue()==2.42);
    }

}
