package com.leefj.foxnic.sql.demo.rcdset;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.foxnic.commons.bean.FilterOperator;
import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.commons.busi.id.SequenceType;
import com.github.foxnic.dao.data.*;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.spec.DBSequence;
import com.github.foxnic.sql.data.DataNameFormat;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertTrue;


public class RcdSetDemo {


    /**
     * 记录集、记录、元数据的关系
     */
    @Test
    public void demo_RcdSetRcdMeta() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        // 查询并获得第一个记录
        Rcd r = dao.queryRecord("select * from sys_dict where code like ?", "%o%");
        // 输出记录的数据
        System.out.println(r.toJSONObject());
        // 获得当前记录的所在的记录集
        RcdSet rs = r.getOwnerSet();
        // 获得记录集元数据
        QueryMetaData meta = rs.getMetaData();
        // 遍历元数据
        for (int i = 0; i < meta.getColumnCount(); i++) {
            // 获得列标签
            String label = meta.getColumnLabel(i);
            // 按标签取数
            Object value = r.getValue(label);
            // 输出
            System.out.println(label + " = " + value);
        }
    }


    /**
     * 获得记录集
     */
    @Test
    public void demo_GetRcdSet() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        // 方式1：查询
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        // 方式2：克隆
        RcdSet rs2 = rs.clone();
        // 方式3：子集
        RcdSet rs3 = rs.subset(1, 3, true);
        // 遍历
        for (Rcd rcd : rs3) {
            System.out.println(rcd.toJSONObject());
        }
    }

    /**
     * 记录集遍历
     */
    @Test
    public void demo_IterateOver() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        //遍历方式-1 : iterator
        for (Rcd r : rs) {
            System.out.println(r.toJSONObject());
        }
        // 遍历方式-2 : 按行取
        for (int i = 0; i < rs.size(); i++) {
            Rcd r = rs.getRcd(i);
            System.out.println(r.toJSONObject());
        }
        // 遍历方式-3 : Lambda
        rs.stream().forEach(r -> {
            System.out.println(r.toJSONObject());
        });
        // 遍历方式-3 : Lambda
        rs.parallelStream().forEach(r -> {
            System.out.println(r.toJSONObject());
        });
    }



    /**
     * 列控制
     */
    @Test
    public void demo_Column() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        // 输出列数
        System.out.println("size after query " + rs.getFields().size());
        // 增加列
        rs.addColumn("new_column");
        System.out.println("size after add " + rs.getFields().size());
        for (String field : rs.getFields()) {
            System.out.println("a : " + field);
        }
        // 变更列名
        rs.changeColumnLabel("new_column", "new_column_1");
        for (String field : rs.getFields()) {
            System.out.println("b : " + field);
        }
        // 按列取数与设置
        for (Rcd r : rs) {
            r.set("new_column_1", IDGenerator.getNanoId());
        }
        // 取数
        for (Rcd r : rs) {
            // 用原始列名取数
            String value1 = r.getString("new_column_1");
            // 用驼峰命名取数
            Object value2 = r.getValue("newColumn1");
            System.out.println("value1 = " + value1 + " ;  value2=" + value2);
            assertTrue(value2.equals(value1));
        }
    }

    /**
     * 取值与设置值
     * */
    @Test
    public void demo_Value() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ? and create_time is not null", 50, 1, "%o%");
        rs.parallelStream().forEach(r->{
            // 取 Object 类型值，实际值类型和从数据库取出时的原始类型一致
            Object idObj=r.getValue("id");
            // 指定取字符串类型
            String idStr=r.getString("id");
            // 指定取 Long 类型，Rcd 会尽可能转换成 Long 类型，如果不能转换，返回 null
            Long idLong=r.getLong("id");
            // 指定取 Date 类型，Rcd 会尽可能转换成 Date 类型，如果不能转换，返回 null
            Date idDate=r.getDate("id");
            // 用序号取数获得更高的效率
            idObj=r.getValue(0);
            // 按序号设置值，无类型校验
            r.set(0,"12345");
            // 按列名设置值
            r.set("id","12345");
            // 设置值，同时单个单词的列名不区分大小写
            idObj=r.getValue("id");
            idObj=r.getValue("ID");
            // 多单词列名按原始数据库命名的匹配方式
            Date date1=r.getDate("create_time");
            // 多单词列名按驼峰命名的匹配方式
            Date date2=r.getDate("createTime");
            // 多单词列名按驼峰命名大写或小写的匹配方式
            Date date3=r.getDate("createtime");
            Date date4=r.getDate("CREATETIME");
            System.out.println();
        });
    }

    /**
     * 数据结构转换
     */
    @Test
    public void demo_Structure() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        // 提取单列数据为数组
        String[] ids = rs.getValueArray("id", String.class);
        // 提取单列数据为 List
        List<Date> dateList = rs.getValueList("createTime", Date.class);
        // 提取单列数据为 Set
        Set<Date> codeSet = rs.getValueSet("code", Date.class);
        // 提取指定列数据为 Map
        Map<String, String> map = rs.getValueMap("id", String.class, "name", String.class);
        // 将记录集转换成 Map 结构
        Map<String, Rcd> rcdMap = rs.getMappedRcds("id", String.class);
        // 将记录集进行分组
        Map<Object, List<Rcd>> groupedMap = rs.getGroupedMap("id", "code");
    }

    /**
     * 排序、过滤、去重
     */
    @Test
    public void demo_misc() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        rs.parallelStream().forEach(r -> {
            System.out.println(r.toJSONObject());
        });
        // 按指定字段去重
        rs.distinct("id");
        // 按指定字段排序
        rs.sort("create_time", true, true);
        // 查找,精确匹配，返回第一行匹配的记录
        Rcd r = rs.find("name", "机柜状态");
        System.out.println(r == null ? "未找到" : r.toJSONObject());
        // 过滤，并指定匹配操作符
        RcdSet result = rs.filter("id", "36", FilterOperator.CONTAINS);
        for (Rcd rcd : result) {
            System.out.println("filter" + rcd.toJSONObject());
        }
        // 增加排名列
        rs.rank("rank", "id", true);
        for (Rcd rcd : rs) {
            System.out.println("rank-1 :  id = " + rcd.getString("id") + " , rank = " + rcd.getInteger("rank"));
        }
        // 用排名值填充一个已经存在的列
        rs.fillRankField("version", "create_time", false);
        for (Rcd rcd : rs) {
            System.out.println("rank-2 : id = " + rcd.getString("create_time") + " , rank = " + rcd.getInteger("version"));
        }
    }


    /**
     * 序列化
     */
    @Test
    public void demo_serialization() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        // 序列化记录集为 JSONArray 每个元素为 JSONObject
        JSONArray array1 = rs.toJSONArrayWithJSONObject();
        // 序列化记录集为 JSONArray 每个元素为 JSONArray
        JSONArray array2 = rs.toJSONArrayWithJSONArray();
        // 序列化记录集为 JSONArray 每个元素为 JSONObject , 并指定哪些字段转入到 JSONObject
        JSONArray array4 = rs.toJSONArrayWithJSONObject("id", "code", "name");
        System.out.println(array4);

        // 序列化记录
        for (Rcd r : rs) {
            // 全字段转换
            JSONObject object1 = r.toJSONObject();
            System.out.println(object1);
            // 指定字段转换
            JSONObject object2 = r.toJSONObject("id", "code", "name");
            System.out.println(object2);
        }

        // 指定列名转换规则 , DB_UPPER_CASE 表示完全和数据库一致，整体转大写
        rs.setDataNameFormat(DataNameFormat.DB_UPPER_CASE);
        System.out.println(rs.toJSONArrayWithJSONObject());
    }


    /**
     * 处理实体数据
     */
    @Test
    public void demo_entity() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from example_address", 50, 1);
        // 转成实体列表
        List<Address> addressList = rs.toEntityList(Address.class);
        System.out.println(JSON.toJSON(addressList));
        // 转成分页的实体列表
        PagedList<Address> addressPageList = rs.toPagedEntityList(Address.class);
        System.out.println(JSON.toJSON(addressPageList));
        // 遍历并逐个转换
        for (Rcd r : rs) {
            Address address = r.toEntity(Address.class);
            System.out.println(JSON.toJSON(address));
        }
    }

    /**
     * 操作数据
     */
    @Test
    public void demo_crud() {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        String id = IDGenerator.getSnowflakeIdString();
        Rcd r = dao.queryRecord("select * from example_address where id=?", id);
        boolean suc = false;
        if (r == null) {
            r = dao.createRecord("example_address");
            r.set("id", id);
            r.set("name", "leefj");
            // 如果是 null 则不连入SQL语句
            r.set("phone_number", "13444252562");
            r.set("address", "宁波");
            r.set("region_type", "国内");
            r.set("create_time", new Date());
            // 设置数据库表达式
            r.setExpr("update_time", "now()");
            // 执行插入操作
            suc=r.insert();
            System.out.println("数据插入"+(suc?"成功":"失败"));
        } else {
            r.set("update_time", new Date());
            r.set("update_by", "leefj");
            // 执行更新操作
            suc=r.update(SaveMode.DIRTY_FIELDS);
            System.out.println("数据更新"+(suc?"成功":"失败"));
        }
        suc=r.delete();
        System.out.println("数据删除"+(suc?"成功":"失败"));
    }


}
