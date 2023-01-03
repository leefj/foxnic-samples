package com.leefj.foxnic.sql.demo.app.domain.example;

import com.github.foxnic.dao.entity.Entity;
import javax.persistence.Table;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables.EXAMPLE_ADDRESS;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Transient;
import com.github.foxnic.api.swagger.EnumFor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.foxnic.commons.lang.DataParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import com.github.foxnic.dao.entity.EntityContext;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * 订单地址
 * <p>订单地址 , 数据表 example_address 的PO类型</p>
 * @author LeeFJ
 * @since 2023-01-03 16:26:44
 * @sign 031D15CC009A5E1CC4FEC54B3EA247D9
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

@Table(name = "example_address")
public class Address extends Entity {

	private static final long serialVersionUID = 1L;

	public static final DBTable TABLE =EXAMPLE_ADDRESS.$TABLE;
	
	/**
	 * 主键：主键
	*/
	@Id
	private String id;
	
	/**
	 * 收件人姓名：收件人姓名
	*/
	private String name;
	
	/**
	 * 收件人手机：收件人手机
	*/
	private String phoneNumber;
	
	/**
	 * 收件地址：收件地址
	*/
	private String address;
	
	/**
	 * 类型：A:国内；B:国外
	*/
	private String regionType;
	
	/**
	 * 地区位置：东北、华北等
	*/
	private String regionLocation;
	
	/**
	 * 创建人ID：创建人ID
	*/
	private String createBy;
	
	/**
	 * 创建时间：创建时间
	*/
	private Date createTime;
	
	/**
	 * 修改人ID：修改人ID
	*/
	private String updateBy;
	
	/**
	 * 修改时间：修改时间
	*/
	private Date updateTime;
	
	/**
	 * 是否已删除：是否已删除
	*/
	private Integer deleted;
	@Transient
	@EnumFor("deleted")
	private Boolean deletedBool;
	
	/**
	 * 删除人ID：删除人ID
	*/
	private String deleteBy;
	
	/**
	 * 删除时间：删除时间
	*/
	private Date deleteTime;
	
	/**
	 * 版本：版本
	*/
	private Integer version;
	
	/**
	 * 订单明细商品：订单明细商品
	*/
	private List<Goods> goodsList;
	
	/**
	 * 收件地址：收件地址，包括收件人以及手机号码
	*/
	private List<Address> orderList;
	
