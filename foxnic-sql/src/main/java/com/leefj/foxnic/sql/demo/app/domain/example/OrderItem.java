package com.leefj.foxnic.sql.demo.app.domain.example;

import com.github.foxnic.dao.entity.Entity;
import javax.persistence.Table;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables.EXAMPLE_ORDER_ITEM;
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
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderItemMeta;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * example_order_item
 * <p>example_order_item , 数据表 example_order_item 的PO类型</p>
 * @author LeeFJ
 * @since 2023-01-03 16:26:44
 * @sign EA996C0BD45E82F68CC0A0F808D80DC6
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

@Table(name = "example_order_item")
public class OrderItem extends Entity {

	private static final long serialVersionUID = 1L;

	public static final DBTable TABLE =EXAMPLE_ORDER_ITEM.$TABLE;
	
	/**
	 * 主键：主键
	*/
	@Id
	private String id;
	
	/**
	 * 订单ID：订单ID
	*/
	private String orderId;
	
	/**
	 * 商品ID：商品ID
	*/
	private String goodsId;
	
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
	private Goods goods;
	
	/**
	 * 收件地址：收件地址，包括收件人以及手机号码
	*/
	private Address address;
	
	/**
	 * 订单：订单
	*/
	private List<Order> order;
	
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
	public OrderItem setId(String id) {
		this.id=id;
		return this;
	}
	
	/**
	 * 获得 订单ID<br>
	 * 订单ID
	 * @return 订单ID
	*/
	public String getOrderId() {
		return orderId;
	}
	
	/**
	 * 设置 订单ID
	 * @param orderId 订单ID
	 * @return 当前对象
	*/
	public OrderItem setOrderId(String orderId) {
		this.orderId=orderId;
		return this;
	}
	
	/**
	 * 获得 商品ID<br>
	 * 商品ID
	 * @return 商品ID
	*/
	public String getGoodsId() {
		return goodsId;
	}
	
