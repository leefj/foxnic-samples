package com.leefj.foxnic.sql.demo.expr;


import com.github.foxnic.commons.collection.MapUtil;
import com.github.foxnic.commons.lang.DateUtil;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.sql.GlobalSettings;
import com.github.foxnic.sql.dialect.SQLDialect;
import com.github.foxnic.sql.expr.Expr;
import com.leefj.foxnic.sql.demo.config.DBInstance;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExprDemo {

    public static void main(String[] args) {
        demo1();
        System.out.println("-------------------------");
        demo2();
        System.out.println("-------------------------");
        demo3();
    }

    /**
     * 1、表达式解析与占位符示例
     * */
    public static void  demo1() {
        // 1.1、匿名占位符
        Expr expr1=new Expr("select ?+? as result from dual",8,9);
        System.out.println("expr1 = "+expr1);
        // 输出：expr1 = select 8 + 9 as result from dual

        expr1=new Expr("age>?",28);
        System.out.println("expr1 = "+expr1);
        // 输出：expr1 = age> 28

        expr1=new Expr("age>? and height>?",28,182);
        System.out.println("expr1 = "+expr1);
        // 输出：expr1 = age> 28 and height> 182


        // 1.2、命名占位符
        Map<String,Object> namedParam=new HashMap<>();
        namedParam.put("P1",18);
        namedParam.put("P2",19);
        Expr expr2=new Expr("select :P1+:P2 as result from dual",namedParam);
        System.out.println("expr2 = "+expr2);
        // 输出：expr2 = select 18 + 19 as result from dual

        // 1.3、混合占位符模式
        Map<String,Object> namedParams= MapUtil.asMap(
                "P1",28,
                "P2",29
        );
        Expr expr3=new Expr("select ?+? as result_1,:P1+:P2 as result_2, :P2*:P1 as result_3 from dual", namedParams ,8,9);
        System.out.println("expr3 = "+expr3);
        // 输出：expr3 = select 8 + 9 as result_1, 28 + 29 as result_2, 29 * 28 as result_3 from dual
    }

    /**
     * 2、表达式通过DAO传递给JDBC执行时，这些占位符被解析并处理成绑定变量。当表达式被打印或输出时，占位符会被处理成符合指定数据库语法且变量已代入的SQL字符串。
     * */
    public static void  demo2() {

        Date date= DateUtil.parse("2020-12-05");
        Expr expr1=new Expr("select ?+? as result from my_table where create_date>?",8,9,date);
        System.out.println("传递给JDBC的语句(匿名占位符) = "+expr1.getListParameterSQL());
        // 输出：传递给JDBC的语句(匿名占位符) = select ? + ? as result from my_table where create_date> ?
        System.out.println("传递给JDBC的语句(命名占位符) = "+expr1.getNamedParameterSQL());
        // 输出：传递给JDBC的语句(命名占位符) = select :PARAM_1 + :PARAM_2 as result from my_table where create_date> :PARAM_3

        // 指定全局的SQL方言，默认MySQL，特定数据库时自动识别
        GlobalSettings.DEFAULT_SQL_DIALECT= SQLDialect.MySQL;
        System.out.println("开发人员友好的SQL(默认) = "+expr1.getSQL());
        // 输出：开发人员友好的SQL(默认) = select 8 + 9 as result from my_table where create_date> str_to_date('2020-12-05 00:00:00','%Y-%m-%d %H:%i:%s')
        System.out.println("开发人员友好的SQL(Oracle) = "+expr1.getSQL(SQLDialect.PLSQL));
        // 输出：开发人员友好的SQL(Oracle) = select 8 + 9 as result from my_table where create_date> to_date('2020-12-05 00:00:00','yyyy-mm-dd hh24:mi:ss')

        // 执行，此处请关注控制台输出日志
        Expr exprForQuery=new Expr("select * from sys_dict where create_time>?",date);
        RcdSet rs=DBInstance.DEFAULT.dao().query(exprForQuery);
        for (Rcd r : rs) {
            System.out.println(r.toJSONObject());
        }



    }

    /**
     * 3、表达式的拼装
     * */
    public static void  demo3() {

        // 示例-1
        Expr expr1=new Expr("age>?",28);
        Expr expr2=new Expr("and height>?",182);
        // 通过  append 方法将 expr2 拼接到 expr1
        expr1.append(expr2);
        System.out.println(expr1.getSQL());
        // 输出：age> 28 and height> 182

        // 示例-2
        Expr expr3=new Expr("age>?",28);
        expr3.append("and height>?",182);
        System.out.println(expr1.getSQL());
        // 输出：age> 28 and height> 182

    }


}