	/**
	 * 订单明细：订单明细
	*/
	private List<OrderItem> itemList;
	
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
	public Address setId(String id) {
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
	public Address setName(String name) {
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
	public Address setPhoneNumber(String phoneNumber) {
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
	public Address setAddress(String address) {
		this.address=address;
		return this;
	}
	
	/**
	 * 获得 类型<br>
	 * A:国内；B:国外
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
	public Address setRegionType(String regionType) {
		this.regionType=regionType;
		return this;
	}
	
	/**
	 * 获得 地区位置<br>
	 * 东北、华北等
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
	public Address setRegionLocation(String regionLocation) {
		this.regionLocation=regionLocation;
		return this;
	}
	
	/**
	 * 获得 创建人ID<br>
	 * 创建人ID
	 * @return 创建人ID
	*/
	public String getCreateBy() {
		return createBy;
	}
	
	/**
	 * 设置 创建人ID
	 * @param createBy 创建人ID
	 * @return 当前对象
	*/
	public Address setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
	
	/**
	 * 获得 创建时间<br>
	 * 创建时间
	 * @return 创建时间
	*/
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * 设置 创建时间
	 * @param createTime 创建时间
	 * @return 当前对象
	*/
	public Address setCreateTime(Date createTime) {
		this.createTime=createTime;
		return this;
	}
	
	/**
	 * 获得 修改人ID<br>
	 * 修改人ID
	 * @return 修改人ID
	*/
	public String getUpdateBy() {
		return updateBy;
	}
	
	/**
	 * 设置 修改人ID
	 * @param updateBy 修改人ID
	 * @return 当前对象
	*/
	public Address setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
	
	/**
	 * 获得 修改时间<br>
	 * 修改时间
	 * @return 修改时间
	*/
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * 设置 修改时间
	 * @param updateTime 修改时间
	 * @return 当前对象
	*/
	public Address setUpdateTime(Date updateTime) {
		this.updateTime=updateTime;
		return this;
	}
	
	/**
	 * 获得 是否已删除<br>
	 * 是否已删除
	 * @return 是否已删除
	*/
	public Integer getDeleted() {
		return deleted;
	}
	
	/**
	 * 获得 是否已删除 的投影属性<br>
	 * 等价于 getDeleted 方法，获得对应的枚举类型
	 * @return 是否已删除
	*/
	@Transient
	public Boolean isDeleted() {
		if(this.deletedBool==null) {
			this.deletedBool=DataParser.parseBoolean(deleted);
		}
		return this.deletedBool ;
	}
	
	/**
	 * 设置 是否已删除
	 * @param deleted 是否已删除
	 * @return 当前对象
	*/
	@JsonProperty("deleted")
	public Address setDeleted(Integer deleted) {
		this.deleted=deleted;
		this.deletedBool=DataParser.parseBoolean(deleted);
		return this;
	}
	
	/**
	 * 设置 是否已删除的投影属性，等同于设置 是否已删除
	 * @param deletedBool 是否已删除
	 * @return 当前对象
	*/
	@Transient
	public Address setDeleted(Boolean deletedBool) {
		if(deletedBool==null) {
			this.deleted=null;
		} else {
			this.deleted=deletedBool?1:0;
		}
		this.deletedBool=deletedBool;
		return this;
	}
	
	/**
	 * 获得 删除人ID<br>
	 * 删除人ID
	 * @return 删除人ID
	*/
	public String getDeleteBy() {
		return deleteBy;
	}
	
	/**
	 * 设置 删除人ID
	 * @param deleteBy 删除人ID
	 * @return 当前对象
	*/
	public Address setDeleteBy(String deleteBy) {
		this.deleteBy=deleteBy;
		return this;
	}
	
	/**
	 * 获得 删除时间<br>
	 * 删除时间
	 * @return 删除时间
	*/
	public Date getDeleteTime() {
		return deleteTime;
	}
	
	/**
	 * 设置 删除时间
	 * @param deleteTime 删除时间
	 * @return 当前对象
	*/
	public Address setDeleteTime(Date deleteTime) {
		this.deleteTime=deleteTime;
		return this;
	}
	
	/**
	 * 获得 版本<br>
	 * 版本
	 * @return 版本
	*/
	public Integer getVersion() {
		return version;
	}
	
	/**
	 * 设置 版本
	 * @param version 版本
	 * @return 当前对象
	*/
	public Address setVersion(Integer version) {
		this.version=version;
		return this;
	}
	
	/**
	 * 获得 订单明细商品<br>
	 * 订单明细商品
	 * @return 订单明细商品
	*/
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	
	/**
	 * 设置 订单明细商品
	 * @param goodsList 订单明细商品
	 * @return 当前对象
	*/
	public Address setGoodsList(List<Goods> goodsList) {
		this.goodsList=goodsList;
		return this;
	}
	
	/**
	 * 添加 订单明细商品
	 * @param goods 订单明细商品
	 * @return 当前对象
	*/
	public Address addGoods(Goods... goods) {
		if(this.goodsList==null) goodsList=new ArrayList<>();
		this.goodsList.addAll(Arrays.asList(goods));
		return this;
	}
	
	/**
	 * 获得 收件地址<br>
	 * 收件地址，包括收件人以及手机号码
	 * @return 收件地址
	*/
	public List<Address> getOrderList() {
		return orderList;
	}
	
	/**
	 * 设置 收件地址
	 * @param orderList 收件地址
	 * @return 当前对象
	*/
	public Address setOrderList(List<Address> orderList) {
		this.orderList=orderList;
		return this;
	}
	
	/**
	 * 添加 收件地址
	 * @param order 收件地址
	 * @return 当前对象
	*/
	public Address addOrder(Address... order) {
		if(this.orderList==null) orderList=new ArrayList<>();
		this.orderList.addAll(Arrays.asList(order));
		return this;
	}
	
	/**
	 * 获得 订单明细<br>
	 * 订单明细
	 * @return 订单明细
	*/
	public List<OrderItem> getItemList() {
		return itemList;
	}
	
	/**
	 * 设置 订单明细
	 * @param itemList 订单明细
	 * @return 当前对象
	*/
	public Address setItemList(List<OrderItem> itemList) {
		this.itemList=itemList;
		return this;
	}
	
	/**
	 * 添加 订单明细
	 * @param item 订单明细
	 * @return 当前对象
	*/
	public Address addItem(OrderItem... item) {
		if(this.itemList==null) itemList=new ArrayList<>();
		this.itemList.addAll(Arrays.asList(item));
		return this;
	}

	/**
	 * 将自己转换成指定类型的PO
	 * @param poType  PO类型
	 * @return Address , 转换好的 Address 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return Address , 转换好的 PoJo 对象
	*/
	@Transient
	public <T> T toPojo(Class<T> pojoType) {
		if(Entity.class.isAssignableFrom(pojoType)) {
			return (T)this.toPO((Class<Entity>)pojoType);
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
	 * 克隆当前对象
	*/
	@Transient
	public Address clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public Address duplicate(boolean all) {
		com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta.$$proxy$$ inst = new com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta.$$proxy$$();
		inst.setAddress(this.getAddress());
		inst.setUpdateTime(this.getUpdateTime());
		inst.setRegionLocation(this.getRegionLocation());
		inst.setVersion(this.getVersion());
		inst.setCreateBy(this.getCreateBy());
		inst.setPhoneNumber(this.getPhoneNumber());
		inst.setDeleted(this.getDeleted());
		inst.setRegionType(this.getRegionType());
		inst.setCreateTime(this.getCreateTime());
		inst.setUpdateBy(this.getUpdateBy());
		inst.setDeleteTime(this.getDeleteTime());
		inst.setName(this.getName());
		inst.setDeleteBy(this.getDeleteBy());
		inst.setId(this.getId());
		if(all) {
			inst.setGoodsList(this.getGoodsList());
			inst.setOrderList(this.getOrderList());
			inst.setItemList(this.getItemList());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public Address clone(boolean deep) {
		return EntityContext.clone(Address.class,this,deep);
	}

	/**
	 * 将 Map 转换成 Address
	 * @param addressMap 包含实体信息的 Map 对象
	 * @return Address , 转换好的的 Address 对象
	*/
	@Transient
	public static Address createFrom(Map<String,Object> addressMap) {
		if(addressMap==null) return null;
		Address po = create();
		EntityContext.copyProperties(po,addressMap);
		po.clearModifies();
		return po;
	}

	/**
	 * 将 Pojo 转换成 Address
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return Address , 转换好的的 Address 对象
	*/
	@Transient
	public static Address createFrom(Object pojo) {
		if(pojo==null) return null;
		Address po = create();
		EntityContext.copyProperties(po,pojo);
		po.clearModifies();
		return po;
	}

	/**
	 * 创建一个 Address，等同于 new
	 * @return Address 对象
	*/
	@Transient
	public static Address create() {
		return new com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta.$$proxy$$();
	}

	/**
	 * 从 Map 读取
	 * @param map 记录数据
	 * @param cast 是否用 DataParser 进行类型转换
	 * @return  是否读取成功
	*/
	public boolean read(Map<String, Object> map,boolean cast) {
		if(map==null) return false;
		if(cast) {
			this.setAddress(DataParser.parse(String.class, map.get(AddressMeta.ADDRESS)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(AddressMeta.UPDATE_TIME)));
			this.setRegionLocation(DataParser.parse(String.class, map.get(AddressMeta.REGION_LOCATION)));
			this.setVersion(DataParser.parse(Integer.class, map.get(AddressMeta.VERSION)));
			this.setCreateBy(DataParser.parse(String.class, map.get(AddressMeta.CREATE_BY)));
			this.setPhoneNumber(DataParser.parse(String.class, map.get(AddressMeta.PHONE_NUMBER)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(AddressMeta.DELETED)));
			this.setRegionType(DataParser.parse(String.class, map.get(AddressMeta.REGION_TYPE)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(AddressMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(AddressMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(AddressMeta.DELETE_TIME)));
			this.setName(DataParser.parse(String.class, map.get(AddressMeta.NAME)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(AddressMeta.DELETE_BY)));
			this.setId(DataParser.parse(String.class, map.get(AddressMeta.ID)));
			// others
			return true;
		} else {
			try {
				this.setAddress( (String)map.get(AddressMeta.ADDRESS));
				this.setUpdateTime( (Date)map.get(AddressMeta.UPDATE_TIME));
				this.setRegionLocation( (String)map.get(AddressMeta.REGION_LOCATION));
				this.setVersion( (Integer)map.get(AddressMeta.VERSION));
				this.setCreateBy( (String)map.get(AddressMeta.CREATE_BY));
				this.setPhoneNumber( (String)map.get(AddressMeta.PHONE_NUMBER));
				this.setDeleted( (Integer)map.get(AddressMeta.DELETED));
				this.setRegionType( (String)map.get(AddressMeta.REGION_TYPE));
				this.setCreateTime( (Date)map.get(AddressMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(AddressMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(AddressMeta.DELETE_TIME));
				this.setName( (String)map.get(AddressMeta.NAME));
				this.setDeleteBy( (String)map.get(AddressMeta.DELETE_BY));
				this.setId( (String)map.get(AddressMeta.ID));
				// others
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * 从 Map 读取
	 * @param r 记录数据
	 * @param cast 是否用 DataParser 进行类型转换
	 * @return  是否读取成功
	*/
	public boolean read(ExprRcd r,boolean cast) {
		if(r==null) return false;
		if(cast) {
			this.setAddress(DataParser.parse(String.class, r.getValue(AddressMeta.ADDRESS)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(AddressMeta.UPDATE_TIME)));
			this.setRegionLocation(DataParser.parse(String.class, r.getValue(AddressMeta.REGION_LOCATION)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(AddressMeta.VERSION)));
			this.setCreateBy(DataParser.parse(String.class, r.getValue(AddressMeta.CREATE_BY)));
			this.setPhoneNumber(DataParser.parse(String.class, r.getValue(AddressMeta.PHONE_NUMBER)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(AddressMeta.DELETED)));
			this.setRegionType(DataParser.parse(String.class, r.getValue(AddressMeta.REGION_TYPE)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(AddressMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(AddressMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(AddressMeta.DELETE_TIME)));
			this.setName(DataParser.parse(String.class, r.getValue(AddressMeta.NAME)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(AddressMeta.DELETE_BY)));
			this.setId(DataParser.parse(String.class, r.getValue(AddressMeta.ID)));
			return true;
		} else {
			try {
				this.setAddress( (String)r.getValue(AddressMeta.ADDRESS));
				this.setUpdateTime( (Date)r.getValue(AddressMeta.UPDATE_TIME));
				this.setRegionLocation( (String)r.getValue(AddressMeta.REGION_LOCATION));
				this.setVersion( (Integer)r.getValue(AddressMeta.VERSION));
				this.setCreateBy( (String)r.getValue(AddressMeta.CREATE_BY));
				this.setPhoneNumber( (String)r.getValue(AddressMeta.PHONE_NUMBER));
				this.setDeleted( (Integer)r.getValue(AddressMeta.DELETED));
				this.setRegionType( (String)r.getValue(AddressMeta.REGION_TYPE));
				this.setCreateTime( (Date)r.getValue(AddressMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(AddressMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(AddressMeta.DELETE_TIME));
				this.setName( (String)r.getValue(AddressMeta.NAME));
				this.setDeleteBy( (String)r.getValue(AddressMeta.DELETE_BY));
				this.setId( (String)r.getValue(AddressMeta.ID));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}