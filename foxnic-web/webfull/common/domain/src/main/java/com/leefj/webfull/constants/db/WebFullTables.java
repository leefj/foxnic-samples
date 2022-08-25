package com.leefj.webfull.constants.db;

import com.github.foxnic.sql.meta.DBField;
import com.github.foxnic.sql.meta.DBTable;
import com.github.foxnic.sql.meta.DBDataType;



/**
 * @since 2022-08-20 13:16:23
 * @author 李方捷 , leefangjie@qq.com
 * 数据库描述文件
 * 此文件由工具自动生成，请勿修改。若表结构变动，请使用工具重新生成。
*/

public class WebFullTables {
	
	/**
	 * 订单地址
	*/
	public static class WEBFULL_EXAMPLE_ADDRESS extends DBTable {
		
		/**
		 * 表名
		*/
		public static final String $NAME = "webfull_example_address";
		
		/**
		 * 主键
		*/
		public static final DBField ID = new DBField(DBDataType.STRING , "id","id","主键","主键",true,false,false);
		
		/**
		 * 收件人姓名
		*/
		public static final DBField NAME = new DBField(DBDataType.STRING , "name","name","收件人姓名","收件人姓名",false,false,true);
		
		/**
		 * 收件人手机
		*/
		public static final DBField PHONE_NUMBER = new DBField(DBDataType.STRING , "phone_number","phoneNumber","收件人手机","收件人手机",false,false,true);
		
		/**
		 * 收件地址
		*/
		public static final DBField ADDRESS = new DBField(DBDataType.STRING , "address","address","收件地址","收件地址",false,false,true);
		
		/**
		 * 类型，A:国内；B:国外
		*/
		public static final DBField REGION_TYPE = new DBField(DBDataType.STRING , "region_type","regionType","类型","A:国内；B:国外",false,false,false);
		
		/**
		 * 地区位置，东北、华北等
		*/
		public static final DBField REGION_LOCATION = new DBField(DBDataType.STRING , "region_location","regionLocation","地区位置","东北、华北等",false,false,true);
		
		/**
		 * 备注
		*/
		public static final DBField NOTES = new DBField(DBDataType.STRING , "notes","notes","备注","备注",false,false,true);
		
		/**
		 * 创建人ID
		*/
		public static final DBField CREATE_BY = new DBField(DBDataType.STRING , "create_by","createBy","创建人ID","创建人ID",false,false,true);
		
		/**
		 * 创建时间
		*/
		public static final DBField CREATE_TIME = new DBField(DBDataType.DATE , "create_time","createTime","创建时间","创建时间",false,false,true);
		
		/**
		 * 修改人ID
		*/
		public static final DBField UPDATE_BY = new DBField(DBDataType.STRING , "update_by","updateBy","修改人ID","修改人ID",false,false,true);
		
		/**
		 * 修改时间
		*/
		public static final DBField UPDATE_TIME = new DBField(DBDataType.DATE , "update_time","updateTime","修改时间","修改时间",false,false,true);
		
		/**
		 * 是否已删除
		*/
		public static final DBField DELETED = new DBField(DBDataType.INTEGER , "deleted","deleted","是否已删除","是否已删除",false,false,false);
		
		/**
		 * 删除人ID
		*/
		public static final DBField DELETE_BY = new DBField(DBDataType.STRING , "delete_by","deleteBy","删除人ID","删除人ID",false,false,true);
		
		/**
		 * 删除时间
		*/
		public static final DBField DELETE_TIME = new DBField(DBDataType.DATE , "delete_time","deleteTime","删除时间","删除时间",false,false,true);
		
		/**
		 * 版本
		*/
		public static final DBField VERSION = new DBField(DBDataType.INTEGER , "version","version","版本","版本",false,false,false);
		
		public WEBFULL_EXAMPLE_ADDRESS() {
			this.init($NAME,"订单地址" , ID , NAME , PHONE_NUMBER , ADDRESS , REGION_TYPE , REGION_LOCATION , NOTES , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION);
		}
		public static final WEBFULL_EXAMPLE_ADDRESS $TABLE=new WEBFULL_EXAMPLE_ADDRESS();
	}
	
