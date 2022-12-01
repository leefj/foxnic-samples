package com.leefj.foxnic.sql.demo.sql;

import com.github.foxnic.sql.expr.Where;

public class WhereDemo {

    public Where makeWhere(String name,Integer height) {
        Where where = new Where("valid = ?" ,1);
        where.andLike("name",name);
        where.andIf("height > ?",height);
        return where;
    }


    public static void main(String[] args) {

        WhereDemo demo=new WhereDemo();


        Where wh1=demo.makeWhere("leefj",18);
        System.out.println(wh1);
        //输出 : WHERE valid = 1 AND name like '%leefj%' AND height > 18

        Where wh2=demo.makeWhere("leefj",null);
        System.out.println(wh2);
        //输出 : WHERE valid = 1 AND name like '%leefj%'

        Where wh3=demo.makeWhere(null,18);
        System.out.println(wh3);
        //输出 : WHERE valid = 1 AND height > 18

    }

}
