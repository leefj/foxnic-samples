package com.leefj.webfull.domain.example;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.github.foxnic.api.model.CompositeParameter;
import javax.persistence.Transient;
import com.github.foxnic.commons.bean.BeanUtil;
import com.github.foxnic.dao.entity.EntityContext;
import com.github.foxnic.dao.entity.Entity;
import java.util.Map;
import com.leefj.webfull.domain.example.meta.ReimbursementVOMeta;
import com.github.foxnic.commons.lang.DataParser;
import java.math.BigDecimal;
import java.util.Date;
import org.github.foxnic.web.domain.bpm.ProcessInstance;
import com.github.foxnic.sql.data.ExprRcd;



/**
 * 费用报销单VO类型
 * <p>费用报销单 , 数据表 webfull_example_reimbursement 的通用VO类型</p>
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-11-10 15:23:48
 * @sign FFDC4A4A15C79AAE439B8E3B6070A6DA
 * 此文件由工具自动生成，请勿修改。若表结构或配置发生变动，请使用工具重新生成。
*/

@ApiModel(description = "费用报销单VO类型 ; 费用报销单 , 数据表 webfull_example_reimbursement 的通用VO类型" , parent = Reimbursement.class)
public class ReimbursementVO extends Reimbursement {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 页码
	*/
	@ApiModelProperty(required = false,value="页码" , notes = "")
	private Integer pageIndex;
	
	/**
	 * 分页大小
	*/
	@ApiModelProperty(required = false,value="分页大小" , notes = "")
	private Integer pageSize;
	
	/**
	 * 搜索字段
	*/
	@ApiModelProperty(required = false,value="搜索字段" , notes = "")
	private String searchField;
	
	/**
	 * 模糊搜索字段
	*/
	@ApiModelProperty(required = false,value="模糊搜索字段" , notes = "")
	private String fuzzyField;
	
	/**
	 * 搜索的值
	*/
	@ApiModelProperty(required = false,value="搜索的值" , notes = "")
	private String searchValue;
	
	/**
	 * 已修改字段
	*/
	@ApiModelProperty(required = false,value="已修改字段" , notes = "")
	private List<String> dirtyFields;
	
	/**
	 * 排序字段
	*/
	@ApiModelProperty(required = false,value="排序字段" , notes = "")
	private String sortField;
	
	/**
	 * 排序方式
	*/
	@ApiModelProperty(required = false,value="排序方式" , notes = "")
	private String sortType;
	
