package com.leefj.foxnic.sql.demo.meta;

import com.github.foxnic.commons.lang.StringUtil;
import com.github.foxnic.dao.meta.DBColumnMeta;
import com.github.foxnic.dao.meta.DBIndexMeta;
import com.github.foxnic.dao.meta.DBMetaData;
import com.github.foxnic.dao.meta.DBTableMeta;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class DBMetaDemo {

    public static void main(String[] args) {

        demo_1();

    }

    public static void demo_1() {
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
        // 构建索引元数据
        DBMetaData.buildIndex(dao, tm.getTableName(),tm);
        // 获得与遍历索引信息
        for (DBIndexMeta index : tm.getIndexs()) {
            System.out.println("index : "+index.getName()+",unique="+index.isUnique()+",columns="+ StringUtil.join(index.getFields()));
        }
        // 刷新特定表的元数据缓存
        dao.refreshMeta("sys_user");
        // 刷新元数据缓存
        dao.refreshMeta();
    }

}
