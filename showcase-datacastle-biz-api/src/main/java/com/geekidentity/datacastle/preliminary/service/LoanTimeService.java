package com.geekidentity.datacastle.preliminary.service;

import java.io.File;

import com.geekidentity.datacastle.preliminary.entity.LoanTime;
import com.geekidentity.showcase.common.service.BaseService;

public interface LoanTimeService extends BaseService<LoanTime> {
	/**
	 * 导入训练数据
	 * @param file
	 */
	void importData(File file);
}