	/**
	*/
	public static class WEBFULL_EXAMPLE_GOODS extends DBTable {
		
		/**
		 * 表名
		*/
		public static final String $NAME = "webfull_example_goods";
		
		/**
		 * 主键
		*/
		public static final DBField ID = new DBField(DBDataType.STRING , "id","id","主键","主键",true,false,false);
		
		/**
		 * 商品名
		*/
		public static final DBField NAME = new DBField(DBDataType.STRING , "name","name","商品名","商品名",false,false,true);
		
		/**
		 * 单价
		*/
		public static final DBField PRICE = new DBField(DBDataType.DECIMAL , "price","price","单价","单价",false,false,true);
		
		/**
		 * 创建人ID
		*/
		public static final DBField CREATE_BY = new DBField(DBDataType.STRING , "create_by","createBy","创建人ID","创建人ID",false,false,true);
		
		/**
		 * 创建时间
		*/
		public static final DBField CREATE_TIME = new DBField(DBDataType.DATE , "create_time","createTime","创建时间","创建时间",false,false,true);
		
		/**
		 * 修改人ID
		*/
		public static final DBField UPDATE_BY = new DBField(DBDataType.STRING , "update_by","updateBy","修改人ID","修改人ID",false,false,true);
		
		/**
		 * 修改时间
		*/
		public static final DBField UPDATE_TIME = new DBField(DBDataType.DATE , "update_time","updateTime","修改时间","修改时间",false,false,true);
		
		/**
		 * 是否已删除
		*/
		public static final DBField DELETED = new DBField(DBDataType.INTEGER , "deleted","deleted","是否已删除","是否已删除",false,false,false);
		
		/**
		 * 删除人ID
		*/
		public static final DBField DELETE_BY = new DBField(DBDataType.STRING , "delete_by","deleteBy","删除人ID","删除人ID",false,false,true);
		
		/**
		 * 删除时间
		*/
		public static final DBField DELETE_TIME = new DBField(DBDataType.DATE , "delete_time","deleteTime","删除时间","删除时间",false,false,true);
		
		/**
		*/
		public static final DBField VERSION = new DBField(DBDataType.INTEGER , "version","version","version","version",false,false,false);
		
		public WEBFULL_EXAMPLE_GOODS() {
			this.init($NAME,"" , ID , NAME , PRICE , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION);
		}
		public static final WEBFULL_EXAMPLE_GOODS $TABLE=new WEBFULL_EXAMPLE_GOODS();
	}
	
	/**
	*/
	public static class WEBFULL_EXAMPLE_ORDER extends DBTable {
		
		/**
		 * 表名
		*/
		public static final String $NAME = "webfull_example_order";
		
		/**
		 * 主键
		*/
		public static final DBField ID = new DBField(DBDataType.STRING , "id","id","主键","主键",true,false,false);
		
		/**
		 * 订单编号
		*/
		public static final DBField ORDER_NO = new DBField(DBDataType.STRING , "order_no","orderNo","订单编号","订单编号",false,false,true);
		
		/**
		 * 订单金额
		*/
		public static final DBField AMOUNT = new DBField(DBDataType.DECIMAL , "amount","amount","订单金额","订单金额",false,false,true);
		
		/**
		 * 收件地址ID
		*/
		public static final DBField ADDRESS_ID = new DBField(DBDataType.STRING , "address_id","addressId","收件地址ID","收件地址ID",false,false,true);
		
		/**
		 * 创建人ID
		*/
		public static final DBField CREATE_BY = new DBField(DBDataType.STRING , "create_by","createBy","创建人ID","创建人ID",false,false,true);
		
		/**
		 * 创建时间
		*/
		public static final DBField CREATE_TIME = new DBField(DBDataType.DATE , "create_time","createTime","创建时间","创建时间",false,false,true);
		
