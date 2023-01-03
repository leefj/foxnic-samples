package com.leefj.foxnic.sql.demo.excel;


import com.github.foxnic.commons.collection.MapUtil;
import com.github.foxnic.commons.io.FileUtil;
import com.github.foxnic.commons.lang.DateUtil;
import com.github.foxnic.commons.project.maven.MavenProject;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.data.SaveMode;
import com.github.foxnic.dao.excel.ExcelReader;
import com.github.foxnic.dao.excel.ExcelStructure;
import com.github.foxnic.dao.excel.ExcelWriter;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.sql.SQLBuilder;
import com.github.foxnic.sql.GlobalSettings;
import com.github.foxnic.sql.dialect.SQLDialect;
import com.github.foxnic.sql.expr.Expr;
import com.github.foxnic.sql.expr.Insert;
import com.github.foxnic.sql.expr.Update;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.Test;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExcelDemo {


    /**
     * 导入 Excel
     * */
    @Test
    public void  importExcel() throws Exception {
        // 获得 DAO 对象
        DAO dao = DBInstance.DEFAULT.dao();
        // 获得导入的 Excel 文件
        MavenProject project=new MavenProject(this.getClass());
        File xlsx= FileUtil.resolveByPath(project.getSourceFile(this.getClass()).getParentFile() ,"data.xlsx");
        // 构建 Excel 列 与 表字段的对应关系
        ExcelStructure es=new ExcelStructure();
        es.addColumn("A","id");
        es.addColumn("B","name");
        es.addColumn("C","price");
        es.addColumn("D","create_time");
        //  从第二行开始读取
        es.setDataRowBegin(2);
        // 读取 Excel
        ExcelReader reader=new ExcelReader(xlsx);
        // 读取到 RcdSet
        RcdSet rs = reader.read("水果",es);
        // 遍历
        for (Rcd r : rs) {
            // 输出数据
            System.out.println(r.toJSONObject());
            // 生成 Insert 语句
            Insert insert=SQLBuilder.buildInsert(r,"example_goods",dao,true);
            System.out.println(insert.getSQL());
            // 生成 Update 语句
            Update update=SQLBuilder.buildUpdate(r, SaveMode.ALL_FIELDS,"example_goods",dao);
            System.out.println(update.getSQL());
        }
    }

    /**
     * 导出 Excel
     * */
    @Test
    public void  exportExcel() {
        // 获得 DAO 对象
        DAO dao = DBInstance.DEFAULT.dao();
        // 获得导出的 Excel 文件
        MavenProject project=new MavenProject(this.getClass());
        File xlsx= FileUtil.resolveByPath(project.getSourceFile(this.getClass()).getParentFile() ,"out-"+System.currentTimeMillis()+".xlsx");
        // 查询数据
        RcdSet rs=dao.query("select * from example_goods");
        // 创建 ExcelWriter 对象
        ExcelWriter writer=new ExcelWriter();
        // 填充指定的 Sheet
        writer.fillSheet(rs,"商品");
        // 保存到文件
        writer.save(xlsx);
    }




}
