package com.leefj.foxnic.sql.demo.entity;

import com.alibaba.fastjson.JSON;
import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.dao.data.SaveMode;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.domain.example.Address;
import com.leefj.foxnic.sql.demo.domain.example.Goods;
import com.leefj.foxnic.sql.demo.domain.example.Order;
import com.leefj.foxnic.sql.demo.domain.example.meta.OrderMeta;

import java.math.BigDecimal;

public class EntityDemo {

    public static void main(String[] args) {
        demo_relation();
    }



    public static void demo_relation() {

        DAO dao = DBInstance.DEFAULT.dao();
        // 创建订单
        Order order=new Order();
        String orderId=IDGenerator.getSnowflakeIdString();
        order.setId(orderId);
        order.setOrderNo(IDGenerator.getNanoId(8));
        order.setAmount(new BigDecimal(800));
        // 创建订单的收件地址
        Address address=new Address();
        address.setId(IDGenerator.getSnowflakeIdString());
        address.setRegionType("国内");
        address.setRegionLocation("华东");
        address.setAddress("宁波");
        address.setName("LeeFJ");
        address.setPhoneNumber("13444025142");

        // 指定订单的地址ID
        order.setAddressId(address.getId());

        // 保存地址和订单
        dao.insertEntity(address);
        dao.insertEntity(order);

        // 从数据库查询订单
        Order orderFromDB=dao.queryEntityById(Order.class,orderId);
        // 使用 join 方法关联并填充地址对象
        dao.join(orderFromDB, OrderMeta.ADDRESS);

        // 打印输出的数据
        System.out.println(JSON.toJSON(orderFromDB));
        System.out.println(JSON.toJSON(orderFromDB.getAddress()));

    }

    public static void demo1() {
        DAO dao = DBInstance.DEFAULT.dao();
        // 创建实体对象，并设置属性值
        Goods goods = new Goods();
        String id = IDGenerator.getSnowflakeIdString();
        goods.setId(id)
                .setName("大红枣")
                .setPrice(new BigDecimal(2.5));
        // 插入数据
        dao.insertEntity(goods);
        // 查询数据
        goods = dao.queryEntityById(Goods.class,id);
        // 修改后保存
        goods.setPrice(new BigDecimal(2.6));
        dao.updateEntity(goods, SaveMode.DIRTY_FIELDS);
        // 再次查询
        goods = dao.queryEntityById(Goods.class, id);
        System.out.println(JSON.toJSON(goods));
    }


    public static void demo2() {
        DAO dao = DBInstance.DEFAULT.dao();
        Goods goods = new Goods();
        String id = IDGenerator.getSnowflakeIdString();
        goods.setId(id)
                .setName("大红枣").setPrice(new BigDecimal(2.5));
        System.out.println("插入前 : \n\t" + goods.getClass().getName() + "\n\t数据 : " + JSON.toJSON(goods) + "\n");
        dao.insertEntity(goods);
        System.out.println("插入后 : \n\t" + goods.getClass().getName() + "\n\t数据 : " + JSON.toJSON(goods) + "\n");
        goods = dao.queryEntityById(Goods.class,id);
        System.out.println("首次查询 : \n\t"+goods.getClass().getName()+"\n\t数据 : "+JSON.toJSON(goods)+"\n");
        goods.setPrice(new BigDecimal(2.6));
        dao.updateEntity(goods, SaveMode.DIRTY_FIELDS);
        goods = dao.queryEntityById(Goods.class, id);
        System.out.println("二次查询 : \n\t"+goods.getClass().getName()+"\n\t数据 : "+JSON.toJSON(goods)+"\n");
    }

}