	/**
	 * 设置 商品ID
	 * @param goodsId 商品ID
	 * @return 当前对象
	*/
	public OrderItem setGoodsId(String goodsId) {
		this.goodsId=goodsId;
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
	public OrderItem setCreateBy(String createBy) {
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
	public OrderItem setCreateTime(Date createTime) {
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
	public OrderItem setUpdateBy(String updateBy) {
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
	public OrderItem setUpdateTime(Date updateTime) {
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
	public OrderItem setDeleted(Integer deleted) {
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
	public OrderItem setDeleted(Boolean deletedBool) {
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
	public OrderItem setDeleteBy(String deleteBy) {
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
	public OrderItem setDeleteTime(Date deleteTime) {
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
	public OrderItem setVersion(Integer version) {
		this.version=version;
		return this;
	}
	
	/**
	 * 获得 订单明细商品<br>
	 * 订单明细商品
	 * @return 订单明细商品
	*/
	public Goods getGoods() {
		return goods;
	}
	
	/**
	 * 设置 订单明细商品
	 * @param goods 订单明细商品
	 * @return 当前对象
	*/
	public OrderItem setGoods(Goods goods) {
		this.goods=goods;
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
	public OrderItem setAddress(Address address) {
		this.address=address;
		return this;
	}
	
	/**
	 * 获得 订单<br>
	 * 订单
	 * @return 订单
	*/
	public List<Order> getOrder() {
		return order;
	}
	
	/**
	 * 设置 订单
	 * @param order 订单
	 * @return 当前对象
	*/
	public OrderItem setOrder(List<Order> order) {
		this.order=order;
		return this;
	}
	
	/**
	 * 添加 订单
	 * @param entity 订单
	 * @return 当前对象
	*/
	public OrderItem addOrder(Order... entity) {
		if(this.order==null) order=new ArrayList<>();
		this.order.addAll(Arrays.asList(entity));
		return this;
	}

	/**
	 * 将自己转换成指定类型的PO
	 * @param poType  PO类型
	 * @return OrderItem , 转换好的 OrderItem 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return OrderItem , 转换好的 PoJo 对象
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
	public OrderItem clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public OrderItem duplicate(boolean all) {
		com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderItemMeta.$$proxy$$ inst = new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderItemMeta.$$proxy$$();
		inst.setCreateBy(this.getCreateBy());
		inst.setDeleted(this.getDeleted());
		inst.setOrderId(this.getOrderId());
		inst.setCreateTime(this.getCreateTime());
		inst.setUpdateBy(this.getUpdateBy());
		inst.setDeleteTime(this.getDeleteTime());
		inst.setGoodsId(this.getGoodsId());
		inst.setDeleteBy(this.getDeleteBy());
		inst.setUpdateTime(this.getUpdateTime());
		inst.setId(this.getId());
		inst.setVersion(this.getVersion());
		if(all) {
			inst.setAddress(this.getAddress());
			inst.setGoods(this.getGoods());
			inst.setOrder(this.getOrder());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public OrderItem clone(boolean deep) {
		return EntityContext.clone(OrderItem.class,this,deep);
	}

	/**
	 * 将 Map 转换成 OrderItem
	 * @param orderItemMap 包含实体信息的 Map 对象
	 * @return OrderItem , 转换好的的 OrderItem 对象
	*/
	@Transient
	public static OrderItem createFrom(Map<String,Object> orderItemMap) {
		if(orderItemMap==null) return null;
		OrderItem po = create();
		EntityContext.copyProperties(po,orderItemMap);
		po.clearModifies();
		return po;
	}

	/**
	 * 将 Pojo 转换成 OrderItem
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return OrderItem , 转换好的的 OrderItem 对象
	*/
	@Transient
	public static OrderItem createFrom(Object pojo) {
		if(pojo==null) return null;
		OrderItem po = create();
		EntityContext.copyProperties(po,pojo);
		po.clearModifies();
		return po;
	}

	/**
	 * 创建一个 OrderItem，等同于 new
	 * @return OrderItem 对象
	*/
	@Transient
	public static OrderItem create() {
		return new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderItemMeta.$$proxy$$();
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
			this.setCreateBy(DataParser.parse(String.class, map.get(OrderItemMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(OrderItemMeta.DELETED)));
			this.setOrderId(DataParser.parse(String.class, map.get(OrderItemMeta.ORDER_ID)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(OrderItemMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(OrderItemMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(OrderItemMeta.DELETE_TIME)));
			this.setGoodsId(DataParser.parse(String.class, map.get(OrderItemMeta.GOODS_ID)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(OrderItemMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(OrderItemMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, map.get(OrderItemMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, map.get(OrderItemMeta.VERSION)));
			// others
			this.setAddress(DataParser.parse(Address.class, map.get(OrderItemMeta.ADDRESS)));
			this.setGoods(DataParser.parse(Goods.class, map.get(OrderItemMeta.GOODS)));
			return true;
		} else {
			try {
				this.setCreateBy( (String)map.get(OrderItemMeta.CREATE_BY));
				this.setDeleted( (Integer)map.get(OrderItemMeta.DELETED));
				this.setOrderId( (String)map.get(OrderItemMeta.ORDER_ID));
				this.setCreateTime( (Date)map.get(OrderItemMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(OrderItemMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(OrderItemMeta.DELETE_TIME));
				this.setGoodsId( (String)map.get(OrderItemMeta.GOODS_ID));
				this.setDeleteBy( (String)map.get(OrderItemMeta.DELETE_BY));
				this.setUpdateTime( (Date)map.get(OrderItemMeta.UPDATE_TIME));
				this.setId( (String)map.get(OrderItemMeta.ID));
				this.setVersion( (Integer)map.get(OrderItemMeta.VERSION));
				// others
				this.setAddress( (Address)map.get(OrderItemMeta.ADDRESS));
				this.setGoods( (Goods)map.get(OrderItemMeta.GOODS));
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
			this.setCreateBy(DataParser.parse(String.class, r.getValue(OrderItemMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(OrderItemMeta.DELETED)));
			this.setOrderId(DataParser.parse(String.class, r.getValue(OrderItemMeta.ORDER_ID)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(OrderItemMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(OrderItemMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(OrderItemMeta.DELETE_TIME)));
			this.setGoodsId(DataParser.parse(String.class, r.getValue(OrderItemMeta.GOODS_ID)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(OrderItemMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(OrderItemMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, r.getValue(OrderItemMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(OrderItemMeta.VERSION)));
			return true;
		} else {
			try {
				this.setCreateBy( (String)r.getValue(OrderItemMeta.CREATE_BY));
				this.setDeleted( (Integer)r.getValue(OrderItemMeta.DELETED));
				this.setOrderId( (String)r.getValue(OrderItemMeta.ORDER_ID));
				this.setCreateTime( (Date)r.getValue(OrderItemMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(OrderItemMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(OrderItemMeta.DELETE_TIME));
				this.setGoodsId( (String)r.getValue(OrderItemMeta.GOODS_ID));
				this.setDeleteBy( (String)r.getValue(OrderItemMeta.DELETE_BY));
				this.setUpdateTime( (Date)r.getValue(OrderItemMeta.UPDATE_TIME));
				this.setId( (String)r.getValue(OrderItemMeta.ID));
				this.setVersion( (Integer)r.getValue(OrderItemMeta.VERSION));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}