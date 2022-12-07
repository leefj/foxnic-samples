package com.leefj.foxnic.sql.demo.crud;


import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.sql.expr.Select;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class SelectDemo {

    public static void main(String[] args) {
        demo1("10");
    }

    /**
     * Select 语句的使用
     * */
    public static void demo1(String keyword) {
        // 创建语句对象
        Select select=new Select();
        // from 子句
        select.from("sys_role")
                // 选取字段
                .select("id").select("name")
                .selects("code","create_by")
                // 查询条件
                .where("id like ?","%"+keyword+"%").andEquals("deleted",0)
                // 排序
                .orderBy().ascNL("id")
                // 从 order by 子句回到顶层 Select 语句
                .top()
                // 指定 group by 语句
                .groupBy().by("id","name","code","create_by")
                // 指定 having 子句
                .having().and("count(id)>?",0);

        System.out.println(select.getSQL());
        // 输出： SELECT id , name , code , create_by FROM sys_role WHERE id like '%10%' AND deleted = 0 GROUP BY id HAVING count(id)> 0 ORDER BY ifnull( id ,1) -1 asc, id ASC

        // 使用默认 DAO 进行查询
        RcdSet rs=DBInstance.DEFAULT.dao().query(select);

        // 遍历与输出
        for (Rcd r : rs) {
            System.out.println(r.toJSONObject());
        }

    }


}
