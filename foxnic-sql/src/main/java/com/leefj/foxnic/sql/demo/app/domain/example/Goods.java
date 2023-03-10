package com.leefj.foxnic.sql.demo.app.domain.example;

import com.github.foxnic.dao.entity.Entity;
import javax.persistence.Table;
import com.github.foxnic.sql.meta.DBTable;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables.EXAMPLE_GOODS;
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
import com.leefj.foxnic.sql.demo.app.domain.example.meta.GoodsMeta;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * example_goods
 * <p>example_goods , 数据表 example_goods 的PO类型</p>
 * @author LeeFJ
 * @since 2023-01-03 16:26:43
 * @sign AB5019CBAAA17A8099E04840304D2E3D
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

@Table(name = "example_goods")
public class Goods extends Entity {

	private static final long serialVersionUID = 1L;

	public static final DBTable TABLE =EXAMPLE_GOODS.$TABLE;
	
	/**
	 * 主键：主键
	*/
	@Id
	private String id;
	
	/**
	 * 商品名：商品名
	*/
	private String name;
	
	/**
	 * 单价：单价
	*/
	private BigDecimal price;
	
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
	private List<Goods> orderList;
	
	/**
	 * 收件地址：收件地址，包括收件人以及手机号码
	*/
	private List<Address> addressList;
	
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
	public Goods setId(String id) {
		this.id=id;
		return this;
	}
	
	/**
	 * 获得 商品名<br>
	 * 商品名
	 * @return 商品名
	*/
	public String getName() {
		return name;
	}
	
	/**
	 * 设置 商品名
	 * @param name 商品名
	 * @return 当前对象
	*/
	public Goods setName(String name) {
		this.name=name;
		return this;
	}
	
