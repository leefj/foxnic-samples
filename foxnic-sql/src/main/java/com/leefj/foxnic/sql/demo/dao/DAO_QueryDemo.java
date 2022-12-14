package com.leefj.foxnic.sql.demo.dao;

import com.alibaba.fastjson.JSON;
import com.github.foxnic.api.language.SuperLanguageService;
import com.github.foxnic.commons.collection.IPagedList;
import com.github.foxnic.commons.lang.DateUtil;
import com.github.foxnic.dao.data.PagedList;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.springboot.spring.SpringUtil;
import com.github.foxnic.sql.data.ExprRcd;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressVOMeta;
import com.leefj.foxnic.sql.demo.app.example.service.IAddressService;
import com.leefj.foxnic.sql.demo.app.example.service.impl.AddressServiceImpl;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.apache.commons.math3.analysis.function.Add;

import java.util.Date;
import java.util.List;

public class DAO_QueryDemo {

    public static void main(String[] args) {
        queryRcdSetNoPage();
        queryRcdSetPaginated();
        querySingleRcd();
        querySingleValue();
        queryPoListNoPage();
        queryPoListPaginated();
        querySinglePo();
    }

    /**
     * 1、查询不分页记录集
     * */
    public static void queryRcdSetNoPage() {
        // 通过 DBInstance 拿到 DAO 对象
        Date date= DateUtil.addDays(new Date(),-1000);
        DAO dao= DBInstance.DEFAULT.dao();
        // 执行查询
        RcdSet rs=dao.query("select * from sys_role where create_time>?",date);
        int i=0;
        // 遍历数据
        for (Rcd r : rs) {
            System.out.println(i+" - "+r.toJSONObject());
            i++;
        }

        // DAO 创建查询语句进行查询
        rs=dao.select().from("sys_role").where("create_time>?",date).top().query();
        i=0;
        // 遍历数据
        for (Rcd r : rs) {
            System.out.println(i+" - "+r.toJSONObject());
            i++;
        }
    }


    /**
     * 2、查询分页记录集
     * */
    public static void queryRcdSetPaginated() {
        // 通过 DBInstance 拿到 DAO 对象
        Date date= DateUtil.addDays(new Date(),-1000);
        DAO dao= DBInstance.DEFAULT.dao();
        // 指定分页大小
        Integer pageSize=10;
        // 模拟翻页动作：常规方式查询
        for (int pageIndex = 0; pageIndex < 10; pageIndex++) {
            // 执行分页查询
            RcdSet rs=dao.queryPage("select * from sys_resourze where create_time>?",pageSize,pageIndex,date);
            int i=0;
            // 遍历数据
            for (Rcd r : rs) {
                System.out.println("page "+pageIndex+"."+i+" - "+r.toJSONObject());
                i++;
            }
            // 输出分页信息
            System.out.println("total rows = "+rs.getTotalRowCount()+" ; total pages = "+rs.getPageCount()+"; pageIndex = "+rs.getPageIndex()+" ; pageSize = "+rs.getPageSize());
        }

        // 模拟翻页动作，QueryableSQL 方式查询
        for (int pageIndex = 0; pageIndex < 10; pageIndex++) {
            // 执行分页查询，QueryableSQL 方式
            RcdSet rs=dao.expr("select * from sys_resourze where create_time>?",date).queryPage(pageSize,pageIndex);
            int i=0;
            // 遍历数据
            for (Rcd r : rs) {
                System.out.println("page "+pageIndex+"."+i+" - "+r.toJSONObject());
                i++;
            }
            // 输出分页信息
            System.out.println("total rows = "+rs.getTotalRowCount()+" ; total pages = "+rs.getPageCount()+"; pageIndex = "+rs.getPageIndex()+" ; pageSize = "+rs.getPageSize());
        }
    }

