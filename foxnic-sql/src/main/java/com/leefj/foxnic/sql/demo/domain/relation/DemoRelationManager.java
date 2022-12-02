package com.leefj.foxnic.sql.demo.domain.relation;

import com.github.foxnic.commons.concurrent.task.SimpleTaskManager;
import com.github.foxnic.commons.log.Logger;
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
