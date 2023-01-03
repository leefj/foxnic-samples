package com.leefj.foxnic.sql.demo.app.domain.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.github.foxnic.api.model.CompositeParameter;
import javax.persistence.Transient;
import com.github.foxnic.commons.bean.BeanUtil;
import com.github.foxnic.dao.entity.EntityContext;
import com.github.foxnic.dao.entity.Entity;
import java.util.Map;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderVOMeta;
import com.github.foxnic.commons.lang.DataParser;
import java.math.BigDecimal;
import java.util.Date;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * example_orderVO类型
 * <p>example_order , 数据表 example_order 的通用VO类型</p>
 * @author LeeFJ
 * @since 2023-01-03 16:26:43
 * @sign 2D1C51E6C64BE65B5D3EA0F95BA7B448
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

public class OrderVO extends Order {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 页码
	*/
	private Integer pageIndex;
	
	/**
	 * 分页大小
	*/
	private Integer pageSize;
	
	/**
	 * 搜索字段
	*/
	private String searchField;
	
	/**
	 * 模糊搜索字段
	*/
	private String fuzzyField;
	
	/**
	 * 搜索的值
	*/
	private String searchValue;
	
	/**
	 * 已修改字段
	*/
	private List<String> dirtyFields;
	
	/**
	 * 排序字段
	*/
	private String sortField;
	
	/**
	 * 排序方式
	*/
	private String sortType;
	
	/**
	 * 数据来源：前端指定不同的来源，后端按来源执行不同的逻辑
	*/
	private String dataOrigin;
	
	/**
	 * 查询逻辑：默认and，可指定 or 
	*/
	private String queryLogic;
	
	/**
	 * 主键清单：用于接收批量主键参数
	*/
	private List<String> ids;
	
	/**
	 * 获得 页码<br>
	 * @return 页码
	*/
	public Integer getPageIndex() {
		return pageIndex;
	}
	
	/**
	 * 设置 页码
	 * @param pageIndex 页码
	 * @return 当前对象
	*/
	public OrderVO setPageIndex(Integer pageIndex) {
		this.pageIndex=pageIndex;
		return this;
	}
	
	/**
	 * 获得 分页大小<br>
	 * @return 分页大小
	*/
	public Integer getPageSize() {
		return pageSize;
	}
	
	/**
	 * 设置 分页大小
	 * @param pageSize 分页大小
	 * @return 当前对象
	*/
	public OrderVO setPageSize(Integer pageSize) {
		this.pageSize=pageSize;
		return this;
	}
	
	/**
	 * 获得 搜索字段<br>
	 * @return 搜索字段
	*/
	public String getSearchField() {
		return searchField;
	}
	
	/**
	 * 设置 搜索字段
	 * @param searchField 搜索字段
	 * @return 当前对象
	*/
	public OrderVO setSearchField(String searchField) {
		this.searchField=searchField;
		return this;
	}
	
	/**
	 * 获得 模糊搜索字段<br>
	 * @return 模糊搜索字段
	*/
	public String getFuzzyField() {
		return fuzzyField;
	}
	
	/**
	 * 设置 模糊搜索字段
	 * @param fuzzyField 模糊搜索字段
	 * @return 当前对象
	*/
	public OrderVO setFuzzyField(String fuzzyField) {
		this.fuzzyField=fuzzyField;
		return this;
	}
	
	/**
	 * 获得 搜索的值<br>
	 * @return 搜索的值
	*/
	public String getSearchValue() {
		return searchValue;
	}
	
	/**
	 * 设置 搜索的值
	 * @param searchValue 搜索的值
	 * @return 当前对象
	*/
	public OrderVO setSearchValue(String searchValue) {
		this.searchValue=searchValue;
		return this;
	}
	
	/**
	 * 获得 已修改字段<br>
	 * @return 已修改字段
	*/
	public List<String> getDirtyFields() {
		return dirtyFields;
	}
	
	/**
	 * 设置 已修改字段
	 * @param dirtyFields 已修改字段
	 * @return 当前对象
	*/
	public OrderVO setDirtyFields(List<String> dirtyFields) {
		this.dirtyFields=dirtyFields;
		return this;
	}
	
	/**
	 * 添加 已修改字段
	 * @param dirtyField 已修改字段
	 * @return 当前对象
	*/
	public OrderVO addDirtyField(String... dirtyField) {
		if(this.dirtyFields==null) dirtyFields=new ArrayList<>();
		this.dirtyFields.addAll(Arrays.asList(dirtyField));
		return this;
	}
	
	/**
	 * 获得 排序字段<br>
	 * @return 排序字段
	*/
	public String getSortField() {
		return sortField;
	}
	
	/**
	 * 设置 排序字段
	 * @param sortField 排序字段
	 * @return 当前对象
	*/
	public OrderVO setSortField(String sortField) {
		this.sortField=sortField;
		return this;
	}
	
	/**
	 * 获得 排序方式<br>
	 * @return 排序方式
	*/
	public String getSortType() {
		return sortType;
	}
	
