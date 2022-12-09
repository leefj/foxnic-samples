package com.leefj.foxnic.sql.demo.generator;


import com.github.foxnic.commons.project.maven.MavenProject;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.generator.builder.business.ServiceInterfaceFile;
import com.github.foxnic.generator.builder.model.PoClassFile;
import com.github.foxnic.generator.config.ModuleContext;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.domain.example.Goods;
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

    private DAO dao = null;

    /**
     * 需要首先运行 ExampleDBMetaGenerator 生成 ExampleTables 类
     * */
    public static void main(String[] args) {
        EntityGenerator generator = new EntityGenerator();
        //
        generator.generate(ExampleTables.EXAMPLE_GOODS.$TABLE);
        //
        generator.generate(ExampleTables.EXAMPLE_ORDER.$TABLE , poType -> {
            poType.addListProperty(Goods.class,"goodsList","订单明细商品","订单明细商品");
            poType.addSimpleProperty(Address.class,"address","收件地址","收件地址，包括收件人以及手机号码");
            poType.addListProperty(OrderItem.class,"itemList","订单明细","订单明细");
        });
        //
        generator.generate(ExampleTables.EXAMPLE_ORDER_ITEM.$TABLE);
        //
        generator.generate(ExampleTables.EXAMPLE_ADDRESS.$TABLE);
    }

    public EntityGenerator() {
        dao = DBInstance.DEFAULT.dao();
    }

    public void generate(DBTable table) {
        generate(table,null);
    }
    public void generate(DBTable table,Config config) {
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
