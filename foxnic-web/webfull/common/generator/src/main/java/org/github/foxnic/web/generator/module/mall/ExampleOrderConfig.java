package org.github.foxnic.web.generator.module.mall;

import com.github.foxnic.generator.builder.business.option.ServiceOptions;
import com.github.foxnic.generator.builder.model.PoClassFile;
import com.github.foxnic.generator.builder.model.VoClassFile;
import com.github.foxnic.generator.builder.view.option.*;
import com.github.foxnic.generator.config.WriteMode;
import com.leefj.webfull.constants.db.WebFullTables.WEBFULL_EXAMPLE_ORDER;
import com.leefj.webfull.domain.example.Address;
import com.leefj.webfull.domain.example.meta.OrderMeta;
import com.leefj.webfull.proxy.example.AddressServiceProxy;
import org.github.foxnic.web.generator.module.BaseCodeConfig;


public class ExampleOrderConfig extends BaseCodeConfig<WEBFULL_EXAMPLE_ORDER> {


    /**
     * 配置模型，为 po 和 vo 添加 额外的属性等
     */
    @Override
    public void configModel(PoClassFile poType, VoClassFile voType) {

        poType.addSimpleProperty(Address.class,"address","收件地址","关联的收件地址对象");

    }

    /**
     * 配置字段
     */
    @Override
    public void configFields(ViewOptions view) {

        // ID 字段通常隐藏
        view.field(WEBFULL_EXAMPLE_ORDER.ID).basic().hidden();

        // NAME 字段，单行文本框
        view.field(WEBFULL_EXAMPLE_ORDER.ORDER_NO)
                // 搜索栏：设置模糊搜索
                .search().fuzzySearch()
                // 表格列：指定对齐方式
                .table().alignLeft()
                // 表单：指定表单编辑器为文本输入框，并指定默认值
                .form().textInput()
                // 表单校验：必填
                .form().validate().required()
        ;

        // NAME 字段，单行文本框
        view.field(WEBFULL_EXAMPLE_ORDER.ADDRESS_ID)
                .basic().label("收件地址")
                // 搜索栏：设置模糊搜索
                // .search().range()
                // 表格列：指定对齐方式
                //.table().fillBy(OrderMeta.ADDRESS,AddressMeta.ADDRESS)
                // 表单：指定表单编辑器为文本输入框，并指定默认值
                .form().selectBox()
                .queryApi(AddressServiceProxy.QUERY_LIST).valueField("id").textField("address")
                .fillWith(OrderMeta.ADDRESS)
                // 表单校验：必填
                .form().validate().required()
        ;




    }

    /**
     * 配置搜索
     */
    @Override
    public void configSearch(ViewOptions view, SearchAreaOptions search) {

        // 搜索布局
        search.inputLayout(new Object[]{
                WEBFULL_EXAMPLE_ORDER.ORDER_NO
        });
//
//
//
//        // 设置标签宽度
//        search.labelWidth(1,65);
//        // 设置标签宽度
//        search.labelWidth(2,75);
//        // 设置标签宽度
//        search.labelWidth(3,75);
//
//        // 个别输入框宽度调整
//        view.field(WEBFULL_EXAMPLE_ORDER.ADDRESS).search().inputWidth(296);


    }

    /**
     * 配置 List 表格
     */
    @Override
    public void configList(ViewOptions view, ListOptions list) {
        list.operationColumn().addActionButton("明细","openItems");
    }

    /**
     * 配置表单
     */
    @Override
    public void configForm(ViewOptions view, FormOptions form, FormWindowOptions formWindow) {

        formWindow.width("800px");

        form.labelWidth(85);





    }




    /**
     * 配置源码覆盖
     */
    @Override
    public void configOverrides() {
        //文件生成覆盖模式
        context.overrides()
                .setServiceIntfAnfImpl(WriteMode.COVER_EXISTS_FILE) //服务与接口
                .setControllerAndAgent(WriteMode.COVER_EXISTS_FILE) //Rest
                .setPageController(WriteMode.COVER_EXISTS_FILE) //页面控制器
                .setFormPage(WriteMode.COVER_EXISTS_FILE) //表单HTML页
                .setListPage(WriteMode.COVER_EXISTS_FILE) //列表HTML页
                .setExtendJsFile(WriteMode.COVER_EXISTS_FILE);
    }

    /**
     * 配置服务代码
     */
    @Override
    public void configService(ServiceOptions service) {

    }









    public ExampleOrderConfig() {
        super("webfull-service-example", WEBFULL_EXAMPLE_ORDER.$TABLE, "webfull_example_", 3);
    }


}