    /**
     * 3、查询单个记录
     * */
    public static void querySingleRcd() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        String roleId="631081950060216320";
        // 常规方式查询
        Rcd r=dao.queryRecord("select * from sys_role where id=?",roleId);
        System.out.println("role-1 = "+r.toJSONObject());
        // QueryableSQL 方式查询
        r=dao.select().from("sys_role").where("id=?",roleId).top().queryRecord();
        System.out.println("role-2 = "+r.toJSONObject());
    }

    /**
     * 4、查询单个值
     * */
    public static void querySingleValue() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        String roleId="631081950060216320";
        // 常规方式查询
        Integer count=dao.queryInteger("select count(1) from sys_role where id=?",roleId);
        System.out.println("count-1 = "+count);
        // QueryableSQL 方式查询
        count=dao.select().select("count(1)").from("sys_role").where("id=?",roleId).top().queryInteger();
        System.out.println("count-2 = "+count);
    }


    /**
     * 5、查询不分页实体集
     * */
    public static void queryPoListNoPage() {
        // 通过 DBInstance 拿到 DAO 对象
        Date date= DateUtil.addDays(new Date(),-1000);
        DAO dao= DBInstance.DEFAULT.dao();
        // 执行查询
        List<Address> list=dao.queryEntities(Address.class,"select * from example_address where create_time>?",date);
        int i=0;
        // 遍历数据
        for (Address address : list) {
            System.out.println(i+" - "+ JSON.toJSONString(address));
            i++;
        }

        // DAO 创建查询语句进行查询
        list=dao.select().from("example_address").where("create_time>?",date).top().queryEntities(Address.class);
        i=0;
        // 遍历数据
        for (Address address : list) {
            System.out.println(i+" - "+ JSON.toJSONString(address));
            i++;
        }
    }


    /**
     * 6、查询分页实体集
     * */
    public static void queryPoListPaginated() {
        // 通过 DBInstance 拿到 DAO 对象
        Date date= DateUtil.addDays(new Date(),-1000);
        DAO dao= DBInstance.DEFAULT.dao();
        // 指定分页大小
        Integer pageSize=10;
        // 模拟翻页动作：常规方式查询
        for (int pageIndex = 0; pageIndex < 10; pageIndex++) {
            // 执行分页查询
            PagedList<Address> list=dao.queryPagedEntities(Address.class,pageSize,pageIndex,"select * from sys_resourze where create_time>?",date);
            int i=0;
            // 遍历数据
            for (Address address : list) {
                System.out.println(i+" - "+ JSON.toJSONString(address));
                i++;
            }
            // 输出分页信息
            System.out.println("total rows = "+list.getTotalRowCount()+" ; total pages = "+list.getPageCount()+"; pageIndex = "+list.getPageIndex()+" ; pageSize = "+list.getPageSize());
        }

        // 模拟翻页动作，QueryableSQL 方式查询
        for (int pageIndex = 0; pageIndex < 10; pageIndex++) {
            // 执行分页查询，QueryableSQL 方式
            IPagedList<Address> list=dao.expr("select * from sys_resourze where create_time>?",date).queryPagedEntities(Address.class,pageSize,pageIndex);
            int i=0;
            // 遍历数据
            for (Address address : list) {
                System.out.println(i+" - "+ JSON.toJSONString(address));
                i++;
            }
            // 输出分页信息
            System.out.println("total rows = "+list.getTotalRowCount()+" ; total pages = "+list.getPageCount()+"; pageIndex = "+list.getPageIndex()+" ; pageSize = "+list.getPageSize());
        }
    }

    /**
     * 7、查询单个实体
     * */
    public static void querySinglePo() {
        // 通过 DBInstance 拿到 DAO 对象
        DAO dao= DBInstance.DEFAULT.dao();
        String addressId="651345265952817152";
        // 常规方式查询
        Address address=dao.queryEntityById(Address.class,addressId);
        System.out.println("address-1 = "+JSON.toJSONString(address));
        // QueryableSQL 方式查询
        address=dao.select().from("sys_role").where("id=?",addressId).top().queryEntity(Address.class);
        System.out.println("address-2 = "+JSON.toJSONString(address));
        // Sample 方式查询
        address=new Address();
        address.setId(addressId);
        address=dao.queryEntity(address);
        System.out.println("address-3 = "+JSON.toJSONString(address));
    }







}
