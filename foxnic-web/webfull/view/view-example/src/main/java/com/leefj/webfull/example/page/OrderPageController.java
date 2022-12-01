package com.leefj.webfull.example.page;

import org.github.foxnic.web.framework.view.controller.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.leefj.webfull.proxy.example.OrderServiceProxy;
import javax.servlet.http.HttpServletRequest;
/**
 * <p>
 * 订单模版页面控制器
 * </p>
 * @author 李方捷 , leefangjie@qq.com
 * @since 2022-12-01 09:09:22
*/

@Controller("WebfullExampleOrderPageController")
@RequestMapping(OrderPageController.prefix)
public class OrderPageController extends ViewController {
	
	public static final String prefix="business/webfull-example/order";

	private OrderServiceProxy proxy;
	
	/**
	 * 获得代理对象<br> 
	 * 1、单体应用时，在应用内部调用；<br> 
	 * 2、前后端分离时，通过配置，以Rest方式调用后端；<br> 
	 * 3、微服务时，通过feign调用; <br> 
	 * */
	public OrderServiceProxy proxy() {
		if(proxy==null) {
			proxy=OrderServiceProxy.api();
		}
		return proxy;
	}
	
	/**
	 * 订单 功能主页面
	 */
	@RequestMapping("/order_list.html")
	public String list(Model model,HttpServletRequest request) {
		return prefix+"/order_list";
	}

	/**
	 * 订单 表单页面
	 */
	@RequestMapping("/order_form.html")
	public String form(Model model,HttpServletRequest request , String id) {
		return prefix+"/order_form";
	}
}