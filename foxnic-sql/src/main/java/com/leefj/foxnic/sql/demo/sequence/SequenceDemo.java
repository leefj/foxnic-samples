package com.leefj.foxnic.sql.demo.sequence;

import com.github.foxnic.commons.busi.id.SequenceType;
import com.github.foxnic.dao.meta.DBColumnMeta;
import com.github.foxnic.dao.meta.DBTableMeta;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.spec.DBSequence;
import com.leefj.foxnic.sql.demo.config.DBInstance;
import org.springframework.transaction.annotation.Transactional;

public class SequenceDemo {


    public static void main(String[] args) {
        // 创建DAO
        DAO dao=DBInstance.DEFAULT.dao();
        String name="my-sample-demo";
        DBSequence sequence=dao.getSequence(name);
        // 如果不存在就创建
        if(!sequence.exists()) {
            // 创建序列
            sequence.create(SequenceType.AI,10,4);
        }
        // 循环取数
        for (int i = 0; i < 100; i++) {
            // 获取 Long 值
            System.out.println(i+" = "+sequence.nextLong());
            // 获得 String 值
            System.out.println(i+" = "+sequence.next());
        }
    }

}
