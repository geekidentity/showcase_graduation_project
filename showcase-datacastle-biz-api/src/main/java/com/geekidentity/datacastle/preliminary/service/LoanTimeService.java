package com.geekidentity.datacastle.preliminary.service;

import java.io.File;
import java.util.List;

import com.geekidentity.datacastle.preliminary.entity.LoanTime;
import com.geekidentity.datacastle.preliminary.entity.LoanTimeDailyModel;
import com.geekidentity.showcase.common.service.BaseService;

public interface LoanTimeService extends BaseService<LoanTime> {
	/**
	 * 导入训练数据
	 * @param file
	 */
	void importData(File file);
	
	
	/**
	 * 每天放贷列表
	 * @return
	 */
	List<LoanTimeDailyModel> dailyData();
}
