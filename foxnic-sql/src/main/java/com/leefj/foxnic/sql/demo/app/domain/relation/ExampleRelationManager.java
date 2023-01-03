package com.leefj.foxnic.sql.demo.app.domain.relation;

import com.github.foxnic.dao.relation.RelationManager;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.AddressMeta;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.GoodsMeta;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderItemMeta;
import com.leefj.foxnic.sql.demo.app.domain.example.meta.OrderMeta;
import com.leefj.foxnic.sql.demo.config.db.ExampleTables;

public class ExampleRelationManager extends RelationManager {

	@Override
	protected void config() {
		this.setupOrder();
	}

	public void setupOrder() {
		// 以下是 Order 扩展属性的关联关系配置
		// Order.address 属性通过 EXAMPLE_ORDER.ADDRESS_ID 字段关联到 EXAMPLE_ADDRESS.ID 字段
		this.property(OrderMeta.ADDRESS_PROP)
				.using(ExampleTables.EXAMPLE_ORDER.ADDRESS_ID).join(ExampleTables.EXAMPLE_ADDRESS.ID)
				// 由于订单地址不常变动，可以开启缓存
				.cache(true);

		// Order.goodsList 属性通过 EXAMPLE_ORDER.ID 字段关联到 EXAMPLE_ORDER_ITEM.ORDER_ID 字段
		// 再通过 EXAMPLE_ORDER_ITEM.GOODS_ID 字段关联到 EXAMPLE_GOODS.ID 字段
		this.property(OrderMeta.GOODS_LIST_PROP)
				.using(ExampleTables.EXAMPLE_ORDER.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID).join(ExampleTables.EXAMPLE_GOODS.ID)
				// 订单一旦生成，订单明细不再变动，开启缓存
				.cache(true);

		// Order.itemList 属性通过 EXAMPLE_ORDER.ID 字段关联到 EXAMPLE_ORDER_ITEM.ORDER_ID 字段
		this.property(OrderMeta.ITEM_LIST_PROP)
				.using(ExampleTables.EXAMPLE_ORDER.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID)
				.cache(true);

		// 以下是 OrderItem 扩展属性的关联关系配置
		// OrderItem.order 属性通过 EXAMPLE_ORDER_ITEM.ORDER_ID 字段关联到 EXAMPLE_ORDER.ID 字段
		this.property(OrderItemMeta.ORDER_PROP)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID).join(ExampleTables.EXAMPLE_ORDER.ID)
				.cache(true);

		// OrderItem.goods 属性通过 EXAMPLE_ORDER_ITEM.GOODS_ID 字段关联到 EXAMPLE_GOODS.ID 字段
		this.property(OrderItemMeta.GOODS_PROP)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID).join(ExampleTables.EXAMPLE_GOODS.ID)
				.cache(true);


		// 以下是 Goods 扩展属性的关联关系配置
		this.property(GoodsMeta.ORDER_LIST_PROP)
				.using(ExampleTables.EXAMPLE_GOODS.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID).join(ExampleTables.EXAMPLE_ORDER.ID)
				.cache(true);

		this.property(GoodsMeta.ADDRESS_LIST_PROP)
				.using(ExampleTables.EXAMPLE_GOODS.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID).join(ExampleTables.EXAMPLE_ORDER.ID)
				.using(ExampleTables.EXAMPLE_ORDER.ADDRESS_ID).join(ExampleTables.EXAMPLE_ADDRESS.ID)
				.cache(true);

		this.property(GoodsMeta.ITEM_LIST_PROP)
				.using(ExampleTables.EXAMPLE_GOODS.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID)
				.cache(true);

		// 以下是 Address 扩展属性的关联关系配置
		this.property(AddressMeta.ORDER_LIST_PROP)
				.using(ExampleTables.EXAMPLE_ADDRESS.ID).join(ExampleTables.EXAMPLE_ORDER.ADDRESS_ID)
				.cache(true);

		this.property(AddressMeta.ITEM_LIST_PROP)
				.using(ExampleTables.EXAMPLE_ADDRESS.ID).join(ExampleTables.EXAMPLE_ORDER.ADDRESS_ID)
				.using(ExampleTables.EXAMPLE_ORDER.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID)
				.cache(true);

		this.property(AddressMeta.GOODS_LIST_PROP)
				.using(ExampleTables.EXAMPLE_ADDRESS.ID).join(ExampleTables.EXAMPLE_ORDER.ADDRESS_ID)
				.using(ExampleTables.EXAMPLE_ORDER.ID).join(ExampleTables.EXAMPLE_ORDER_ITEM.ORDER_ID)
				.using(ExampleTables.EXAMPLE_ORDER_ITEM.GOODS_ID).join(ExampleTables.EXAMPLE_GOODS.ID)
				.cache(true);
	}
}
