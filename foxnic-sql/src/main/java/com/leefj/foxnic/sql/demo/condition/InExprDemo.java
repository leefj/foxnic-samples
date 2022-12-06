package com.leefj.foxnic.sql.demo.condition;

import com.github.foxnic.commons.busi.id.IDGenerator;
import com.github.foxnic.sql.expr.ConditionExpr;
import com.github.foxnic.sql.expr.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InExprDemo {

    public static void main(String[] args) {
        demoIn1(1);
    }

    /**
     * In 语句
     * */
    public static void demoIn1(Integer valid) {

        // 1、快速指定值
        ConditionExpr conditionExpr1 = new ConditionExpr("valid=?", valid);
        // 快速构建 in 语句
        In in1=new In("id",1,2,4);
        conditionExpr1.and(in1);
        System.out.println("conditionExpr1 = "+conditionExpr1.getSQL());
        // 输出：conditionExpr1 = AND valid= 1 AND id IN ( 1 , 2 , 4 )

        // 2、传入 List
        List<String> els= Arrays.asList("apple","duck","cat");
        In in2=new In("id",els);
        // 把 in 转换成条件表达式
        ConditionExpr conditionExpr2=in2.toConditionExpr();
        conditionExpr2.and("valid=?",valid);
        System.out.println("conditionExpr2 = "+conditionExpr2.getSQL());
        // 输出：conditionExpr2 = AND id IN ( 'apple' , 'duck' , 'cat' ) AND valid= 1

        // 3、多字段的 In 语句构建
        List<Object[]> els1= new ArrayList<>();
        for (int i = 0; i < 4 ; i++) {
            els1.add(new Object[]{i, IDGenerator.getRandomString(6)});
        }
        In in3=new In(new String[]{"id","code"},els1);
        // 把 in 转换成条件表达式
        ConditionExpr conditionExpr3=in3.toConditionExpr();
        System.out.println("conditionExpr3 = "+conditionExpr3.getSQL());
        // 输出：conditionExpr3 = AND ( id , code ) IN ( ( 0 , '5oJ8Vu' ) , ( 1 , 'xx00J*' ) , ( 2 , 'Bhc7@W' ) , ( 3 , '=Wdx&9' ) )
    }

}
