package com.leefj.foxnic.sql.demo.app.domain.example.meta;

import com.github.foxnic.api.bean.BeanProperty;
import com.leefj.foxnic.sql.demo.app.domain.example.Goods;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.domain.example.OrderItem;
import javax.persistence.Transient;



/**
 * @author LeeFJ
 * @since 2023-01-03 16:26:43
 * @sign AB5019CBAAA17A8099E04840304D2E3D
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class GoodsMeta {
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final String ID="id";
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.String> ID_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,ID, java.lang.String.class, "主键", "主键", java.lang.String.class, null);
	
	/**
	 * 商品名 , 类型: java.lang.String
	*/
	public static final String NAME="name";
	
	/**
	 * 商品名 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.String> NAME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,NAME, java.lang.String.class, "商品名", "商品名", java.lang.String.class, null);
	
	/**
	 * 单价 , 类型: java.math.BigDecimal
	*/
	public static final String PRICE="price";
	
	/**
	 * 单价 , 类型: java.math.BigDecimal
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.math.BigDecimal> PRICE_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,PRICE, java.math.BigDecimal.class, "单价", "单价", java.math.BigDecimal.class, null);
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final String CREATE_BY="createBy";
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.String> CREATE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,CREATE_BY, java.lang.String.class, "创建人ID", "创建人ID", java.lang.String.class, null);
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final String CREATE_TIME="createTime";
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.util.Date> CREATE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,CREATE_TIME, java.util.Date.class, "创建时间", "创建时间", java.util.Date.class, null);
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final String UPDATE_BY="updateBy";
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.String> UPDATE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,UPDATE_BY, java.lang.String.class, "修改人ID", "修改人ID", java.lang.String.class, null);
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final String UPDATE_TIME="updateTime";
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.util.Date> UPDATE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,UPDATE_TIME, java.util.Date.class, "修改时间", "修改时间", java.util.Date.class, null);
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final String DELETED="deleted";
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.Integer> DELETED_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,DELETED, java.lang.Integer.class, "是否已删除", "是否已删除", java.lang.Integer.class, null);
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final String DELETE_BY="deleteBy";
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.String> DELETE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,DELETE_BY, java.lang.String.class, "删除人ID", "删除人ID", java.lang.String.class, null);
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final String DELETE_TIME="deleteTime";
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.util.Date> DELETE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,DELETE_TIME, java.util.Date.class, "删除时间", "删除时间", java.util.Date.class, null);
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final String VERSION="version";
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,java.lang.Integer> VERSION_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,VERSION, java.lang.Integer.class, "version", "version", java.lang.Integer.class, null);
	
	/**
	 * 订单明细商品 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Goods
	*/
	public static final String ORDER_LIST="orderList";
	
	/**
	 * 订单明细商品 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Goods
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,com.leefj.foxnic.sql.demo.app.domain.example.Goods> ORDER_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,ORDER_LIST, java.util.List.class, "订单明细商品", "订单明细商品", com.leefj.foxnic.sql.demo.app.domain.example.Goods.class, null);
	
	/**
	 * 收件地址 , 收件地址，包括收件人以及手机号码 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Address
	*/
	public static final String ADDRESS_LIST="addressList";
	
	/**
	 * 收件地址 , 收件地址，包括收件人以及手机号码 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Address
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,com.leefj.foxnic.sql.demo.app.domain.example.Address> ADDRESS_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,ADDRESS_LIST, java.util.List.class, "收件地址", "收件地址，包括收件人以及手机号码", com.leefj.foxnic.sql.demo.app.domain.example.Address.class, null);
	
	/**
	 * 订单明细 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.OrderItem
	*/
	public static final String ITEM_LIST="itemList";
	
	/**
	 * 订单明细 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.OrderItem
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.Goods,com.leefj.foxnic.sql.demo.app.domain.example.OrderItem> ITEM_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.Goods.class ,ITEM_LIST, java.util.List.class, "订单明细", "订单明细", com.leefj.foxnic.sql.demo.app.domain.example.OrderItem.class, null);
	
	/**
	 * 全部属性清单
	*/
	public static final String[] $PROPS={ ID , NAME , PRICE , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION , ORDER_LIST , ADDRESS_LIST , ITEM_LIST };
	
	/**
	 * 代理类
	*/
	public static class $$proxy$$ extends com.leefj.foxnic.sql.demo.app.domain.example.Goods {

		private static final long serialVersionUID = 1L;

		
		/**
		 * 设置 主键
		 * @param id 主键
		 * @return 当前对象
		*/
		public Goods setId(String id) {
			super.change(ID,super.getId(),id);
			super.setId(id);
			return this;
		}
		
		/**
		 * 设置 商品名
		 * @param name 商品名
		 * @return 当前对象
		*/
		public Goods setName(String name) {
			super.change(NAME,super.getName(),name);
			super.setName(name);
			return this;
		}
		
		/**
		 * 设置 单价
		 * @param price 单价
		 * @return 当前对象
		*/
		public Goods setPrice(BigDecimal price) {
			super.change(PRICE,super.getPrice(),price);
			super.setPrice(price);
			return this;
		}
		
		/**
		 * 设置 创建人ID
		 * @param createBy 创建人ID
		 * @return 当前对象
		*/
		public Goods setCreateBy(String createBy) {
			super.change(CREATE_BY,super.getCreateBy(),createBy);
			super.setCreateBy(createBy);
			return this;
		}
		
		/**
		 * 设置 创建时间
		 * @param createTime 创建时间
		 * @return 当前对象
		*/
		public Goods setCreateTime(Date createTime) {
			super.change(CREATE_TIME,super.getCreateTime(),createTime);
			super.setCreateTime(createTime);
			return this;
		}
		
		/**
		 * 设置 修改人ID
		 * @param updateBy 修改人ID
		 * @return 当前对象
		*/
		public Goods setUpdateBy(String updateBy) {
			super.change(UPDATE_BY,super.getUpdateBy(),updateBy);
			super.setUpdateBy(updateBy);
			return this;
		}
		
		/**
		 * 设置 修改时间
		 * @param updateTime 修改时间
		 * @return 当前对象
		*/
		public Goods setUpdateTime(Date updateTime) {
			super.change(UPDATE_TIME,super.getUpdateTime(),updateTime);
			super.setUpdateTime(updateTime);
			return this;
		}
		
		/**
		 * 设置 是否已删除
		 * @param deleted 是否已删除
		 * @return 当前对象
		*/
		public Goods setDeleted(Integer deleted) {
			super.change(DELETED,super.getDeleted(),deleted);
			super.setDeleted(deleted);
			return this;
		}
		
		/**
		 * 设置 删除人ID
		 * @param deleteBy 删除人ID
		 * @return 当前对象
		*/
		public Goods setDeleteBy(String deleteBy) {
			super.change(DELETE_BY,super.getDeleteBy(),deleteBy);
			super.setDeleteBy(deleteBy);
			return this;
		}
		
		/**
		 * 设置 删除时间
		 * @param deleteTime 删除时间
		 * @return 当前对象
		*/
		public Goods setDeleteTime(Date deleteTime) {
			super.change(DELETE_TIME,super.getDeleteTime(),deleteTime);
			super.setDeleteTime(deleteTime);
			return this;
		}
		
		/**
		 * 设置 version
		 * @param version version
		 * @return 当前对象
		*/
		public Goods setVersion(Integer version) {
			super.change(VERSION,super.getVersion(),version);
			super.setVersion(version);
			return this;
		}
		
		/**
		 * 设置 订单明细商品
		 * @param orderList 订单明细商品
		 * @return 当前对象
		*/
		public Goods setOrderList(List<Goods> orderList) {
			super.change(ORDER_LIST,super.getOrderList(),orderList);
			super.setOrderList(orderList);
			return this;
		}
		
		/**
		 * 设置 收件地址
		 * @param addressList 收件地址
		 * @return 当前对象
		*/
		public Goods setAddressList(List<Address> addressList) {
			super.change(ADDRESS_LIST,super.getAddressList(),addressList);
			super.setAddressList(addressList);
			return this;
		}
		
		/**
		 * 设置 订单明细
		 * @param itemList 订单明细
		 * @return 当前对象
		*/
		public Goods setItemList(List<OrderItem> itemList) {
			super.change(ITEM_LIST,super.getItemList(),itemList);
			super.setItemList(itemList);
			return this;
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
			$$proxy$$ inst=new $$proxy$$();
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

	}
}