package com.leefj.foxnic.sql.demo.meta;

import com.github.foxnic.dao.meta.DBColumnMeta;
import com.github.foxnic.dao.meta.DBTableMeta;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class DBMetaDemo {

    public static void main(String[] args) {

        // 创建DAO
        DAO dao=DBInstance.DEFAULT.dao();
        // 获得所有表名
        String[] tableNames=dao.getTableNames();
        // 遍历表名
        for (String tableName : tableNames) {
            System.out.println(tableName);
        }
        // 获得指定表的元数据
        DBTableMeta tm=dao.getTableMeta("sys_user");
        // 遍历列
        for (DBColumnMeta column : tm.getColumns()) {
            System.out.println(column.getColumn()+"\t"+column.getLabel());
        }

    }

}