	/**
	 * 主键清单：用于接收批量主键参数
	*/
	@ApiModelProperty(required = false,value="主键清单" , notes = "用于接收批量主键参数")
	private List<Long> ids;
	
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
	public ReimbursementVO setPageIndex(Integer pageIndex) {
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
	public ReimbursementVO setPageSize(Integer pageSize) {
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
	public ReimbursementVO setSearchField(String searchField) {
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
	public ReimbursementVO setFuzzyField(String fuzzyField) {
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
	public ReimbursementVO setSearchValue(String searchValue) {
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
	public ReimbursementVO setDirtyFields(List<String> dirtyFields) {
		this.dirtyFields=dirtyFields;
		return this;
	}
	
	/**
	 * 添加 已修改字段
	 * @param dirtyField 已修改字段
	 * @return 当前对象
	*/
	public ReimbursementVO addDirtyField(String... dirtyField) {
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
	public ReimbursementVO setSortField(String sortField) {
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
	public ReimbursementVO setSortType(String sortType) {
		this.sortType=sortType;
		return this;
	}
	
	/**
	 * 获得 主键清单<br>
	 * 用于接收批量主键参数
	 * @return 主键清单
	*/
	public List<Long> getIds() {
		return ids;
	}
	
	/**
	 * 设置 主键清单
	 * @param ids 主键清单
	 * @return 当前对象
	*/
	public ReimbursementVO setIds(List<Long> ids) {
		this.ids=ids;
		return this;
	}
	
	/**
	 * 添加 主键清单
	 * @param id 主键清单
	 * @return 当前对象
	*/
	public ReimbursementVO addId(Long... id) {
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
	 * @return ReimbursementVO , 转换好的 ReimbursementVO 对象
	*/
	@Transient
	public <T extends Entity> T toPO(Class<T> poType) {
		return EntityContext.create(poType, this);
	}

	/**
	 * 将自己转换成任意指定类型
	 * @param pojoType  Pojo类型
	 * @return ReimbursementVO , 转换好的 PoJo 对象
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
	public ReimbursementVO clone() {
		return duplicate(true);
	}

	/**
	 * 复制当前对象
	 * @param all 是否复制全部属性，当 false 时，仅复制来自数据表的属性
	*/
	@Transient
	public ReimbursementVO duplicate(boolean all) {
		com.leefj.webfull.domain.example.meta.ReimbursementVOMeta.$$proxy$$ inst = new com.leefj.webfull.domain.example.meta.ReimbursementVOMeta.$$proxy$$();
		inst.setAmount(this.getAmount());
		inst.setUpdateTime(this.getUpdateTime());
		inst.setTitle(this.getTitle());
		inst.setVersion(this.getVersion());
		inst.setCreateBy(this.getCreateBy());
		inst.setDeleted(this.getDeleted());
		inst.setCreateTime(this.getCreateTime());
		inst.setUpdateBy(this.getUpdateBy());
		inst.setDeleteTime(this.getDeleteTime());
		inst.setTenantId(this.getTenantId());
		inst.setDeleteBy(this.getDeleteBy());
		inst.setId(this.getId());
		inst.setStatus(this.getStatus());
		if(all) {
			inst.setSearchField(this.getSearchField());
			inst.setPageIndex(this.getPageIndex());
			inst.setSortType(this.getSortType());
			inst.setFuzzyField(this.getFuzzyField());
			inst.setDirtyFields(this.getDirtyFields());
			inst.setSortField(this.getSortField());
			inst.setPageSize(this.getPageSize());
			inst.setIds(this.getIds());
			inst.setHistoricProcessList(this.getHistoricProcessList());
			inst.setSearchValue(this.getSearchValue());
			inst.setCurrentProcessList(this.getCurrentProcessList());
			inst.setDefaultProcess(this.getDefaultProcess());
		}
		inst.clearModifies();
		return inst;
	}

	/**
	 * 克隆当前对象
	*/
	@Transient
	public ReimbursementVO clone(boolean deep) {
		return EntityContext.clone(ReimbursementVO.class,this,deep);
	}

	/**
	 * 将 Map 转换成 ReimbursementVO
	 * @param reimbursementMap 包含实体信息的 Map 对象
	 * @return ReimbursementVO , 转换好的的 Reimbursement 对象
	*/
	@Transient
	public static ReimbursementVO createFrom(Map<String,Object> reimbursementMap) {
		if(reimbursementMap==null) return null;
		ReimbursementVO vo = create();
		EntityContext.copyProperties(vo,reimbursementMap);
		vo.clearModifies();
		return vo;
	}

	/**
	 * 将 Pojo 转换成 ReimbursementVO
	 * @param pojo 包含实体信息的 Pojo 对象
	 * @return ReimbursementVO , 转换好的的 Reimbursement 对象
	*/
	@Transient
	public static ReimbursementVO createFrom(Object pojo) {
		if(pojo==null) return null;
		ReimbursementVO vo = create();
		EntityContext.copyProperties(vo,pojo);
		vo.clearModifies();
		return vo;
	}

	/**
	 * 创建一个 ReimbursementVO，等同于 new
	 * @return ReimbursementVO 对象
	*/
	@Transient
	public static ReimbursementVO create() {
		return new com.leefj.webfull.domain.example.meta.ReimbursementVOMeta.$$proxy$$();
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
			this.setAmount(DataParser.parse(BigDecimal.class, map.get(ReimbursementVOMeta.AMOUNT)));
			this.setUpdateTime(DataParser.parse(Date.class, map.get(ReimbursementVOMeta.UPDATE_TIME)));
			this.setTitle(DataParser.parse(String.class, map.get(ReimbursementVOMeta.TITLE)));
			this.setVersion(DataParser.parse(Integer.class, map.get(ReimbursementVOMeta.VERSION)));
			this.setCreateBy(DataParser.parse(String.class, map.get(ReimbursementVOMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, map.get(ReimbursementVOMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, map.get(ReimbursementVOMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, map.get(ReimbursementVOMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, map.get(ReimbursementVOMeta.DELETE_TIME)));
			this.setTenantId(DataParser.parse(String.class, map.get(ReimbursementVOMeta.TENANT_ID)));
			this.setDeleteBy(DataParser.parse(String.class, map.get(ReimbursementVOMeta.DELETE_BY)));
			this.setId(DataParser.parse(Long.class, map.get(ReimbursementVOMeta.ID)));
			this.setStatus(DataParser.parse(String.class, map.get(ReimbursementVOMeta.STATUS)));
			// others
			this.setSearchField(DataParser.parse(String.class, map.get(ReimbursementVOMeta.SEARCH_FIELD)));
			this.setPageIndex(DataParser.parse(Integer.class, map.get(ReimbursementVOMeta.PAGE_INDEX)));
			this.setSortType(DataParser.parse(String.class, map.get(ReimbursementVOMeta.SORT_TYPE)));
			this.setFuzzyField(DataParser.parse(String.class, map.get(ReimbursementVOMeta.FUZZY_FIELD)));
			this.setSortField(DataParser.parse(String.class, map.get(ReimbursementVOMeta.SORT_FIELD)));
			this.setPageSize(DataParser.parse(Integer.class, map.get(ReimbursementVOMeta.PAGE_SIZE)));
			this.setSearchValue(DataParser.parse(String.class, map.get(ReimbursementVOMeta.SEARCH_VALUE)));
			this.setDefaultProcess(DataParser.parse(ProcessInstance.class, map.get(ReimbursementVOMeta.DEFAULT_PROCESS)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)map.get(ReimbursementVOMeta.AMOUNT));
				this.setUpdateTime( (Date)map.get(ReimbursementVOMeta.UPDATE_TIME));
				this.setTitle( (String)map.get(ReimbursementVOMeta.TITLE));
				this.setVersion( (Integer)map.get(ReimbursementVOMeta.VERSION));
				this.setCreateBy( (String)map.get(ReimbursementVOMeta.CREATE_BY));
				this.setDeleted( (Integer)map.get(ReimbursementVOMeta.DELETED));
				this.setCreateTime( (Date)map.get(ReimbursementVOMeta.CREATE_TIME));
				this.setUpdateBy( (String)map.get(ReimbursementVOMeta.UPDATE_BY));
				this.setDeleteTime( (Date)map.get(ReimbursementVOMeta.DELETE_TIME));
				this.setTenantId( (String)map.get(ReimbursementVOMeta.TENANT_ID));
				this.setDeleteBy( (String)map.get(ReimbursementVOMeta.DELETE_BY));
				this.setId( (Long)map.get(ReimbursementVOMeta.ID));
				this.setStatus( (String)map.get(ReimbursementVOMeta.STATUS));
				// others
				this.setSearchField( (String)map.get(ReimbursementVOMeta.SEARCH_FIELD));
				this.setPageIndex( (Integer)map.get(ReimbursementVOMeta.PAGE_INDEX));
				this.setSortType( (String)map.get(ReimbursementVOMeta.SORT_TYPE));
				this.setFuzzyField( (String)map.get(ReimbursementVOMeta.FUZZY_FIELD));
				this.setSortField( (String)map.get(ReimbursementVOMeta.SORT_FIELD));
				this.setPageSize( (Integer)map.get(ReimbursementVOMeta.PAGE_SIZE));
				this.setSearchValue( (String)map.get(ReimbursementVOMeta.SEARCH_VALUE));
				this.setDefaultProcess( (ProcessInstance)map.get(ReimbursementVOMeta.DEFAULT_PROCESS));
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
			this.setAmount(DataParser.parse(BigDecimal.class, r.getValue(ReimbursementVOMeta.AMOUNT)));
			this.setUpdateTime(DataParser.parse(Date.class, r.getValue(ReimbursementVOMeta.UPDATE_TIME)));
			this.setTitle(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.TITLE)));
			this.setVersion(DataParser.parse(Integer.class, r.getValue(ReimbursementVOMeta.VERSION)));
			this.setCreateBy(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.CREATE_BY)));
			this.setDeleted(DataParser.parse(Integer.class, r.getValue(ReimbursementVOMeta.DELETED)));
			this.setCreateTime(DataParser.parse(Date.class, r.getValue(ReimbursementVOMeta.CREATE_TIME)));
			this.setUpdateBy(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.UPDATE_BY)));
			this.setDeleteTime(DataParser.parse(Date.class, r.getValue(ReimbursementVOMeta.DELETE_TIME)));
			this.setTenantId(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.TENANT_ID)));
			this.setDeleteBy(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.DELETE_BY)));
			this.setId(DataParser.parse(Long.class, r.getValue(ReimbursementVOMeta.ID)));
			this.setStatus(DataParser.parse(String.class, r.getValue(ReimbursementVOMeta.STATUS)));
			return true;
		} else {
			try {
				this.setAmount( (BigDecimal)r.getValue(ReimbursementVOMeta.AMOUNT));
				this.setUpdateTime( (Date)r.getValue(ReimbursementVOMeta.UPDATE_TIME));
				this.setTitle( (String)r.getValue(ReimbursementVOMeta.TITLE));
				this.setVersion( (Integer)r.getValue(ReimbursementVOMeta.VERSION));
				this.setCreateBy( (String)r.getValue(ReimbursementVOMeta.CREATE_BY));
				this.setDeleted( (Integer)r.getValue(ReimbursementVOMeta.DELETED));
				this.setCreateTime( (Date)r.getValue(ReimbursementVOMeta.CREATE_TIME));
				this.setUpdateBy( (String)r.getValue(ReimbursementVOMeta.UPDATE_BY));
				this.setDeleteTime( (Date)r.getValue(ReimbursementVOMeta.DELETE_TIME));
				this.setTenantId( (String)r.getValue(ReimbursementVOMeta.TENANT_ID));
				this.setDeleteBy( (String)r.getValue(ReimbursementVOMeta.DELETE_BY));
				this.setId( (Long)r.getValue(ReimbursementVOMeta.ID));
				this.setStatus( (String)r.getValue(ReimbursementVOMeta.STATUS));
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}