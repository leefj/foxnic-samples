package com.leefj.webfull.domain.example;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Transient;
import java.util.Map;
import com.github.foxnic.dao.entity.EntityContext;
import com.github.foxnic.dao.entity.Entity;



/**
 * 订单地址
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-09-16 06:12:50
 * @sign 2D524AA15B0CEA67203758F0084B2AC9
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class AddressSubModel extends AddressModel {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 邮编1：邮编1
	*/
	@ApiModelProperty(required = false,value="邮编1" , notes = "邮编1")
	private String postCode1;
	
	/**
	 * 邮编2：邮编2
	*/
	@ApiModelProperty(required = false,value="邮编2" , notes = "邮编2")
	private String postCode2;
	
	/**
	 * 获得 邮编1<br>
	 * 邮编1
	 * @return 邮编1
	*/
	public String getPostCode1() {
		return postCode1;
	}
	
	/**
	 * 设置 邮编1
	 * @param postCode1 邮编1
	 * @return 当前对象
	*/
	public AddressSubModel setPostCode1(String postCode1) {
		this.postCode1=postCode1;
		return this;
	}
	
	/**
	 * 获得 邮编2<br>
	 * 邮编2
	 * @return 邮编2
	*/
	public String getPostCode2() {
		return postCode2;
	}
	
	/**
	 * 设置 邮编2
	 * @param postCode2 邮编2
	 * @return 当前对象
	*/
	public AddressSubModel setPostCode2(String postCode2) {
		this.postCode2=postCode2;
		return this;
	}

	/**
	 * 将 Map 转换成 AddressSubModel
	 * @param addressMap 包含实体信息的 Map 对象
	 * @return AddressSubModel , 转换好的的 Address 对象
	*/
	@Transient
	public static AddressSubModel createFrom(Map<String,Object> addressMap) {
		if(addressMap==null) return null;
		AddressSubModel po = create();
		EntityContext.copyProperties(po,addressMap);
		po.clearModifies();
		return po;
	}

	/**
	 * 将 Pojo 转换成 AddressSubModel
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return AddressSubModel , 转换好的的 Address 对象
	*/
	@Transient
	public static AddressSubModel createFrom(Object pojo) {
		if(pojo==null) return null;
		AddressSubModel po = create();
		EntityContext.copyProperties(po,pojo);
		po.clearModifies();
		return po;
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public AddressSubModel duplicate(boolean all) {
		com.leefj.webfull.domain.example.meta.AddressSubModelMeta.$$proxy$$ inst = new com.leefj.webfull.domain.example.meta.AddressSubModelMeta.$$proxy$$();
		inst.setPhoneNumber(this.getPhoneNumber());
		inst.setAddress(this.getAddress());
		inst.setNotes(this.getNotes());
		inst.setRegionType(this.getRegionType());
		inst.setName(this.getName());
		inst.setId(this.getId());
		inst.setRegionLocation(this.getRegionLocation());
		if(all) {
			inst.setPostCode2(this.getPostCode2());
			inst.setPostCode1(this.getPostCode1());
			inst.setMyProperty(this.getMyProperty());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public AddressSubModel clone() {
		return duplicate(true);
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public AddressSubModel clone(boolean deep) {
		return EntityContext.clone(AddressSubModel.class,this,deep);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return AddressSubModel , 转换好的 PoJo 对象
	*/
	@Transient
	public <T> T toPojo(Class<T> pojoType) {
		if(Entity.class.isAssignableFrom(pojoType)) {
			return (T)EntityContext.create((Class<? extends Entity>) pojoType,this);
		}
		try {
			T pojo=pojoType.newInstance();
			EntityContext.copyProperties(pojo, this);
			return pojo;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 创建一个 AddressSubModel，等同于 new
	 * @return AddressSubModel 对象
	*/
	@Transient
	public static AddressSubModel create() {
		return new com.leefj.webfull.domain.example.meta.AddressSubModelMeta.$$proxy$$();
	}
}