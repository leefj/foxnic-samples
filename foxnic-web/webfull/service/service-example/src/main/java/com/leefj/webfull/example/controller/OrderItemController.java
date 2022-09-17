package com.leefj.webfull.example.controller;


import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.github.foxnic.web.framework.web.SuperController;
import org.github.foxnic.web.framework.sentinel.SentinelExceptionUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.alibaba.csp.sentinel.annotation.SentinelResource;


import com.leefj.webfull.proxy.example.OrderItemServiceProxy;
import com.leefj.webfull.domain.example.meta.OrderItemVOMeta;
import com.leefj.webfull.domain.example.OrderItem;
import com.leefj.webfull.domain.example.OrderItemVO;
import com.github.foxnic.api.transter.Result;
import com.github.foxnic.dao.data.SaveMode;
import com.github.foxnic.dao.excel.ExcelWriter;
import com.github.foxnic.springboot.web.DownloadUtil;
import com.github.foxnic.dao.data.PagedList;
import java.util.Date;
import java.sql.Timestamp;
import com.github.foxnic.api.error.ErrorDesc;
import com.github.foxnic.commons.io.StreamUtil;
import java.util.Map;
import com.github.foxnic.dao.excel.ValidateResult;
import java.io.InputStream;
import com.leefj.webfull.domain.example.meta.OrderItemMeta;
import com.leefj.webfull.domain.example.Goods;
import io.swagger.annotations.Api;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiImplicitParam;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.leefj.webfull.example.service.IOrderItemService;
import com.github.foxnic.api.validate.annotations.NotNull;

/**
 * <p>
 * 订单明细表 接口控制器
 * </p>
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-09-16 19:09:36
*/

@Api(tags = "订单明细")
@ApiSort(0)
@RestController("WebfullExampleOrderItemController")
public class OrderItemController extends SuperController {

	@Autowired
	private IOrderItemService orderItemService;


