package com.leefj.foxnic.sql.demo.sql;


import com.github.foxnic.sql.dialect.SQLDialect;
import com.github.foxnic.sql.expr.Insert;

import java.util.Date;

public class InsertDemo {

    public void demo1(String id) {

        Insert insert = new Insert("bpm_demo_leave");
        insert.set("id", id)
                .set("type", "type-1")
                .set("begin_time", new Date())
                .set("end_time", new Date())
                .set("reason", "天气不错，出去旅游");
        System.out.println(insert.getSQL());
        //输出 : INSERT INTO bpm_demo_leave ( id , type , begin_time , end_time , reason ) VALUES ( '001' , 'type-1' , str_to_date('2022-12-01 10:13:35','%Y-%m-%d %H:%i:%s') , str_to_date('2022-12-01 10:13:35','%Y-%m-%d %H:%i:%s') , '天气不错，出去旅游' )
        System.out.println(insert.getSQL(SQLDialect.PLSQL));
        //输出 : INSERT Iinsert = {Insert@798} "INSERT INTO bpm_demo_leave ( id , type , begin_time , end_time , reason ) VALUES ( '001' , 'type-1' , str_to_date('2022-12-01 10:25:35','%Y-%m-%d %H:%i:%s') , str_to_date('2022-12-01 10:25:35','%Y-%m-%d %H:%i:%s') , '天气不错，出去旅游' )"NTO bpm_demo_leave ( id , type , begin_time , end_time , reason ) VALUES ( '001' , 'type-1' , to_date('2022-12-01 10:14:54','yyyy-mm-dd hh24:mi:ss') , to_date('2022-12-01 10:14:54','yyyy-mm-dd hh24:mi:ss') , '天气不错，出去旅游' )

    }

    public static void main(String[] args) {
        InsertDemo demo=new InsertDemo();
        demo.demo1("001");
    }


}
