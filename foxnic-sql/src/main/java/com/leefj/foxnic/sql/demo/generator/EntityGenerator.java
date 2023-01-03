package com.leefj.foxnic.sql.demo.generator;

import com.github.foxnic.commons.project.maven.MavenProject;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.generator.builder.model.PoClassFile;
import com.github.foxnic.generator.config.ModuleContext;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.domain.example.Goods;
import com.leefj.foxnic.sql.demo.app.domain.example.Order;
import com.leefj.foxnic.sql.demo.app.domain.example.OrderItem;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables;

/**
 * 实体类生成器
 * */
public class EntityGenerator {
    public static interface  Config  {
        void config(PoClassFile poType);
    }

    private static final String BASE_PACKAGE = "com.leefj.foxnic.sql.demo.app";

    /**
     * 需要首先运行 ExampleDBMetaGenerator 生成 ExampleTables 类
     * */
    public static void main(String[] args) {
        EntityGenerator generator = new EntityGenerator();
        // 生成商品实体类
        generator.generate(ExampleTables.EXAMPLE_GOODS.$TABLE, poType -> {
            // Goods 对象 通过 orderList 属性持有 Order
            poType.addListProperty(Goods.class,"orderList","订单明细商品","订单明细商品");
            // Goods 对象 通过 addressList 属性持有 Address
            poType.addListProperty(Address.class,"addressList","收件地址","收件地址，包括收件人以及手机号码");
            // Goods 对象 通过 itemList 属性持有 OrderItem
            poType.addListProperty(OrderItem.class,"itemList","订单明细","订单明细");
        });
        // 生成订单实体类
        generator.generate(ExampleTables.EXAMPLE_ORDER.$TABLE , poType -> {
            // Order 对象 通过 goodsList 属性持有 Goods
            poType.addListProperty(Goods.class,"goodsList","订单明细商品","订单明细商品");
            // Order 对象 通过 address 属性持有 Address
            poType.addSimpleProperty(Address.class,"address","收件地址","收件地址，包括收件人以及手机号码");
            // Order 对象 通过 itemList 属性持有 OrderItem
            poType.addListProperty(OrderItem.class,"itemList","订单明细","订单明细");
        });
        // 生成订单明细实体类
        generator.generate(ExampleTables.EXAMPLE_ORDER_ITEM.$TABLE, poType -> {
            // OrderItem 对象 通过 goodsList 属性持有 Goods
            poType.addSimpleProperty(Goods.class,"goods","订单明细商品","订单明细商品");
            // OrderItem 对象 通过 address 属性持有 Address
            poType.addSimpleProperty(Address.class,"address","收件地址","收件地址，包括收件人以及手机号码");
            // OrderItem 对象 通过 order 属性持有 Order
            poType.addListProperty(Order.class,"order","订单","订单");
        });
        // 生成地址实体类
        generator.generate(ExampleTables.EXAMPLE_ADDRESS.$TABLE, poType -> {
            // Address 对象 通过 goodsList属性 持有 Goods
            poType.addListProperty(Goods.class,"goodsList","订单明细商品","订单明细商品");
            // Address 对象 通过 orderList 持有 Order
            poType.addListProperty(Address.class,"orderList","收件地址","收件地址，包括收件人以及手机号码");
            // Address 对象 通过 itemList 持有 OrderItem
            poType.addListProperty(OrderItem.class,"itemList","订单明细","订单明细");
        });
    }
    /**
     * 按表生成
     * */
    public void generate(DBTable table) {
        generate(table,null);
    }
    /**
     * 按表生成
     * */
    public void generate(DBTable table,Config config) {
        DAO dao = DBInstance.DEFAULT.dao();
        MavenProject project = GeneratorUtil.getProject();
        String pkg = table.name().split("_")[0];
        String prefix = pkg + "_";
        ModuleContext context = new ModuleContext(GeneratorUtil.initGlobalSettings(),table,prefix,BASE_PACKAGE + "." + pkg);
        context.setDomainProject(project);
        context.setServiceProject(project);
        context.setDAO(dao);
        if(config!=null) {
            config.config(context.getPoClassFile());
        }
        context.buildPo();
        context.buildVo();
        context.buildService();
    }
}