	/**
	 * 添加订单明细
	*/
	@ApiOperation(value = "添加订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
		@ApiImplicitParam(name = OrderItemVOMeta.ORDER_ID , value = "订单ID" , required = false , dataTypeClass=String.class , example = "583028022102200320"),
		@ApiImplicitParam(name = OrderItemVOMeta.GOODS_ID , value = "商品ID" , required = false , dataTypeClass=String.class , example = "583020804682289152"),
		@ApiImplicitParam(name = OrderItemVOMeta.AMOUNT , value = "数量" , required = false , dataTypeClass=Integer.class),
	})
	@ApiOperationSupport(order=1)
	@SentinelResource(value = OrderItemServiceProxy.INSERT , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.INSERT)
	public Result insert(OrderItemVO orderItemVO) {
		Result result=orderItemService.insert(orderItemVO,false);
		return result;
	}



	/**
	 * 删除订单明细
	*/
	@ApiOperation(value = "删除订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1")
	})
	@ApiOperationSupport(order=2)
	@NotNull(name = OrderItemVOMeta.ID)
	@SentinelResource(value = OrderItemServiceProxy.DELETE , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.DELETE)
	public Result deleteById(String id) {
		this.validator().asserts(id).require("缺少id值");
		if(this.validator().failure()) {
			return this.validator().getFirstResult();
		}
		// 引用校验
		Boolean hasRefer = orderItemService.hasRefers(id);
		// 判断是否可以删除
		this.validator().asserts(hasRefer).requireEqual("不允许删除当前记录",false);
		if(this.validator().failure()) {
			return this.validator().getFirstResult();
		}
		Result result=orderItemService.deleteByIdLogical(id);
		return result;
	}


	/**
	 * 批量删除订单明细 <br>
	 * 联合主键时，请自行调整实现
	*/
	@ApiOperation(value = "批量删除订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.IDS , value = "主键清单" , required = true , dataTypeClass=List.class , example = "[1,3,4]")
	})
	@ApiOperationSupport(order=3) 
	@NotNull(name = OrderItemVOMeta.IDS)
	@SentinelResource(value = OrderItemServiceProxy.DELETE_BY_IDS , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.DELETE_BY_IDS)
	public Result deleteByIds(List<String> ids) {

		// 参数校验
		this.validator().asserts(ids).require("缺少ids参数");
		if(this.validator().failure()) {
			return this.validator().getFirstResult();
		}

		// 查询引用
		Map<String, Boolean> hasRefersMap = orderItemService.hasRefers(ids);
		// 收集可以删除的ID值
		List<String> canDeleteIds = new ArrayList<>();
		for (Map.Entry<String, Boolean> e : hasRefersMap.entrySet()) {
			if (!e.getValue()) {
				canDeleteIds.add(e.getKey());
			}
		}

		// 执行删除
		if (canDeleteIds.isEmpty()) {
			// 如果没有一行可以被删除
			return ErrorDesc.failure().message("无法删除您选中的数据行");
		} else if (canDeleteIds.size() == ids.size()) {
			// 如果全部可以删除
			Result result=orderItemService.deleteByIdsLogical(canDeleteIds);
			return result;
		} else if (canDeleteIds.size()>0 && canDeleteIds.size() < ids.size()) {
			// 如果部分行可以删除
			Result result=orderItemService.deleteByIdsLogical(canDeleteIds);
			if (result.failure()) {
				return result;
			} else {
				return ErrorDesc.success().message("已删除 " + canDeleteIds.size() + " 行，但另有 " + (ids.size() - canDeleteIds.size()) + " 行数据无法删除").messageLevel4Confirm();
			}
		} else {
			// 理论上，这个分支不存在
			return ErrorDesc.success().message("数据删除未处理");
		}
	}

	/**
	 * 更新订单明细
	*/
	@ApiOperation(value = "更新订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
		@ApiImplicitParam(name = OrderItemVOMeta.ORDER_ID , value = "订单ID" , required = false , dataTypeClass=String.class , example = "583028022102200320"),
		@ApiImplicitParam(name = OrderItemVOMeta.GOODS_ID , value = "商品ID" , required = false , dataTypeClass=String.class , example = "583020804682289152"),
		@ApiImplicitParam(name = OrderItemVOMeta.AMOUNT , value = "数量" , required = false , dataTypeClass=Integer.class),
	})
	@ApiOperationSupport( order=4 , ignoreParameters = { OrderItemVOMeta.PAGE_INDEX , OrderItemVOMeta.PAGE_SIZE , OrderItemVOMeta.SEARCH_FIELD , OrderItemVOMeta.FUZZY_FIELD , OrderItemVOMeta.SEARCH_VALUE , OrderItemVOMeta.DIRTY_FIELDS , OrderItemVOMeta.SORT_FIELD , OrderItemVOMeta.SORT_TYPE , OrderItemVOMeta.IDS } )
	@SentinelResource(value = OrderItemServiceProxy.UPDATE , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.UPDATE)
	public Result update(OrderItemVO orderItemVO) {
		Result result=orderItemService.update(orderItemVO,SaveMode.DIRTY_OR_NOT_NULL_FIELDS,false);
		return result;
	}


	/**
	 * 保存订单明细
	*/
	@ApiOperation(value = "保存订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
		@ApiImplicitParam(name = OrderItemVOMeta.ORDER_ID , value = "订单ID" , required = false , dataTypeClass=String.class , example = "583028022102200320"),
		@ApiImplicitParam(name = OrderItemVOMeta.GOODS_ID , value = "商品ID" , required = false , dataTypeClass=String.class , example = "583020804682289152"),
		@ApiImplicitParam(name = OrderItemVOMeta.AMOUNT , value = "数量" , required = false , dataTypeClass=Integer.class),
	})
	@ApiOperationSupport(order=5 ,  ignoreParameters = { OrderItemVOMeta.PAGE_INDEX , OrderItemVOMeta.PAGE_SIZE , OrderItemVOMeta.SEARCH_FIELD , OrderItemVOMeta.FUZZY_FIELD , OrderItemVOMeta.SEARCH_VALUE , OrderItemVOMeta.DIRTY_FIELDS , OrderItemVOMeta.SORT_FIELD , OrderItemVOMeta.SORT_TYPE , OrderItemVOMeta.IDS } )
	@NotNull(name = OrderItemVOMeta.ID)
	@SentinelResource(value = OrderItemServiceProxy.SAVE , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.SAVE)
	public Result save(OrderItemVO orderItemVO) {
		Result result=orderItemService.save(orderItemVO,SaveMode.DIRTY_OR_NOT_NULL_FIELDS,false);
		return result;
	}


	/**
	 * 获取订单明细
	*/
	@ApiOperation(value = "获取订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
	})
	@ApiOperationSupport(order=6)
	@NotNull(name = OrderItemVOMeta.ID)
	@SentinelResource(value = OrderItemServiceProxy.GET_BY_ID , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.GET_BY_ID)
	public Result<OrderItem> getById(String id) {
		Result<OrderItem> result=new Result<>();
		OrderItem orderItem=orderItemService.getById(id);
		// join 关联的对象
		orderItemService.dao().fill(orderItem)
			.with(OrderItemMeta.GOODS)
			.execute();
		result.success(true).data(orderItem);
		return result;
	}


	/**
	 * 批量获取订单明细 <br>
	 * 联合主键时，请自行调整实现
	*/
		@ApiOperation(value = "批量获取订单明细")
		@ApiImplicitParams({
				@ApiImplicitParam(name = OrderItemVOMeta.IDS , value = "主键清单" , required = true , dataTypeClass=List.class , example = "[1,3,4]")
		})
		@ApiOperationSupport(order=3) 
		@NotNull(name = OrderItemVOMeta.IDS)
		@SentinelResource(value = OrderItemServiceProxy.GET_BY_IDS , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.GET_BY_IDS)
	public Result<List<OrderItem>> getByIds(List<String> ids) {
		Result<List<OrderItem>> result=new Result<>();
		List<OrderItem> list=orderItemService.queryListByIds(ids);
		result.success(true).data(list);
		return result;
	}


	/**
	 * 查询订单明细
	*/
	@ApiOperation(value = "查询订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
		@ApiImplicitParam(name = OrderItemVOMeta.ORDER_ID , value = "订单ID" , required = false , dataTypeClass=String.class , example = "583028022102200320"),
		@ApiImplicitParam(name = OrderItemVOMeta.GOODS_ID , value = "商品ID" , required = false , dataTypeClass=String.class , example = "583020804682289152"),
		@ApiImplicitParam(name = OrderItemVOMeta.AMOUNT , value = "数量" , required = false , dataTypeClass=Integer.class),
	})
	@ApiOperationSupport(order=5 ,  ignoreParameters = { OrderItemVOMeta.PAGE_INDEX , OrderItemVOMeta.PAGE_SIZE } )
	@SentinelResource(value = OrderItemServiceProxy.QUERY_LIST , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.QUERY_LIST)
	public Result<List<OrderItem>> queryList(OrderItemVO sample) {
		Result<List<OrderItem>> result=new Result<>();
		List<OrderItem> list=orderItemService.queryList(sample);
		result.success(true).data(list);
		return result;
	}


	/**
	 * 分页查询订单明细
	*/
	@ApiOperation(value = "分页查询订单明细")
	@ApiImplicitParams({
		@ApiImplicitParam(name = OrderItemVOMeta.ID , value = "主键" , required = true , dataTypeClass=String.class , example = "1"),
		@ApiImplicitParam(name = OrderItemVOMeta.ORDER_ID , value = "订单ID" , required = false , dataTypeClass=String.class , example = "583028022102200320"),
		@ApiImplicitParam(name = OrderItemVOMeta.GOODS_ID , value = "商品ID" , required = false , dataTypeClass=String.class , example = "583020804682289152"),
		@ApiImplicitParam(name = OrderItemVOMeta.AMOUNT , value = "数量" , required = false , dataTypeClass=Integer.class),
	})
	@ApiOperationSupport(order=8)
	@SentinelResource(value = OrderItemServiceProxy.QUERY_PAGED_LIST , blockHandlerClass = { SentinelExceptionUtil.class } , blockHandler = SentinelExceptionUtil.HANDLER )
	@PostMapping(OrderItemServiceProxy.QUERY_PAGED_LIST)
	public Result<PagedList<OrderItem>> queryPagedList(OrderItemVO sample) {
		Result<PagedList<OrderItem>> result=new Result<>();
		PagedList<OrderItem> list=orderItemService.queryPagedList(sample,sample.getPageSize(),sample.getPageIndex());
		// join 关联的对象
		orderItemService.dao().fill(list)
			.with(OrderItemMeta.GOODS)
			.execute();
		result.success(true).data(list);
		return result;
	}






}