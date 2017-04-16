package com.geekidentity.datacastle.preliminary.service;

import java.io.File;
import java.util.List;

import com.geekidentity.datacastle.preliminary.entity.Overdue;
import com.geekidentity.datacastle.preliminary.model.OverdueRateModel;
import com.geekidentity.showcase.common.service.BaseService;

public interface OverdueService extends BaseService<Overdue> {
	/**
	 * 导入训练数据
	 * 
	 * @param file
	 */
	void importData(File file);
	
	/**
	 * 逾期30天以上概率
	 * @return
	 */
	List<OverdueRateModel> overdueRate();
	
}
