package com.leefj.webfull.domain.example;

import com.github.foxnic.dao.entity.Entity;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Transient;
import java.util.Map;
import com.github.foxnic.dao.entity.EntityContext;



/**
 * 订单地址
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-08-19 16:30:03
 * @sign 8C5453A926F1CFD20310681A88DDBD24
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class AddressModel extends Entity {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 自定义属性：我的自定义属性
	*/
	@ApiModelProperty(required = false,value="自定义属性" , notes = "我的自定义属性")
	private String myProperty;
	
	/**
	 * 主键：主键
	*/
	@ApiModelProperty(required = false,value="主键" , notes = "主键")
	private String id;
	
	/**
	 * 收件人姓名：收件人姓名
	*/
	@ApiModelProperty(required = false,value="收件人姓名" , notes = "收件人姓名")
	private String name;
	
	/**
	 * 收件人手机：收件人手机
	*/
	@ApiModelProperty(required = false,value="收件人手机" , notes = "收件人手机")
	private String phoneNumber;
	
	/**
	 * 收件地址：收件地址
	*/
	@ApiModelProperty(required = false,value="收件地址" , notes = "收件地址")
	private String address;
	
	/**
	 * 类型：类型，A:国内；B:国外
	*/
	@ApiModelProperty(required = false,value="类型" , notes = "类型，A:国内；B:国外")
	private String regionType;
	
	/**
	 * 地区位置：地区位置，东北、华北等
	*/
	@ApiModelProperty(required = false,value="地区位置" , notes = "地区位置，东北、华北等")
	private String regionLocation;
	
	/**
	 * 备注：备注
	*/
	@ApiModelProperty(required = false,value="备注" , notes = "备注")
	private String notes;
	
	/**
	 * 获得 自定义属性<br>
	 * 我的自定义属性
	 * @return 自定义属性
	*/
	public String getMyProperty() {
		return myProperty;
	}
	
	/**
	 * 设置 自定义属性
	 * @param myProperty 自定义属性
	 * @return 当前对象
	*/
	public AddressModel setMyProperty(String myProperty) {
		this.myProperty=myProperty;
		return this;
	}
	
	/**
	 * 获得 主键<br>
	 * 主键
	 * @return 主键
	*/
	public String getId() {
		return id;
	}
	
	/**
	 * 设置 主键
	 * @param id 主键
	 * @return 当前对象
	*/
	public AddressModel setId(String id) {
		this.id=id;
		return this;
	}
	
	/**
	 * 获得 收件人姓名<br>
	 * 收件人姓名
	 * @return 收件人姓名
	*/
	public String getName() {
		return name;
	}
	
	/**
	 * 设置 收件人姓名
	 * @param name 收件人姓名
	 * @return 当前对象
	*/
	public AddressModel setName(String name) {
		this.name=name;
		return this;
	}
	
	/**
	 * 获得 收件人手机<br>
	 * 收件人手机
	 * @return 收件人手机
	*/
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 设置 收件人手机
	 * @param phoneNumber 收件人手机
	 * @return 当前对象
	*/
	public AddressModel setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		return this;
	}
	
	/**
	 * 获得 收件地址<br>
	 * 收件地址
	 * @return 收件地址
	*/
	public String getAddress() {
		return address;
	}
	
	/**
	 * 设置 收件地址
	 * @param address 收件地址
	 * @return 当前对象
	*/
	public AddressModel setAddress(String address) {
		this.address=address;
		return this;
	}
	
	/**
	 * 获得 类型<br>
	 * 类型，A:国内；B:国外
	 * @return 类型
	*/
	public String getRegionType() {
		return regionType;
	}
	
	/**
	 * 设置 类型
	 * @param regionType 类型
	 * @return 当前对象
	*/
	public AddressModel setRegionType(String regionType) {
		this.regionType=regionType;
		return this;
	}
	
	/**
	 * 获得 地区位置<br>
	 * 地区位置，东北、华北等
	 * @return 地区位置
	*/
	public String getRegionLocation() {
		return regionLocation;
	}
	
	/**
	 * 设置 地区位置
	 * @param regionLocation 地区位置
	 * @return 当前对象
	*/
	public AddressModel setRegionLocation(String regionLocation) {
		this.regionLocation=regionLocation;
		return this;
	}
	
	/**
	 * 获得 备注<br>
	 * 备注
	 * @return 备注
	*/
	public String getNotes() {
		return notes;
	}
	
	/**
	 * 设置 备注
	 * @param notes 备注
	 * @return 当前对象
	*/
	public AddressModel setNotes(String notes) {
		this.notes=notes;
		return this;
	}

	/**
	 * 创建一个 AddressModel，等同于 new
	 * @return AddressModel 对象
	*/
	@Transient
	public static AddressModel create() {
		return EntityContext.create(AddressModel.class);
	}

	/**
	 * 将 Map 转换成 AddressModel
	 * @param addressMap 包含实体信息的 Map 对象
	 * @return AddressModel , 转换好的的 Address 对象
	*/
	@Transient
	public static AddressModel createFrom(Map<String,Object> addressMap) {
		if(addressMap==null) return null;
		AddressModel po = EntityContext.create(AddressModel.class, addressMap);
		return po;
	}

	/**
	 * 将 Pojo 转换成 AddressModel
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return AddressModel , 转换好的的 Address 对象
	*/
	@Transient
	public static AddressModel createFrom(Object pojo) {
		if(pojo==null) return null;
		AddressModel po = EntityContext.create(AddressModel.class,pojo);
		return po;
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return AddressModel , 转换好的 PoJo 对象
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
}