package com.leefj.webfull.example.service.bpm;

import com.github.foxnic.dao.data.SaveMode;
import com.leefj.webfull.domain.example.Reimbursement;
import com.leefj.webfull.example.service.IReimbursementService;
import org.github.foxnic.web.domain.bpm.BpmActionResult;
import org.github.foxnic.web.domain.bpm.BpmEvent;
import org.github.foxnic.web.framework.bpm.BpmEventAdaptor;

/**
 * <p>
 * 费用报销单流程回调事件适配器
 * </p>
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-11-10 13:59:18
*/

public class ReimbursementBpmEventAdaptor extends BpmEventAdaptor<Reimbursement,IReimbursementService> {

	public ReimbursementBpmEventAdaptor(IReimbursementService service) {
		super(service);
	}

	/***
	 * 流程暂存开始，通过返回 BpmActionResult  的 success 或  failure 控制暂存过程是否继续进行
	 * */
	protected BpmActionResult onTemporarySaveStart(BpmEvent event) {
		return event.getActionResult();
	}


	/***
	 * 流程提交/启动开始，通过返回 BpmActionResult  的 success 或  failure 控制流程提交/启动过程是否继续进行
	 * */
	protected BpmActionResult onProcessSubmitStart(BpmEvent event) {
		BpmActionResult result=event.getActionResult();
		// 获得当前表单数据
		Reimbursement reimbursement = this.getFormData(event);

		reimbursement.setStatus("审批中");
		// 保存一下
		this.service().update(reimbursement, SaveMode.DIRTY_FIELDS);

		result.putVariable("amount", reimbursement.getAmount());
		return event.getActionResult();
	}

	/***
	 * 流程待办开始，通过返回 BpmActionResult  的 success 或  failure 控制流程待办处理过程是否继续进行
	 * */
	protected BpmActionResult onTaskStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程节点执行前，此事件由 camunda 提供，返回值仅在 act_ru_event_callback 表记录，不做其它控制
	 * */
	protected BpmActionResult onNodeStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程节点执行后，此事件由 camunda 提供，返回值仅在 act_ru_event_callback 表记录，不做其它控制
	 * */
	protected BpmActionResult onNodeEnd(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程撤回开始，通过返回 BpmActionResult  的 success 或  failure 控制流程撤回处理过程是否继续进行
	 * */
	protected BpmActionResult onFetchBackStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程撤回结束，返回值无意义
	 * */
	protected BpmActionResult onFetchBackEnd(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程跳转开始，通过返回 BpmActionResult  的 success 或  failure 控制流程跳转处理过程是否继续进行
	 * */
	protected BpmActionResult onJumpStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程跳转结束， 返回值无意义
	 * */
	protected BpmActionResult onJumpEnd(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程转办开始，通过返回 BpmActionResult  的 success 或  failure 控制流程转办处理过程是否继续进行
	 * */
	protected BpmActionResult onDelegateStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程转办处理结束，返回值无意义
	 * */
	protected BpmActionResult onDelegateEnd(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程废弃开始，通过返回 BpmActionResult  的 success 或  failure 控制流程废弃处理过程是否继续进行
	 * */
	protected BpmActionResult onProcessAbandonStart(BpmEvent event) {
		return event.getActionResult();
	}

	/***
	 * 流程废弃结束，返回值无意义
	 * */
	protected BpmActionResult onProcessAbandonEnd(BpmEvent event) {
		return event.getActionResult();
	}

}