	/**
	 * 获得 单价<br>
	 * 单价
	 * @return 单价
	*/
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * 设置 单价
	 * @param price 单价
	 * @return 当前对象
	*/
	public Goods setPrice(BigDecimal price) {
		this.price=price;
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
	public Goods setCreateBy(String createBy) {
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
	public Goods setCreateTime(Date createTime) {
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
	public Goods setUpdateBy(String updateBy) {
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
	public Goods setUpdateTime(Date updateTime) {
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
	public Goods setDeleted(Integer deleted) {
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
	public Goods setDeleted(Boolean deletedBool) {
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
	public Goods setDeleteBy(String deleteBy) {
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
	public Goods setDeleteTime(Date deleteTime) {
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
	public Goods setVersion(Integer version) {
		this.version=version;
		return this;
	}
	
	/**
	 * 获得 订单明细商品<br>
	 * 订单明细商品
	 * @return 订单明细商品
	*/
	public List<Goods> getOrderList() {
		return orderList;
	}
	
	/**
	 * 设置 订单明细商品
	 * @param orderList 订单明细商品
	 * @return 当前对象
	*/
	public Goods setOrderList(List<Goods> orderList) {
		this.orderList=orderList;
		return this;
	}
	
	/**
	 * 添加 订单明细商品
	 * @param order 订单明细商品
	 * @return 当前对象
	*/
	public Goods addOrder(Goods... order) {
		if(this.orderList==null) orderList=new ArrayList<>();
		this.orderList.addAll(Arrays.asList(order));
		return this;
	}
	
	/**
	 * 获得 收件地址<br>
	 * 收件地址，包括收件人以及手机号码
	 * @return 收件地址
	*/
	public List<Address> getAddressList() {
		return addressList;
	}
	
	/**
	 * 设置 收件地址
	 * @param addressList 收件地址
	 * @return 当前对象
	*/
	public Goods setAddressList(List<Address> addressList) {
		this.addressList=addressList;
		return this;
	}
	
	/**
	 * 添加 收件地址
	 * @param address 收件地址
	 * @return 当前对象
	*/
	public Goods addAddress(Address... address) {
		if(this.addressList==null) addressList=new ArrayList<>();
		this.addressList.addAll(Arrays.asList(address));
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
	public Goods setItemList(List<OrderItem> itemList) {
		this.itemList=itemList;
		return this;
	}
	
	/**
	 * 添加 订单明细
	 * @param item 订单明细
	 * @return 当前对象
	*/
	public Goods addItem(OrderItem... item) {
		if(this.itemList==null) itemList=new ArrayList<>();
		this.itemList.addAll(Arrays.asList(item));
		return this;
	}

	/**
	 * 将自己转换成指定类型的PO
	 * @param poType  PO类型
	 * @return Goods , 转换好的 Goods 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return Goods , 转换好的 PoJo 对象
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
	public Goods clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public Goods duplicate(boolean all) {
		com.leefj.foxnic.sql.demo.app.domain.example.meta.GoodsMeta.$$proxy$$ inst = new com.leefj.foxnic.sql.demo.app.domain.example.meta.GoodsMeta.$$proxy$$();
		inst.setCreateBy(this.getCreateBy());
		inst.setDeleted(this.getDeleted());
		inst.setCreateTime(this.getCreateTime());
		inst.setUpdateBy(this.getUpdateBy());
		inst.setDeleteTime(this.getDeleteTime());
		inst.setPrice(this.getPrice());
		inst.setName(this.getName());
		inst.setDeleteBy(this.getDeleteBy());
		inst.setUpdateTime(this.getUpdateTime());
		inst.setId(this.getId());
		inst.setVersion(this.getVersion());
		if(all) {
			inst.setAddressList(this.getAddressList());
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
	public Goods clone(boolean deep) {
		return EntityContext.clone(Goods.class,this,deep);
	}

	/**
	 * 将 Map 转换成 Goods
	 * @param goodsMap 包含实体信息的 Map 对象
	 * @return Goods , 转换好的的 Goods 对象
	*/
	@Transient
	public static Goods createFrom(Map<String,Object> goodsMap) {
		if(goodsMap==null) return null;
		Goods po = create();
		EntityContext.copyProperties(po,goodsMap);
		po.clearModifies();
		return po;
	}

	/**
	 * 将 Pojo 转换成 Goods
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return Goods , 转换好的的 Goods 对象
	*/
	@Transient
	public static Goods createFrom(Object pojo) {
		if(pojo==null) return null;
		Goods po = create();
		EntityContext.copyProperties(po,pojo);
		po.clearModifies();
		return po;
	}

	/**
	 * 创建一个 Goods，等同于 new
	 * @return Goods 对象
	*/
	@Transient
	public static Goods create() {
		return new com.leefj.foxnic.sql.demo.app.domain.example.meta.GoodsMeta.$$proxy$$();
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
			this.setCreateBy(DataParser.parse(String.class, map.get(GoodsMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(GoodsMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(GoodsMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(GoodsMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(GoodsMeta.DELETE_TIME)));
			this.setPrice(DataParser.parse(BigDecimal.class, map.get(GoodsMeta.PRICE)));
			this.setName(DataParser.parse(String.class, map.get(GoodsMeta.NAME)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(GoodsMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(GoodsMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, map.get(GoodsMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, map.get(GoodsMeta.VERSION)));
			// others
			return true;
		} else {
			try {
				this.setCreateBy( (String)map.get(GoodsMeta.CREATE_BY));
				this.setDeleted( (Integer)map.get(GoodsMeta.DELETED));
				this.setCreateTime( (Date)map.get(GoodsMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(GoodsMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(GoodsMeta.DELETE_TIME));
				this.setPrice( (BigDecimal)map.get(GoodsMeta.PRICE));
				this.setName( (String)map.get(GoodsMeta.NAME));
				this.setDeleteBy( (String)map.get(GoodsMeta.DELETE_BY));
				this.setUpdateTime( (Date)map.get(GoodsMeta.UPDATE_TIME));
				this.setId( (String)map.get(GoodsMeta.ID));
				this.setVersion( (Integer)map.get(GoodsMeta.VERSION));
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
			this.setCreateBy(DataParser.parse(String.class, r.getValue(GoodsMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(GoodsMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(GoodsMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(GoodsMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(GoodsMeta.DELETE_TIME)));
			this.setPrice(DataParser.parse(BigDecimal.class, r.getValue(GoodsMeta.PRICE)));
			this.setName(DataParser.parse(String.class, r.getValue(GoodsMeta.NAME)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(GoodsMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(GoodsMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, r.getValue(GoodsMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(GoodsMeta.VERSION)));
			return true;
		} else {
			try {
				this.setCreateBy( (String)r.getValue(GoodsMeta.CREATE_BY));
				this.setDeleted( (Integer)r.getValue(GoodsMeta.DELETED));
				this.setCreateTime( (Date)r.getValue(GoodsMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(GoodsMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(GoodsMeta.DELETE_TIME));
				this.setPrice( (BigDecimal)r.getValue(GoodsMeta.PRICE));
				this.setName( (String)r.getValue(GoodsMeta.NAME));
				this.setDeleteBy( (String)r.getValue(GoodsMeta.DELETE_BY));
				this.setUpdateTime( (Date)r.getValue(GoodsMeta.UPDATE_TIME));
				this.setId( (String)r.getValue(GoodsMeta.ID));
				this.setVersion( (Integer)r.getValue(GoodsMeta.VERSION));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}