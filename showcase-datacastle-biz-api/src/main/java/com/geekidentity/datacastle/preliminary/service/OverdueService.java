package com.geekidentity.datacastle.preliminary.service;

import java.io.File;

import com.geekidentity.datacastle.preliminary.entity.Overdue;
import com.geekidentity.showcase.common.service.BaseService;

public interface OverdueService extends BaseService<Overdue> {
	/**
	 * 导入训练数据
	 * 
	 * @param file
	 */
	void importData(File file);
}
