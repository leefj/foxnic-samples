package com.leefj.foxnic.sql.demo.app.domain.example;

import com.github.foxnic.dao.entity.Entity;
import javax.persistence.Table;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables.EXAMPLE_ORDER;
import javax.persistence.Id;
import java.math.BigDecimal;
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
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * example_order
 * <p>example_order , 数据表 example_order 的PO类型</p>
 * @author LeeFJ
 * @since 2022-12-09 15:26:21
 * @sign 4EDC9637AA6024E2C0CBA960E1F20706
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

@Table(name = "example_order")
public class Order extends Entity {

	private static final long serialVersionUID = 1L;

	public static final DBTable TABLE =EXAMPLE_ORDER.$TABLE;
	
	/**
	 * 主键：主键
	*/
	@Id
	private String id;
	
	/**
	 * 订单编号：订单编号
	*/
	private String orderNo;
	
	/**
	 * 订单金额：订单金额
	*/
	private BigDecimal amount;
	
	/**
	 * 收件地址ID：收件地址ID
	*/
	private String addressId;
	
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
	 * version：version
	*/
	private Integer version;
	
	/**
	 * 订单明细商品：订单明细商品
	*/
	private List<Goods> goodsList;
	
	/**
	 * 收件地址：收件地址，包括收件人以及手机号码
	*/
	private Address address;
	
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
	public Order setId(String id) {
		this.id=id;
		return this;
	}
	
	/**
	 * 获得 订单编号<br>
	 * 订单编号
	 * @return 订单编号
	*/
	public String getOrderNo() {
		return orderNo;
	}
	
	/**
	 * 设置 订单编号
	 * @param orderNo 订单编号
	 * @return 当前对象
	*/
	public Order setOrderNo(String orderNo) {
		this.orderNo=orderNo;
		return this;
	}
	
	/**
	 * 获得 订单金额<br>
	 * 订单金额
	 * @return 订单金额
	*/
	public BigDecimal getAmount() {
		return amount;
	}
	
	/**
	 * 设置 订单金额
	 * @param amount 订单金额
	 * @return 当前对象
	*/
	public Order setAmount(BigDecimal amount) {
		this.amount=amount;
		return this;
	}
	
	/**
	 * 获得 收件地址ID<br>
	 * 收件地址ID
	 * @return 收件地址ID
	*/
	public String getAddressId() {
		return addressId;
	}
	