	/**
	 * 设置 排序方式
	 * @param sortType 排序方式
	 * @return 当前对象
	*/
	public OrderVO setSortType(String sortType) {
		this.sortType=sortType;
		return this;
	}
	
	/**
	 * 获得 数据来源<br>
	 * 前端指定不同的来源，后端按来源执行不同的逻辑
	 * @return 数据来源
	*/
	public String getDataOrigin() {
		return dataOrigin;
	}
	
	/**
	 * 设置 数据来源
	 * @param dataOrigin 数据来源
	 * @return 当前对象
	*/
	public OrderVO setDataOrigin(String dataOrigin) {
		this.dataOrigin=dataOrigin;
		return this;
	}
	
	/**
	 * 获得 查询逻辑<br>
	 * 默认and，可指定 or 
	 * @return 查询逻辑
	*/
	public String getQueryLogic() {
		return queryLogic;
	}
	
	/**
	 * 设置 查询逻辑
	 * @param queryLogic 查询逻辑
	 * @return 当前对象
	*/
	public OrderVO setQueryLogic(String queryLogic) {
		this.queryLogic=queryLogic;
		return this;
	}
	
	/**
	 * 获得 主键清单<br>
	 * 用于接收批量主键参数
	 * @return 主键清单
	*/
	public List<String> getIds() {
		return ids;
	}
	
	/**
	 * 设置 主键清单
	 * @param ids 主键清单
	 * @return 当前对象
	*/
	public OrderVO setIds(List<String> ids) {
		this.ids=ids;
		return this;
	}
	
	/**
	 * 添加 主键清单
	 * @param id 主键清单
	 * @return 当前对象
	*/
	public OrderVO addId(String... id) {
		if(this.ids==null) ids=new ArrayList<>();
		this.ids.addAll(Arrays.asList(id));
		return this;
	}
	@Transient
	private transient CompositeParameter $compositeParameter;
	/**
	 * 获得解析后的复合查询参数
	 */
	@Transient
	public CompositeParameter getCompositeParameter() {
		if($compositeParameter!=null) return  $compositeParameter;
		$compositeParameter=new CompositeParameter(this.getSearchValue(),BeanUtil.toMap(this));
		return  $compositeParameter;
	}

	/**
	 * 将自己转换成指定类型的PO
	 * @param poType  PO类型
	 * @return OrderVO , 转换好的 OrderVO 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return OrderVO , 转换好的 PoJo 对象
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
	public OrderVO clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public OrderVO duplicate(boolean all) {
		com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderVOMeta.$$proxy$$ inst = new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderVOMeta.$$proxy$$();
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
			inst.setSearchField(this.getSearchField());
			inst.setFuzzyField(this.getFuzzyField());
			inst.setGoodsList(this.getGoodsList());
			inst.setPageSize(this.getPageSize());
			inst.setPageIndex(this.getPageIndex());
			inst.setSortType(this.getSortType());
			inst.setDirtyFields(this.getDirtyFields());
			inst.setSortField(this.getSortField());
			inst.setDataOrigin(this.getDataOrigin());
			inst.setIds(this.getIds());
			inst.setItemList(this.getItemList());
			inst.setQueryLogic(this.getQueryLogic());
			inst.setSearchValue(this.getSearchValue());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public OrderVO clone(boolean deep) {
		return EntityContext.clone(OrderVO.class,this,deep);
	}

	/**
	 * 将 Map 转换成 OrderVO
	 * @param orderMap 包含实体信息的 Map 对象
	 * @return OrderVO , 转换好的的 Order 对象
	*/
	@Transient
	public static OrderVO createFrom(Map<String,Object> orderMap) {
		if(orderMap==null) return null;
		OrderVO vo = create();
		EntityContext.copyProperties(vo,orderMap);
		vo.clearModifies();
		return vo;
	}

	/**
	 * 将 Pojo 转换成 OrderVO
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return OrderVO , 转换好的的 Order 对象
	*/
	@Transient
	public static OrderVO createFrom(Object pojo) {
		if(pojo==null) return null;
		OrderVO vo = create();
		EntityContext.copyProperties(vo,pojo);
		vo.clearModifies();
		return vo;
	}

