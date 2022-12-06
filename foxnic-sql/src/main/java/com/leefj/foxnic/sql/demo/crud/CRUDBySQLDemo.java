package com.leefj.foxnic.sql.demo.crud;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.sql.expr.Delete;
import com.github.foxnic.sql.expr.Insert;
import com.github.foxnic.sql.expr.Select;
import com.github.foxnic.sql.expr.Update;
import com.leefj.foxnic.sql.demo.config.DBInstance;

import java.util.Date;

public class CRUDBySQLDemo {

    public static void main(String[] args) {
        // 插入数据
        String id=insertAddress("137771041252");
        System.out.println("addressId(Insert) = "+id);
        // 按ID查询数据
        Rcd address=queryAddress(id);
        if(address!=null) {
            System.out.println(address.toJSONObject());
        }
        // 更新
        if(id!=null) {
            id=updateAddress(id,"13852562523");
            System.out.println("addressId(Update) = "+id);
        }
        // 删除
        if(id!=null) {
            id=deleteAddress(id);
            System.out.println("addressId(Delete) = "+id);
        }
    }

    /**
     * 插入数据
     * */
    public static String insertAddress(String phone) {
        // 创建语句对象
        Insert insert=new Insert("example_address");
        String id= IDGenerator.getSnowflakeIdString();
        // 设置值
        insert.set("id",id)
                .set("name","leefj")
                // 如果是 null 则不连入SQL语句
                .setIf("phone_number",phone)
                .set("address","宁波")
                .set("region_type","国内")
                .set("create_time",new Date())
                // 设置数据库表达式
                .setExpr("update_time","now()");
        // 输出语句
        System.out.println(insert.getSQL());
        // 执行语句
        Integer suc=DBInstance.DEFAULT.dao().execute(insert);
        // 如果执行成功，返回ID，否则返回 null
        if(suc==1) {
            return id;
        } else {
            return null;
        }
    }

    /**
     * 查询
     * */
    public static Rcd queryAddress(String id) {

        // 创建语句对象
        Select select=new Select("example_address");
        // 设置值
        select.where().and("id=?",id);
        // 输出语句
        System.out.println(select.getSQL());
        // 执行语句
        Rcd address=DBInstance.DEFAULT.dao().queryRecord(select);
        // 如果执行成功，返回记录对象，否则返回 null
        return address;
    }

    /**
     * 更新
     * */
    public static String updateAddress(String id,String phone) {
        // 创建语句对象
        Update update=new Update("example_address");
        // 设置值
        update.setIf("phone_number",phone)
                // 设置数据库表达式
                .setExpr("update_time","now()")
                .set("update_by","110")
                .where().and("id=?",id);
        // 输出语句
        System.out.println(update.getSQL());
        // 执行语句
        Integer suc=DBInstance.DEFAULT.dao().execute(update);
        // 如果执行成功，返回ID，否则返回 null
        if(suc==1) {
            return id;
        } else {
            return null;
        }
    }

    /**
     * 删除
     * */
    public static String deleteAddress(String id) {
        // 创建语句对象
        Delete delete=new Delete("example_address");
        // 设置条件
        delete.where().and("id=?",id);
        // 输出语句
        System.out.println(delete.getSQL());
        // 执行语句
        Integer suc=DBInstance.DEFAULT.dao().execute(delete);
        // 如果执行成功，返回ID，否则返回 null
        if(suc==1) {
            return id;
        } else {
            return null;
        }
    }
}
