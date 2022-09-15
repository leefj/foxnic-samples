package org.github.foxnic.web.generator.module;

import com.github.foxnic.commons.io.FileUtil;
import com.github.foxnic.generator.util.ModuleCodeGenerator;
import org.github.foxnic.web.generator.data.DataGenerator;
import org.github.foxnic.web.generator.module.example.ExampleAddressConfig;
import org.github.foxnic.web.generator.module.example.ExampleGoodsConfig;

import java.io.File;

public class WebFullCodeStarter extends ModuleCodeGenerator {

    public static void main(String[] args) {

        File f=FileUtil.resolveByClass(DataGenerator.class);
        System.out.println(f.getAbsolutePath());

        WebFullCodeStarter g=new WebFullCodeStarter();
        g.initModules();
        g.start();
    }

    public void initModules() {
        initExampleModules();
    }



    private void initExample2Modules() {
        // this.addConfig(new ExampleNewsConfig());
    }

    private void initExampleModules() {
//        this.addConfig(new CodeExampleConfig());
//        this.addConfig(new CodeExampleRoleConfig());
//        this.addConfig(new CodeExampleStudentConfig());
//        this.addConfig(new CodeExampleCarConfig());
//        this.addConfig(new CodeExampleMulitPkConfig());

//        this.addConfig(new ExampleOrderConfig());
//        this.addConfig(new ExampleOrderItemConfig());
        this.addConfig(new ExampleGoodsConfig());
        this.addConfig(new ExampleAddressConfig());

    }

}
