package com.geekidentity.datacastle.preliminary.service;

import java.io.File;

import com.geekidentity.datacastle.preliminary.entity.BankDetail;
import com.geekidentity.showcase.common.service.BaseService;

public interface BankDetailService extends BaseService<BankDetail> {
	/**
	 * 导入训练数据
	 * @param file
	 */
	void importData(File file);
}