	/**
	 * 创建一个 OrderVO，等同于 new
	 * @return OrderVO 对象
	*/
	@Transient
	public static OrderVO create() {
		return new com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderVOMeta.$$proxy$$();
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
			this.setAmount(DataParser.parse(BigDecimal.class, map.get(OrderVOMeta.AMOUNT)));
			this.setCreateBy(DataParser.parse(String.class, map.get(OrderVOMeta.CREATE_BY)));
			this.setOrderNo(DataParser.parse(String.class, map.get(OrderVOMeta.ORDER_NO)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(OrderVOMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(OrderVOMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(OrderVOMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(OrderVOMeta.DELETE_TIME)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(OrderVOMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(OrderVOMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, map.get(OrderVOMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, map.get(OrderVOMeta.VERSION)));
			this.setAddressId(DataParser.parse(String.class, map.get(OrderVOMeta.ADDRESS_ID)));
			// others
			this.setAddress(DataParser.parse(Address.class, map.get(OrderVOMeta.ADDRESS)));
			this.setSearchField(DataParser.parse(String.class, map.get(OrderVOMeta.SEARCH_FIELD)));
			this.setFuzzyField(DataParser.parse(String.class, map.get(OrderVOMeta.FUZZY_FIELD)));
			this.setPageSize(DataParser.parse(Integer.class, map.get(OrderVOMeta.PAGE_SIZE)));
			this.setPageIndex(DataParser.parse(Integer.class, map.get(OrderVOMeta.PAGE_INDEX)));
			this.setSortType(DataParser.parse(String.class, map.get(OrderVOMeta.SORT_TYPE)));
			this.setSortField(DataParser.parse(String.class, map.get(OrderVOMeta.SORT_FIELD)));
			this.setDataOrigin(DataParser.parse(String.class, map.get(OrderVOMeta.DATA_ORIGIN)));
			this.setQueryLogic(DataParser.parse(String.class, map.get(OrderVOMeta.QUERY_LOGIC)));
			this.setSearchValue(DataParser.parse(String.class, map.get(OrderVOMeta.SEARCH_VALUE)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)map.get(OrderVOMeta.AMOUNT));
				this.setCreateBy( (String)map.get(OrderVOMeta.CREATE_BY));
				this.setOrderNo( (String)map.get(OrderVOMeta.ORDER_NO));
				this.setDeleted( (Integer)map.get(OrderVOMeta.DELETED));
				this.setCreateTime( (Date)map.get(OrderVOMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(OrderVOMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(OrderVOMeta.DELETE_TIME));
				this.setDeleteBy( (String)map.get(OrderVOMeta.DELETE_BY));
				this.setUpdateTime( (Date)map.get(OrderVOMeta.UPDATE_TIME));
				this.setId( (String)map.get(OrderVOMeta.ID));
				this.setVersion( (Integer)map.get(OrderVOMeta.VERSION));
				this.setAddressId( (String)map.get(OrderVOMeta.ADDRESS_ID));
				// others
				this.setAddress( (Address)map.get(OrderVOMeta.ADDRESS));
				this.setSearchField( (String)map.get(OrderVOMeta.SEARCH_FIELD));
				this.setFuzzyField( (String)map.get(OrderVOMeta.FUZZY_FIELD));
				this.setPageSize( (Integer)map.get(OrderVOMeta.PAGE_SIZE));
				this.setPageIndex( (Integer)map.get(OrderVOMeta.PAGE_INDEX));
				this.setSortType( (String)map.get(OrderVOMeta.SORT_TYPE));
				this.setSortField( (String)map.get(OrderVOMeta.SORT_FIELD));
				this.setDataOrigin( (String)map.get(OrderVOMeta.DATA_ORIGIN));
				this.setQueryLogic( (String)map.get(OrderVOMeta.QUERY_LOGIC));
				this.setSearchValue( (String)map.get(OrderVOMeta.SEARCH_VALUE));
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
			this.setAmount(DataParser.parse(BigDecimal.class, r.getValue(OrderVOMeta.AMOUNT)));
			this.setCreateBy(DataParser.parse(String.class, r.getValue(OrderVOMeta.CREATE_BY)));
			this.setOrderNo(DataParser.parse(String.class, r.getValue(OrderVOMeta.ORDER_NO)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(OrderVOMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(OrderVOMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(OrderVOMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(OrderVOMeta.DELETE_TIME)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(OrderVOMeta.DELETE_BY)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(OrderVOMeta.UPDATE_TIME)));
			this.setId(DataParser.parse(String.class, r.getValue(OrderVOMeta.ID)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(OrderVOMeta.VERSION)));
			this.setAddressId(DataParser.parse(String.class, r.getValue(OrderVOMeta.ADDRESS_ID)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)r.getValue(OrderVOMeta.AMOUNT));
				this.setCreateBy( (String)r.getValue(OrderVOMeta.CREATE_BY));
				this.setOrderNo( (String)r.getValue(OrderVOMeta.ORDER_NO));
				this.setDeleted( (Integer)r.getValue(OrderVOMeta.DELETED));
				this.setCreateTime( (Date)r.getValue(OrderVOMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(OrderVOMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(OrderVOMeta.DELETE_TIME));
				this.setDeleteBy( (String)r.getValue(OrderVOMeta.DELETE_BY));
				this.setUpdateTime( (Date)r.getValue(OrderVOMeta.UPDATE_TIME));
				this.setId( (String)r.getValue(OrderVOMeta.ID));
				this.setVersion( (Integer)r.getValue(OrderVOMeta.VERSION));
				this.setAddressId( (String)r.getValue(OrderVOMeta.ADDRESS_ID));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}