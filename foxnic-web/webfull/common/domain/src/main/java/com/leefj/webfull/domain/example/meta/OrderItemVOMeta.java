package com.leefj.webfull.domain.example.meta;

import com.github.foxnic.api.bean.BeanProperty;
import com.leefj.webfull.domain.example.OrderItemVO;
import java.util.List;
import com.leefj.webfull.domain.example.OrderItem;
import java.util.Date;
import com.leefj.webfull.domain.example.Goods;
import javax.persistence.Transient;



/**
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-09-16 19:09:36
 * @sign F1A87AD1DF163FF7F29F5EE169DBAA9B
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class OrderItemVOMeta extends OrderItemMeta {
	
	/**
	 * 页码 , 类型: java.lang.Integer
	*/
	public static final String PAGE_INDEX="pageIndex";
	
	/**
	 * 页码 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.Integer> PAGE_INDEX_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,PAGE_INDEX, java.lang.Integer.class, "页码", "", java.lang.Integer.class, null);
	
	/**
	 * 分页大小 , 类型: java.lang.Integer
	*/
	public static final String PAGE_SIZE="pageSize";
	
	/**
	 * 分页大小 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.Integer> PAGE_SIZE_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,PAGE_SIZE, java.lang.Integer.class, "分页大小", "", java.lang.Integer.class, null);
	
	/**
	 * 搜索字段 , 类型: java.lang.String
	*/
	public static final String SEARCH_FIELD="searchField";
	
	/**
	 * 搜索字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> SEARCH_FIELD_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,SEARCH_FIELD, java.lang.String.class, "搜索字段", "", java.lang.String.class, null);
	
	/**
	 * 模糊搜索字段 , 类型: java.lang.String
	*/
	public static final String FUZZY_FIELD="fuzzyField";
	
	/**
	 * 模糊搜索字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> FUZZY_FIELD_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,FUZZY_FIELD, java.lang.String.class, "模糊搜索字段", "", java.lang.String.class, null);
	
	/**
	 * 搜索的值 , 类型: java.lang.String
	*/
	public static final String SEARCH_VALUE="searchValue";
	
	/**
	 * 搜索的值 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> SEARCH_VALUE_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,SEARCH_VALUE, java.lang.String.class, "搜索的值", "", java.lang.String.class, null);
	
	/**
	 * 已修改字段 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final String DIRTY_FIELDS="dirtyFields";
	
	/**
	 * 已修改字段 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> DIRTY_FIELDS_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,DIRTY_FIELDS, java.util.List.class, "已修改字段", "", java.lang.String.class, null);
	
	/**
	 * 排序字段 , 类型: java.lang.String
	*/
	public static final String SORT_FIELD="sortField";
	
	/**
	 * 排序字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> SORT_FIELD_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,SORT_FIELD, java.lang.String.class, "排序字段", "", java.lang.String.class, null);
	
	/**
	 * 排序方式 , 类型: java.lang.String
	*/
	public static final String SORT_TYPE="sortType";
	
	/**
	 * 排序方式 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> SORT_TYPE_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,SORT_TYPE, java.lang.String.class, "排序方式", "", java.lang.String.class, null);
	
	/**
	 * 主键清单 , 用于接收批量主键参数 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final String IDS="ids";
	
	/**
	 * 主键清单 , 用于接收批量主键参数 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> IDS_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,IDS, java.util.List.class, "主键清单", "用于接收批量主键参数", java.lang.String.class, null);
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final String ID="id";
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> ID_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,ID, java.lang.String.class, "主键", "主键", java.lang.String.class, null);
	
	/**
	 * 订单ID , 类型: java.lang.String
	*/
	public static final String ORDER_ID="orderId";
	
	/**
	 * 订单ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> ORDER_ID_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,ORDER_ID, java.lang.String.class, "订单ID", "订单ID", java.lang.String.class, null);
	
	/**
	 * 商品ID , 类型: java.lang.String
	*/
	public static final String GOODS_ID="goodsId";
	
	/**
	 * 商品ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> GOODS_ID_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,GOODS_ID, java.lang.String.class, "商品ID", "商品ID", java.lang.String.class, null);
	
	/**
	 * 数量 , 类型: java.lang.Integer
	*/
	public static final String AMOUNT="amount";
	
	/**
	 * 数量 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.Integer> AMOUNT_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,AMOUNT, java.lang.Integer.class, "数量", "数量", java.lang.Integer.class, null);
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final String CREATE_BY="createBy";
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> CREATE_BY_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,CREATE_BY, java.lang.String.class, "创建人ID", "创建人ID", java.lang.String.class, null);
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final String CREATE_TIME="createTime";
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.util.Date> CREATE_TIME_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,CREATE_TIME, java.util.Date.class, "创建时间", "创建时间", java.util.Date.class, null);
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final String UPDATE_BY="updateBy";
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> UPDATE_BY_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,UPDATE_BY, java.lang.String.class, "修改人ID", "修改人ID", java.lang.String.class, null);
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final String UPDATE_TIME="updateTime";
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.util.Date> UPDATE_TIME_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,UPDATE_TIME, java.util.Date.class, "修改时间", "修改时间", java.util.Date.class, null);
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final String DELETED="deleted";
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.Integer> DELETED_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,DELETED, java.lang.Integer.class, "是否已删除", "是否已删除", java.lang.Integer.class, null);
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final String DELETE_BY="deleteBy";
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.String> DELETE_BY_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,DELETE_BY, java.lang.String.class, "删除人ID", "删除人ID", java.lang.String.class, null);
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final String DELETE_TIME="deleteTime";
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.util.Date> DELETE_TIME_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,DELETE_TIME, java.util.Date.class, "删除时间", "删除时间", java.util.Date.class, null);
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final String VERSION="version";
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,java.lang.Integer> VERSION_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,VERSION, java.lang.Integer.class, "version", "version", java.lang.Integer.class, null);
	
	/**
	 * 商品 , 关联的商品 , 类型: com.leefj.webfull.domain.example.Goods
	*/
	public static final String GOODS="goods";
	
	/**
	 * 商品 , 关联的商品 , 类型: com.leefj.webfull.domain.example.Goods
	*/
	public static final BeanProperty<com.leefj.webfull.domain.example.OrderItemVO,com.leefj.webfull.domain.example.Goods> GOODS_PROP = new BeanProperty(com.leefj.webfull.domain.example.OrderItemVO.class ,GOODS, com.leefj.webfull.domain.example.Goods.class, "商品", "关联的商品", com.leefj.webfull.domain.example.Goods.class, null);
	
	/**
	 * 全部属性清单
	*/
	public static final String[] $PROPS={ PAGE_INDEX , PAGE_SIZE , SEARCH_FIELD , FUZZY_FIELD , SEARCH_VALUE , DIRTY_FIELDS , SORT_FIELD , SORT_TYPE , IDS , ID , ORDER_ID , GOODS_ID , AMOUNT , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION , GOODS };
	
	/**
	 * 代理类
	*/
	public static class $$proxy$$ extends com.leefj.webfull.domain.example.OrderItemVO {

		private static final long serialVersionUID = 1L;

		
		/**
		 * 设置 页码
		 * @param pageIndex 页码
		 * @return 当前对象
		*/
		public OrderItemVO setPageIndex(Integer pageIndex) {
			super.change(PAGE_INDEX,super.getPageIndex(),pageIndex);
			super.setPageIndex(pageIndex);
			return this;
		}
		
		/**
		 * 设置 分页大小
		 * @param pageSize 分页大小
		 * @return 当前对象
		*/
		public OrderItemVO setPageSize(Integer pageSize) {
			super.change(PAGE_SIZE,super.getPageSize(),pageSize);
			super.setPageSize(pageSize);
			return this;
		}
		
		/**
		 * 设置 搜索字段
		 * @param searchField 搜索字段
		 * @return 当前对象
		*/
		public OrderItemVO setSearchField(String searchField) {
			super.change(SEARCH_FIELD,super.getSearchField(),searchField);
			super.setSearchField(searchField);
			return this;
		}
		
		/**
		 * 设置 模糊搜索字段
		 * @param fuzzyField 模糊搜索字段
		 * @return 当前对象
		*/
		public OrderItemVO setFuzzyField(String fuzzyField) {
			super.change(FUZZY_FIELD,super.getFuzzyField(),fuzzyField);
			super.setFuzzyField(fuzzyField);
			return this;
		}
		
		/**
		 * 设置 搜索的值
		 * @param searchValue 搜索的值
		 * @return 当前对象
		*/
		public OrderItemVO setSearchValue(String searchValue) {
			super.change(SEARCH_VALUE,super.getSearchValue(),searchValue);
			super.setSearchValue(searchValue);
			return this;
		}
		
		/**
		 * 设置 已修改字段
		 * @param dirtyFields 已修改字段
		 * @return 当前对象
		*/
		public OrderItemVO setDirtyFields(List<String> dirtyFields) {
			super.change(DIRTY_FIELDS,super.getDirtyFields(),dirtyFields);
			super.setDirtyFields(dirtyFields);
			return this;
		}
		
		/**
		 * 设置 排序字段
		 * @param sortField 排序字段
		 * @return 当前对象
		*/
		public OrderItemVO setSortField(String sortField) {
			super.change(SORT_FIELD,super.getSortField(),sortField);
			super.setSortField(sortField);
			return this;
		}
		
		/**
		 * 设置 排序方式
		 * @param sortType 排序方式
		 * @return 当前对象
		*/
		public OrderItemVO setSortType(String sortType) {
			super.change(SORT_TYPE,super.getSortType(),sortType);
			super.setSortType(sortType);
			return this;
		}
		
		/**
		 * 设置 主键清单
		 * @param ids 主键清单
		 * @return 当前对象
		*/
		public OrderItemVO setIds(List<String> ids) {
			super.change(IDS,super.getIds(),ids);
			super.setIds(ids);
			return this;
		}
		
		/**
		 * 设置 主键
		 * @param id 主键
		 * @return 当前对象
		*/
		public OrderItem setId(String id) {
			super.change(ID,super.getId(),id);
			super.setId(id);
			return this;
		}
		
		/**
		 * 设置 订单ID
		 * @param orderId 订单ID
		 * @return 当前对象
		*/
		public OrderItem setOrderId(String orderId) {
			super.change(ORDER_ID,super.getOrderId(),orderId);
			super.setOrderId(orderId);
			return this;
		}
		
		/**
		 * 设置 商品ID
		 * @param goodsId 商品ID
		 * @return 当前对象
		*/
		public OrderItem setGoodsId(String goodsId) {
			super.change(GOODS_ID,super.getGoodsId(),goodsId);
			super.setGoodsId(goodsId);
			return this;
		}
		
		/**
		 * 设置 数量
		 * @param amount 数量
		 * @return 当前对象
		*/
		public OrderItem setAmount(Integer amount) {
			super.change(AMOUNT,super.getAmount(),amount);
			super.setAmount(amount);
			return this;
		}
		
		/**
		 * 设置 创建人ID
		 * @param createBy 创建人ID
		 * @return 当前对象
		*/
		public OrderItem setCreateBy(String createBy) {
			super.change(CREATE_BY,super.getCreateBy(),createBy);
			super.setCreateBy(createBy);
			return this;
		}
		
		/**
		 * 设置 创建时间
		 * @param createTime 创建时间
		 * @return 当前对象
		*/
		public OrderItem setCreateTime(Date createTime) {
			super.change(CREATE_TIME,super.getCreateTime(),createTime);
			super.setCreateTime(createTime);
			return this;
		}
		
		/**
		 * 设置 修改人ID
		 * @param updateBy 修改人ID
		 * @return 当前对象
		*/
		public OrderItem setUpdateBy(String updateBy) {
			super.change(UPDATE_BY,super.getUpdateBy(),updateBy);
			super.setUpdateBy(updateBy);
			return this;
		}
		
		/**
		 * 设置 修改时间
		 * @param updateTime 修改时间
		 * @return 当前对象
		*/
		public OrderItem setUpdateTime(Date updateTime) {
			super.change(UPDATE_TIME,super.getUpdateTime(),updateTime);
			super.setUpdateTime(updateTime);
			return this;
		}
		
		/**
		 * 设置 是否已删除
		 * @param deleted 是否已删除
		 * @return 当前对象
		*/
		public OrderItem setDeleted(Integer deleted) {
			super.change(DELETED,super.getDeleted(),deleted);
			super.setDeleted(deleted);
			return this;
		}
		
		/**
		 * 设置 删除人ID
		 * @param deleteBy 删除人ID
		 * @return 当前对象
		*/
		public OrderItem setDeleteBy(String deleteBy) {
			super.change(DELETE_BY,super.getDeleteBy(),deleteBy);
			super.setDeleteBy(deleteBy);
			return this;
		}
		
		/**
		 * 设置 删除时间
		 * @param deleteTime 删除时间
		 * @return 当前对象
		*/
		public OrderItem setDeleteTime(Date deleteTime) {
			super.change(DELETE_TIME,super.getDeleteTime(),deleteTime);
			super.setDeleteTime(deleteTime);
			return this;
		}
		
		/**
		 * 设置 version
		 * @param version version
		 * @return 当前对象
		*/
		public OrderItem setVersion(Integer version) {
			super.change(VERSION,super.getVersion(),version);
			super.setVersion(version);
			return this;
		}
		
		/**
		 * 设置 商品
		 * @param goods 商品
		 * @return 当前对象
		*/
		public OrderItem setGoods(Goods goods) {
			super.change(GOODS,super.getGoods(),goods);
			super.setGoods(goods);
			return this;
		}

		/**
		 * 克隆当前对象
		*/
		@Transient
		public OrderItemVO clone() {
			return duplicate(true);
		}

		/**
		 * 复制当前对象
		 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
		*/
		@Transient
		public OrderItemVO duplicate(boolean all) {
			$$proxy$$ inst=new $$proxy$$();
			inst.setAmount(this.getAmount());
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
				inst.setSearchField(this.getSearchField());
				inst.setPageIndex(this.getPageIndex());
				inst.setSortType(this.getSortType());
				inst.setFuzzyField(this.getFuzzyField());
				inst.setDirtyFields(this.getDirtyFields());
				inst.setSortField(this.getSortField());
				inst.setPageSize(this.getPageSize());
				inst.setIds(this.getIds());
				inst.setGoods(this.getGoods());
				inst.setSearchValue(this.getSearchValue());
			}
			inst.clearModifies();
			return inst;
		}

	}
}