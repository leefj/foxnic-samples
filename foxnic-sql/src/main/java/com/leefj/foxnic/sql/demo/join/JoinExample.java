package com.leefj.foxnic.sql.demo.join;

import com.alibaba.fastjson.JSON;
import com.github.foxnic.commons.json.JSONUtil;
import com.github.foxnic.dao.entity.FieldsBuilder;
import com.github.foxnic.dao.spec.DAO;
import com.leefj.foxnic.sql.demo.app.domain.example.Order;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta;
import com.leefj.foxnic.sql.demo.app.example.service.IOrderService;
import com.leefj.foxnic.sql.demo.app.example.service.impl.OrderServiceImpl;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables;
import org.junit.Test;

import java.util.List;

public class JoinExample {


    /**
     * 通过 Service 的 Join 方法完成属性数据的填充操作
     * */
    @Test
    public void demo_1() {
        // 获得 Service
        IOrderService orderService=DBInstance.DEFAULT.getService(OrderServiceImpl.class);
        // 查询所有订单
        List<Order> orders= orderService.queryList(new Order());
        // 填充订单属性
        orderService.join(orders, OrderMeta.ADDRESS,OrderMeta.ITEM_LIST,OrderMeta.GOODS_LIST);
        // 输出填属性填充后的订单列表
        System.out.println(JSONUtil.format(JSONUtil.toJSONArray(orders)));
    }

    /**
     * 通过 DAO 对象的 fill...with 方法完成属性数据的填充
     * */
    @Test
    public void demo_2() {
        // 获得 Service
        IOrderService orderService=DBInstance.DEFAULT.getService(OrderServiceImpl.class);
        // 查询所有订单
        List<Order> orders= orderService.queryList(new Order());
        DAO dao=orderService.dao();
        // 通过 dao 的 fill 方法填充 orders 列表里面元素的扩展属性
        dao.fill(orders)
                // 填充 orders 里面每个元素的 address 属性
                .with(OrderMeta.ADDRESS)
                // 填充 orders 里面每个元素的 itemList 属性
                .with(OrderMeta.ITEM_LIST)
                // 填充 orders 里面每个元素的 goodsList 属性
                .with(OrderMeta.GOODS_LIST)
                // 执行最终的 join 操作
                .execute();
        // 输出填属性填充后的订单列表
        System.out.println(JSONUtil.format(JSONUtil.toJSONArray(orders)));
    }

    /**
     * 通过 DAO 对象的 fill...with 方法完成属性数据的级联填充
     * */
    @Test
    public void demo_3() {
        // 获得 Service
        IOrderService orderService=DBInstance.DEFAULT.getService(OrderServiceImpl.class);
        // 查询所有订单
        List<Order> orders= orderService.queryList(new Order());
        DAO dao=orderService.dao();
        // 通过 dao 的 fill 方法填充 orders 列表里面元素的扩展属性
        dao.fill(orders)
                // 填充 orders 里面每个元素的 address 属性，并填充  address 属性的 orderList 属性
                .with(OrderMeta.ADDRESS,AddressMeta.ORDER_LIST)
                // 填充 orders 里面每个元素的 address 属性，并填充  address 属性的 goodsList 属性
                .with(OrderMeta.ADDRESS,AddressMeta.GOODS_LIST)
                // 填充 orders 里面每个元素的 itemList 属性
                .with(OrderMeta.ITEM_LIST)
                // 填充 orders 里面每个元素的 goodsList 属性
                .with(OrderMeta.GOODS_LIST)
                // 执行最终的 join 操作
                .execute();
        // 输出填属性填充后的订单列表
        System.out.println(JSONUtil.format(JSONUtil.toJSONArray(orders)));
    }

    /**
     * 通过 DAO 对象的 fill...with 方法完成属性数据的填充，并用 fields 指定查询字段
     * */
    @Test
    public void demo_4() {
        // 获得 Service
        IOrderService orderService=DBInstance.DEFAULT.getService(OrderServiceImpl.class);
        // 查询所有订单
        List<Order> orders= orderService.queryList(new Order());
        DAO dao=orderService.dao();
        // 构建 Order 对象需要查询的字段
        FieldsBuilder orderFields=FieldsBuilder.build(dao, ExampleTables.EXAMPLE_ORDER.$TABLE);
        orderFields.addAll().removeDBTreatyFields();
        // 构建 address 对象需要的字段
        FieldsBuilder addressFields=FieldsBuilder.build(dao, ExampleTables.EXAMPLE_ADDRESS.$TABLE);
        addressFields.addAll().removeDBTreatyFields();
        // 通过 dao 的 fill 方法填充 orders 列表里面元素的扩展属性
        dao.fill(orders)
                // 填充 orders 里面每个元素的 address 属性
                .with(OrderMeta.ADDRESS)
                // 填充 orders 里面每个元素的 itemList 属性
                .with(OrderMeta.ITEM_LIST)
                // 填充 orders 里面每个元素的 goodsList 属性
                .with(OrderMeta.GOODS_LIST)
                // 指定字段
                .fields(orderFields,addressFields)
                // 执行最终的 join 操作
                .execute();
        // 输出填属性填充后的订单列表
        System.out.println(JSONUtil.format(JSONUtil.toJSONArray(orders)));
    }


}