		/**
		 * 修改人ID
		*/
		public static final DBField UPDATE_BY = new DBField(DBDataType.STRING , "update_by","updateBy","修改人ID","修改人ID",false,false,true);
		
		/**
		 * 修改时间
		*/
		public static final DBField UPDATE_TIME = new DBField(DBDataType.DATE , "update_time","updateTime","修改时间","修改时间",false,false,true);
		
		/**
		 * 是否已删除
		*/
		public static final DBField DELETED = new DBField(DBDataType.INTEGER , "deleted","deleted","是否已删除","是否已删除",false,false,false);
		
		/**
		 * 删除人ID
		*/
		public static final DBField DELETE_BY = new DBField(DBDataType.STRING , "delete_by","deleteBy","删除人ID","删除人ID",false,false,true);
		
		/**
		 * 删除时间
		*/
		public static final DBField DELETE_TIME = new DBField(DBDataType.DATE , "delete_time","deleteTime","删除时间","删除时间",false,false,true);
		
		/**
		*/
		public static final DBField VERSION = new DBField(DBDataType.INTEGER , "version","version","version","version",false,false,false);
		
		public WEBFULL_EXAMPLE_ORDER() {
			this.init($NAME,"" , ID , ORDER_NO , AMOUNT , ADDRESS_ID , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION);
		}
		public static final WEBFULL_EXAMPLE_ORDER $TABLE=new WEBFULL_EXAMPLE_ORDER();
	}
	
	/**
	*/
	public static class WEBFULL_EXAMPLE_ORDER_ITEM extends DBTable {
		
		/**
		 * 表名
		*/
		public static final String $NAME = "webfull_example_order_item";
		
		/**
		 * 主键
		*/
		public static final DBField ID = new DBField(DBDataType.STRING , "id","id","主键","主键",true,false,false);
		
		/**
		 * 订单ID
		*/
		public static final DBField ORDER_ID = new DBField(DBDataType.STRING , "order_id","orderId","订单ID","订单ID",false,false,true);
		
		/**
		 * 商品ID
		*/
		public static final DBField GOODS_ID = new DBField(DBDataType.STRING , "goods_id","goodsId","商品ID","商品ID",false,false,true);
		
		/**
		 * 创建人ID
		*/
		public static final DBField CREATE_BY = new DBField(DBDataType.STRING , "create_by","createBy","创建人ID","创建人ID",false,false,true);
		
		/**
		 * 创建时间
		*/
		public static final DBField CREATE_TIME = new DBField(DBDataType.DATE , "create_time","createTime","创建时间","创建时间",false,false,true);
		
		/**
		 * 修改人ID
		*/
		public static final DBField UPDATE_BY = new DBField(DBDataType.STRING , "update_by","updateBy","修改人ID","修改人ID",false,false,true);
		
		/**
		 * 修改时间
		*/
		public static final DBField UPDATE_TIME = new DBField(DBDataType.DATE , "update_time","updateTime","修改时间","修改时间",false,false,true);
		
		/**
		 * 是否已删除
		*/
		public static final DBField DELETED = new DBField(DBDataType.INTEGER , "deleted","deleted","是否已删除","是否已删除",false,false,false);
		
		/**
		 * 删除人ID
		*/
		public static final DBField DELETE_BY = new DBField(DBDataType.STRING , "delete_by","deleteBy","删除人ID","删除人ID",false,false,true);
		
		/**
		 * 删除时间
		*/
		public static final DBField DELETE_TIME = new DBField(DBDataType.DATE , "delete_time","deleteTime","删除时间","删除时间",false,false,true);
		
		/**
		*/
		public static final DBField VERSION = new DBField(DBDataType.INTEGER , "version","version","version","version",false,false,false);
		
		public WEBFULL_EXAMPLE_ORDER_ITEM() {
			this.init($NAME,"" , ID , ORDER_ID , GOODS_ID , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION);
		}
		public static final WEBFULL_EXAMPLE_ORDER_ITEM $TABLE=new WEBFULL_EXAMPLE_ORDER_ITEM();
	}
}