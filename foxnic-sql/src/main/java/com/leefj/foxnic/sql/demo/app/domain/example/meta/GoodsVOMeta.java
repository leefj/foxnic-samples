package com.leefj.foxnic.sql.demo.app.domain.example.meta;

import com.github.foxnic.api.bean.BeanProperty;
import com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO;
import java.util.List;
import com.leefj.foxnic.sql.demo.app.domain.example.Goods;
import java.math.BigDecimal;
import java.util.Date;
import com.leefj.foxnic.sql.demo.app.domain.example.Address;
import com.leefj.foxnic.sql.demo.app.domain.example.OrderItem;
import javax.persistence.Transient;



/**
 * @author LeeFJ
 * @since 2023-01-03 16:26:43
 * @sign F2C0B7C2E3F98978B7B3FD8497308AB4
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class GoodsVOMeta extends GoodsMeta {
	
	/**
	 * 页码 , 类型: java.lang.Integer
	*/
	public static final String PAGE_INDEX="pageIndex";
	
	/**
	 * 页码 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.Integer> PAGE_INDEX_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,PAGE_INDEX, java.lang.Integer.class, "页码", "", java.lang.Integer.class, null);
	
	/**
	 * 分页大小 , 类型: java.lang.Integer
	*/
	public static final String PAGE_SIZE="pageSize";
	
	/**
	 * 分页大小 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.Integer> PAGE_SIZE_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,PAGE_SIZE, java.lang.Integer.class, "分页大小", "", java.lang.Integer.class, null);
	
	/**
	 * 搜索字段 , 类型: java.lang.String
	*/
	public static final String SEARCH_FIELD="searchField";
	
	/**
	 * 搜索字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> SEARCH_FIELD_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,SEARCH_FIELD, java.lang.String.class, "搜索字段", "", java.lang.String.class, null);
	
	/**
	 * 模糊搜索字段 , 类型: java.lang.String
	*/
	public static final String FUZZY_FIELD="fuzzyField";
	
	/**
	 * 模糊搜索字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> FUZZY_FIELD_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,FUZZY_FIELD, java.lang.String.class, "模糊搜索字段", "", java.lang.String.class, null);
	
	/**
	 * 搜索的值 , 类型: java.lang.String
	*/
	public static final String SEARCH_VALUE="searchValue";
	
	/**
	 * 搜索的值 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> SEARCH_VALUE_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,SEARCH_VALUE, java.lang.String.class, "搜索的值", "", java.lang.String.class, null);
	
	/**
	 * 已修改字段 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final String DIRTY_FIELDS="dirtyFields";
	
	/**
	 * 已修改字段 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> DIRTY_FIELDS_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,DIRTY_FIELDS, java.util.List.class, "已修改字段", "", java.lang.String.class, null);
	
	/**
	 * 排序字段 , 类型: java.lang.String
	*/
	public static final String SORT_FIELD="sortField";
	
	/**
	 * 排序字段 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> SORT_FIELD_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,SORT_FIELD, java.lang.String.class, "排序字段", "", java.lang.String.class, null);
	
	/**
	 * 排序方式 , 类型: java.lang.String
	*/
	public static final String SORT_TYPE="sortType";
	
	/**
	 * 排序方式 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> SORT_TYPE_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,SORT_TYPE, java.lang.String.class, "排序方式", "", java.lang.String.class, null);
	
	/**
	 * 数据来源 , 前端指定不同的来源，后端按来源执行不同的逻辑 , 类型: java.lang.String
	*/
	public static final String DATA_ORIGIN="dataOrigin";
	
	/**
	 * 数据来源 , 前端指定不同的来源，后端按来源执行不同的逻辑 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> DATA_ORIGIN_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,DATA_ORIGIN, java.lang.String.class, "数据来源", "前端指定不同的来源，后端按来源执行不同的逻辑", java.lang.String.class, null);
	
	/**
	 * 查询逻辑 , 默认and，可指定 or  , 类型: java.lang.String
	*/
	public static final String QUERY_LOGIC="queryLogic";
	
	/**
	 * 查询逻辑 , 默认and，可指定 or  , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> QUERY_LOGIC_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,QUERY_LOGIC, java.lang.String.class, "查询逻辑", "默认and，可指定 or ", java.lang.String.class, null);
	
	/**
	 * 主键清单 , 用于接收批量主键参数 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final String IDS="ids";
	
	/**
	 * 主键清单 , 用于接收批量主键参数 , 集合类型: LIST , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> IDS_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,IDS, java.util.List.class, "主键清单", "用于接收批量主键参数", java.lang.String.class, null);
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final String ID="id";
	
	/**
	 * 主键 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> ID_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,ID, java.lang.String.class, "主键", "主键", java.lang.String.class, null);
	
	/**
	 * 商品名 , 类型: java.lang.String
	*/
	public static final String NAME="name";
	
	/**
	 * 商品名 , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> NAME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,NAME, java.lang.String.class, "商品名", "商品名", java.lang.String.class, null);
	
	/**
	 * 单价 , 类型: java.math.BigDecimal
	*/
	public static final String PRICE="price";
	
	/**
	 * 单价 , 类型: java.math.BigDecimal
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.math.BigDecimal> PRICE_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,PRICE, java.math.BigDecimal.class, "单价", "单价", java.math.BigDecimal.class, null);
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final String CREATE_BY="createBy";
	
	/**
	 * 创建人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> CREATE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,CREATE_BY, java.lang.String.class, "创建人ID", "创建人ID", java.lang.String.class, null);
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final String CREATE_TIME="createTime";
	
	/**
	 * 创建时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.util.Date> CREATE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,CREATE_TIME, java.util.Date.class, "创建时间", "创建时间", java.util.Date.class, null);
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final String UPDATE_BY="updateBy";
	
	/**
	 * 修改人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> UPDATE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,UPDATE_BY, java.lang.String.class, "修改人ID", "修改人ID", java.lang.String.class, null);
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final String UPDATE_TIME="updateTime";
	
	/**
	 * 修改时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.util.Date> UPDATE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,UPDATE_TIME, java.util.Date.class, "修改时间", "修改时间", java.util.Date.class, null);
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final String DELETED="deleted";
	
	/**
	 * 是否已删除 , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.Integer> DELETED_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,DELETED, java.lang.Integer.class, "是否已删除", "是否已删除", java.lang.Integer.class, null);
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final String DELETE_BY="deleteBy";
	
	/**
	 * 删除人ID , 类型: java.lang.String
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.String> DELETE_BY_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,DELETE_BY, java.lang.String.class, "删除人ID", "删除人ID", java.lang.String.class, null);
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final String DELETE_TIME="deleteTime";
	
	/**
	 * 删除时间 , 类型: java.util.Date
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.util.Date> DELETE_TIME_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,DELETE_TIME, java.util.Date.class, "删除时间", "删除时间", java.util.Date.class, null);
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final String VERSION="version";
	
	/**
	 * version , 类型: java.lang.Integer
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,java.lang.Integer> VERSION_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,VERSION, java.lang.Integer.class, "version", "version", java.lang.Integer.class, null);
	
	/**
	 * 订单明细商品 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Goods
	*/
	public static final String ORDER_LIST="orderList";
	
	/**
	 * 订单明细商品 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Goods
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,com.leefj.foxnic.sql.demo.app.domain.example.Goods> ORDER_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,ORDER_LIST, java.util.List.class, "订单明细商品", "订单明细商品", com.leefj.foxnic.sql.demo.app.domain.example.Goods.class, null);
	
	/**
	 * 收件地址 , 收件地址，包括收件人以及手机号码 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Address
	*/
	public static final String ADDRESS_LIST="addressList";
	
	/**
	 * 收件地址 , 收件地址，包括收件人以及手机号码 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.Address
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,com.leefj.foxnic.sql.demo.app.domain.example.Address> ADDRESS_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,ADDRESS_LIST, java.util.List.class, "收件地址", "收件地址，包括收件人以及手机号码", com.leefj.foxnic.sql.demo.app.domain.example.Address.class, null);
	
	/**
	 * 订单明细 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.OrderItem
	*/
	public static final String ITEM_LIST="itemList";
	
	/**
	 * 订单明细 , 集合类型: LIST , 类型: com.leefj.foxnic.sql.demo.app.domain.example.OrderItem
	*/
	public static final BeanProperty<com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO,com.leefj.foxnic.sql.demo.app.domain.example.OrderItem> ITEM_LIST_PROP = new BeanProperty(com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO.class ,ITEM_LIST, java.util.List.class, "订单明细", "订单明细", com.leefj.foxnic.sql.demo.app.domain.example.OrderItem.class, null);
	
	/**
	 * 全部属性清单
	*/
	public static final String[] $PROPS={ PAGE_INDEX , PAGE_SIZE , SEARCH_FIELD , FUZZY_FIELD , SEARCH_VALUE , DIRTY_FIELDS , SORT_FIELD , SORT_TYPE , DATA_ORIGIN , QUERY_LOGIC , IDS , ID , NAME , PRICE , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION , ORDER_LIST , ADDRESS_LIST , ITEM_LIST };
	
	/**
	 * 代理类
	*/
	public static class $$proxy$$ extends com.leefj.foxnic.sql.demo.app.domain.example.GoodsVO {

		private static final long serialVersionUID = 1L;

		
		/**
		 * 设置 页码
		 * @param pageIndex 页码
		 * @return 当前对象
		*/
		public GoodsVO setPageIndex(Integer pageIndex) {
			super.change(PAGE_INDEX,super.getPageIndex(),pageIndex);
			super.setPageIndex(pageIndex);
			return this;
		}
		
		/**
		 * 设置 分页大小
		 * @param pageSize 分页大小
		 * @return 当前对象
		*/
		public GoodsVO setPageSize(Integer pageSize) {
			super.change(PAGE_SIZE,super.getPageSize(),pageSize);
			super.setPageSize(pageSize);
			return this;
		}
		
		/**
		 * 设置 搜索字段
		 * @param searchField 搜索字段
		 * @return 当前对象
		*/
		public GoodsVO setSearchField(String searchField) {
			super.change(SEARCH_FIELD,super.getSearchField(),searchField);
			super.setSearchField(searchField);
			return this;
		}
		
		/**
		 * 设置 模糊搜索字段
		 * @param fuzzyField 模糊搜索字段
		 * @return 当前对象
		*/
		public GoodsVO setFuzzyField(String fuzzyField) {
			super.change(FUZZY_FIELD,super.getFuzzyField(),fuzzyField);
			super.setFuzzyField(fuzzyField);
			return this;
		}
		
		/**
		 * 设置 搜索的值
		 * @param searchValue 搜索的值
		 * @return 当前对象
		*/
		public GoodsVO setSearchValue(String searchValue) {
			super.change(SEARCH_VALUE,super.getSearchValue(),searchValue);
			super.setSearchValue(searchValue);
			return this;
		}
		
		/**
		 * 设置 已修改字段
		 * @param dirtyFields 已修改字段
		 * @return 当前对象
		*/
		public GoodsVO setDirtyFields(List<String> dirtyFields) {
			super.change(DIRTY_FIELDS,super.getDirtyFields(),dirtyFields);
			super.setDirtyFields(dirtyFields);
			return this;
		}
		
		/**
		 * 设置 排序字段
		 * @param sortField 排序字段
		 * @return 当前对象
		*/
		public GoodsVO setSortField(String sortField) {
			super.change(SORT_FIELD,super.getSortField(),sortField);
			super.setSortField(sortField);
			return this;
		}
		
		/**
		 * 设置 排序方式
		 * @param sortType 排序方式
		 * @return 当前对象
		*/
		public GoodsVO setSortType(String sortType) {
			super.change(SORT_TYPE,super.getSortType(),sortType);
			super.setSortType(sortType);
			return this;
		}
		
		/**
		 * 设置 数据来源
		 * @param dataOrigin 数据来源
		 * @return 当前对象
		*/
		public GoodsVO setDataOrigin(String dataOrigin) {
			super.change(DATA_ORIGIN,super.getDataOrigin(),dataOrigin);
			super.setDataOrigin(dataOrigin);
			return this;
		}
		
		/**
		 * 设置 查询逻辑
		 * @param queryLogic 查询逻辑
		 * @return 当前对象
		*/
		public GoodsVO setQueryLogic(String queryLogic) {
			super.change(QUERY_LOGIC,super.getQueryLogic(),queryLogic);
			super.setQueryLogic(queryLogic);
			return this;
		}
		
		/**
		 * 设置 主键清单
		 * @param ids 主键清单
		 * @return 当前对象
		*/
		public GoodsVO setIds(List<String> ids) {
			super.change(IDS,super.getIds(),ids);
			super.setIds(ids);
			return this;
		}
		
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
		public GoodsVO clone() {
			return duplicate(true);
		}

		/**
		 * 复制当前对象
		 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
		*/
		@Transient
		public GoodsVO duplicate(boolean all) {
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
				inst.setSearchField(this.getSearchField());
				inst.setFuzzyField(this.getFuzzyField());
				inst.setPageSize(this.getPageSize());
				inst.setOrderList(this.getOrderList());
				inst.setPageIndex(this.getPageIndex());
				inst.setSortType(this.getSortType());
				inst.setAddressList(this.getAddressList());
				inst.setDirtyFields(this.getDirtyFields());
				inst.setSortField(this.getSortField());
				inst.setDataOrigin(this.getDataOrigin());
				inst.setIds(this.getIds());
				inst.setQueryLogic(this.getQueryLogic());
				inst.setItemList(this.getItemList());
				inst.setSearchValue(this.getSearchValue());
			}
			inst.clearModifies();
			return inst;
		}

	}
}