	/**
	 * 设置 收件地址ID
	 * @param addressId 收件地址ID
	 * @return 当前对象
	*/
	public Order setAddressId(String addressId) {
		this.addressId=addressId;
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
	public Order setCreateBy(String createBy) {
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
	public Order setCreateTime(Date createTime) {
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
	public Order setUpdateBy(String updateBy) {
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
	public Order setUpdateTime(Date updateTime) {
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
	public Order setDeleted(Integer deleted) {
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
	public Order setDeleted(Boolean deletedBool) {
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
	public Order setDeleteBy(String deleteBy) {
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
	public Order setDeleteTime(Date deleteTime) {
		this.deleteTime=deleteTime;
		return this;
	}
	
	/**
	 * 获得 version<br>
	 * version
	 * @return version
	*/
	public Integer getVersion() {
		return version;
	}
	
	/**
	 * 设置 version
	 * @param version version
	 * @return 当前对象
	*/
	public Order setVersion(Integer version) {
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
	public Order setGoodsList(List<Goods> goodsList) {
		this.goodsList=goodsList;
		return this;
	}
	
	/**
	 * 添加 订单明细商品
	 * @param goods 订单明细商品
	 * @return 当前对象
	*/
	public Order addGoods(Goods... goods) {
		if(this.goodsList==null) goodsList=new ArrayList<>();
		this.goodsList.addAll(Arrays.asList(goods));
		return this;
	}
	
	/**
	 * 获得 收件地址<br>
	 * 收件地址，包括收件人以及手机号码
	 * @return 收件地址
	*/
	public Address getAddress() {
		return address;
	}
	
	/**
	 * 设置 收件地址
	 * @param address 收件地址
	 * @return 当前对象
	*/
	public Order setAddress(Address address) {
		this.address=address;
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
	public Order setItemList(List<OrderItem> itemList) {
		this.itemList=itemList;
		return this;
	}
	
	/**
	 * 添加 订单明细
	 * @param item 订单明细
	 * @return 当前对象
	*/
	public Order addItem(OrderItem... item) {
		if(this.itemList==null) itemList=new ArrayList<>();
		this.itemList.addAll(Arrays.asList(item));
		return this;
	}

	/**
	 * 将自己转换成指定类型的PO
	 * @param poType  PO类型
	 * @return Order , 转换好的 Order 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return Order , 转换好的 PoJo 对象
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
	public Order clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public Order duplicate(boolean all) {
		com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta.$$proxy$$ inst = new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta.$$proxy$$();
		inst.setAmount(this.getAmount());
		inst.setCreateBy(this.getCreateBy());
		inst.setOrderNo(this.getOrderNo());
		inst.setDeleted(this.getDeleted());
		inst.setCreateTime(this.getCreateTime());
		inst.setUpdateBy(this.getUpdateBy());
		inst.setDeleteTime(this.getDeleteTime());
		inst.setDeleteBy(this.getDeleteBy());
		inst.setUpdateTime(this.getUpdateTime());
		inst.setId(this.getId());
		inst.setVersion(this.getVersion());
		inst.setAddressId(this.getAddressId());
		if(all) {
			inst.setAddress(this.getAddress());
			inst.setGoodsList(this.getGoodsList());
			inst.setItemList(this.getItemList());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public Order clone(boolean deep) {
		return EntityContext.clone(Order.class,this,deep);
	}

	/**
	 * 将 Map 转换成 Order
	 * @param orderMap 包含实体信息的 Map 对象
	 * @return Order , 转换好的的 Order 对象
	*/
	@Transient
	public static Order createFrom(Map<String,Object> orderMap) {
		if(orderMap==null) return null;
		Order po = create();
		EntityContext.copyProperties(po,orderMap);
		po.clearModifies();
		return po;
	}

	/**
	 * 将 Pojo 转换成 Order
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return Order , 转换好的的 Order 对象
	*/
	@Transient
	public static Order createFrom(Object pojo) {
		if(pojo==null) return null;
		Order po = create();
		EntityContext.copyProperties(po,pojo);
		po.clearModifies();
		return po;
	}

	/**
	 * 创建一个 Order，等同于 new
	 * @return Order 对象
	*/
	@Transient
	public static Order create() {
		return new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta.$$proxy$$();
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
			this.setAmount(DataParser.parse(BigDecimal.class, map.get(OrderMeta.AMOUNT)));
			this.setCreateBy(DataParser.parse(String.class, map.get(OrderMeta.CREATE_BY)));
			this.setOrderNo(DataParser.parse(String.class, map.get(OrderMeta.ORDER_NO)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(OrderMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(OrderMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(OrderMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(OrderMeta.DELETE_TIME)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(OrderMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(OrderMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, map.get(OrderMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, map.get(OrderMeta.VERSION)));
			this.setAddressId(DataParser.parse(String.class, map.get(OrderMeta.ADDRESS_ID)));
			// others
			this.setAddress(DataParser.parse(Address.class, map.get(OrderMeta.ADDRESS)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)map.get(OrderMeta.AMOUNT));
				this.setCreateBy( (String)map.get(OrderMeta.CREATE_BY));
				this.setOrderNo( (String)map.get(OrderMeta.ORDER_NO));
				this.setDeleted( (Integer)map.get(OrderMeta.DELETED));
				this.setCreateTime( (Date)map.get(OrderMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(OrderMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(OrderMeta.DELETE_TIME));
				this.setDeleteBy( (String)map.get(OrderMeta.DELETE_BY));
				this.setUpdateTime( (Date)map.get(OrderMeta.UPDATE_TIME));
				this.setId( (String)map.get(OrderMeta.ID));
				this.setVersion( (Integer)map.get(OrderMeta.VERSION));
				this.setAddressId( (String)map.get(OrderMeta.ADDRESS_ID));
				// others
				this.setAddress( (Address)map.get(OrderMeta.ADDRESS));
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
			this.setAmount(DataParser.parse(BigDecimal.class, r.getValue(OrderMeta.AMOUNT)));
			this.setCreateBy(DataParser.parse(String.class, r.getValue(OrderMeta.CREATE_BY)));
			this.setOrderNo(DataParser.parse(String.class, r.getValue(OrderMeta.ORDER_NO)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(OrderMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(OrderMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(OrderMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(OrderMeta.DELETE_TIME)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(OrderMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(OrderMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, r.getValue(OrderMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(OrderMeta.VERSION)));
			this.setAddressId(DataParser.parse(String.class, r.getValue(OrderMeta.ADDRESS_ID)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)r.getValue(OrderMeta.AMOUNT));
				this.setCreateBy( (String)r.getValue(OrderMeta.CREATE_BY));
				this.setOrderNo( (String)r.getValue(OrderMeta.ORDER_NO));
				this.setDeleted( (Integer)r.getValue(OrderMeta.DELETED));
				this.setCreateTime( (Date)r.getValue(OrderMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(OrderMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(OrderMeta.DELETE_TIME));
				this.setDeleteBy( (String)r.getValue(OrderMeta.DELETE_BY));
				this.setUpdateTime( (Date)r.getValue(OrderMeta.UPDATE_TIME));
				this.setId( (String)r.getValue(OrderMeta.ID));
				this.setVersion( (Integer)r.getValue(OrderMeta.VERSION));
				this.setAddressId( (String)r.getValue(OrderMeta.ADDRESS_ID));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}