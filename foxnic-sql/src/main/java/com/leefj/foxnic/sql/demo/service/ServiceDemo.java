package com.leefj.foxnic.sql.demo.service;

import com.alibaba.fastjson.JSON;
import com.github.foxnic.api.transter.Result;
import com.github.foxnic.commons.busi.id.IDGenerator;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.example.service.IAddressService;
import com.leefj.foxnic.sql.demo.app.example.service.impl.AddressServiceImpl;
import com.leefj.foxnic.sql.demo.config.DBInstance;



public class ServiceDemo {
    public static void main(String[] args) {
        demo_1();
    }

    public static void  demo_1() {

        IAddressService service= DBInstance.DEFAULT.getService(AddressServiceImpl.class);

        Address address=new Address();
        address.setRegionType("国内");
        address.setRegionLocation("华东");
        address.setAddress("宁波");
        address.setName("LeeFJ");
        address.setPhoneNumber("13444025142");

        // 插入对象
        Result r=service.insert(address);
        System.out.println("after insert : "+JSON.toJSON(r));
        if (r.success()) {
            Address addressInDB=service.getById(address.getId());
            System.out.println("from db : "+JSON.toJSON(addressInDB));
        }

        r = service.deleteByIdPhysical(address.getId());
        System.out.println("after delete : "+JSON.toJSON(r));

    }
}

