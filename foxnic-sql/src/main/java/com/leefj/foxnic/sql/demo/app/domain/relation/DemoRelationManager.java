package com.leefj.foxnic.sql.demo.app.domain.relation;

import com.github.foxnic.dao.relation.RelationManager;

public class DemoRelationManager extends RelationManager {

	public DemoRelationManager() {
		super(
				new ExampleRelationManager()
		);
	}

	@Override
	protected void config() {}

}
