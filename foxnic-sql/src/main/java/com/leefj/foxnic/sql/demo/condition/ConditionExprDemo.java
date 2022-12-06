package com.leefj.foxnic.sql.demo.condition;


import com.github.foxnic.sql.expr.ConditionExpr;
import com.github.foxnic.sql.expr.In;

import java.util.Date;

public class ConditionExprDemo {

    public static void main(String[] args) {
        demo1(1,28,new Date(),null);
        System.out.println("--------------------------------------------");
        demo1(1,28,null,null);
        System.out.println("--------------------------------------------");
        demo2(1,28,new Date(),null);
    }

    /**
     * 1、基础条件表达式
     * */
    public static void demo1(Integer valid, Integer age, Date createDate, String keyword) {

        // 1、自由条件表达式
        ConditionExpr conditionExpr1 = new ConditionExpr("valid=?", valid);
        // 加入条件，并用 and 连接
        conditionExpr1.and("age>?", age);
        // 加入条件，并用 or 连接，当参数都为 null 时，语句不接入
        conditionExpr1.orIf("(create_date>? and name=?)", createDate,keyword);
        // 指定语句开通的关键字
        conditionExpr1.startWithWhere();
        System.out.println("conditionExpr1 = "+conditionExpr1.getSQL());

        // 2、指定操作符的条件表达式
        ConditionExpr conditionExpr2 = new ConditionExpr();
        // 指定字段与条件操作符并字段判断是否忽略改条件
        conditionExpr2.andLike("name", keyword);
        // 指定字段与条件操作符，
        conditionExpr2.andGreaterThan("age", age);
        // 指定语句开通的关键字
        conditionExpr2.startWithSpace();
        System.out.println("conditionExpr2 = "+conditionExpr2.getSQL());

    }

    /**
     * 2、值忽略
     * */
    public static void demo2(Integer valid, Integer age, Date createDate, String keyword) {

        // 默认忽略 null
        ConditionExpr conditionExpr1 = new ConditionExpr("valid=?", valid);
        conditionExpr1.andIf("age>?",age);
        conditionExpr1.andIf("name like ?","%"+keyword+"%");
        conditionExpr1.andLike("name",keyword);
        System.out.println("conditionExpr1 = "+conditionExpr1.getSQL());

        // 指定忽略的值
        ConditionExpr conditionExpr2 = new ConditionExpr();
        conditionExpr2.ignore(null,"null","any","all").andEquals("name",keyword);
        System.out.println("conditionExpr2 = "+conditionExpr2.getSQL());

    }




}
