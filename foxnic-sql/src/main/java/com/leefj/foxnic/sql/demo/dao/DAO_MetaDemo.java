package com.leefj.foxnic.sql.demo.dao;

import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class DAO_MetaDemo {

    public static void main(String[] args) {
        demo_1();
        System.out.println("-----------------------------------------");
        demo_2();
    }


    /**
     * DAO 查询示例
     * */
    public static void demo_1() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao=DBInstance.DEFAULT.dao();
        // 执行查询
        Integer value = dao.queryInteger("select ?",9090);
        // 输出结果
        System.out.println("value = "+value);
        // 输出 value = 9090
    }

    /**
     * DAO 删除校验实例 , 在  DBTreaty.setAllowDeleteWithoutWhere 控制。
     * */
    public static void demo_2() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao=DBInstance.DEFAULT.dao();
        // 执行查询
        dao.execute("delete from mytable");
        // 抛出异常 : 当前执行的语句 delete from mytable , 缺少 where 条件
    }



}
