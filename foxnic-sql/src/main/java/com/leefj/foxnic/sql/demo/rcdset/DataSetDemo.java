package com.leefj.foxnic.sql.demo.rcdset;

import com.github.foxnic.dao.data.DataSet;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.Test;

public class DataSetDemo {

    /**
     * DataSet
     */
    @Test
    public void demo_Column() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        // DataSet rs = dao.query("select * from sys_dict where code like ?", 50, 1, "%o%");
        // 输出列数
    }

}
