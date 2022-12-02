package com.leefj.foxnic.sql.demo.rcdset;

import com.github.foxnic.commons.busi.id.SequenceType;
import com.github.foxnic.dao.data.Rcd;
import com.github.foxnic.dao.data.RcdSet;
import com.github.foxnic.dao.spec.DAO;
import com.github.foxnic.dao.spec.DBSequence;
import com.leefj.foxnic.sql.demo.config.DBInstance;

public class RcdSetDemo {

    public static void main(String[] args) {
        // 创建DAO
        DAO dao = DBInstance.DEFAULT.dao();
        RcdSet rs = dao.queryPage("select * from sys_dict where code like ?", 50, 1, "%o%");
        for (Rcd r : rs) {
            System.out.println(r.toJSONObject());
        }
    }
}
