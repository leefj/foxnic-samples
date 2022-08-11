package com.leefj.webfull.constants.db;

import com.github.foxnic.sql.meta.DBField;
import com.github.foxnic.sql.meta.DBTable;
import com.github.foxnic.sql.meta.DBDataType;



/**
 * @since 2022-08-11 16:55:50
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
			this.init($NAME,"订单地址" , ID , NAME , PHONE_NUMBER , ADDRESS , REGION_TYPE , REGION_LOCATION , CREATE_BY , CREATE_TIME , UPDATE_BY , UPDATE_TIME , DELETED , DELETE_BY , DELETE_TIME , VERSION);
		}
		public static final WEBFULL_EXAMPLE_ADDRESS $TABLE=new WEBFULL_EXAMPLE_ADDRESS();
	}
}