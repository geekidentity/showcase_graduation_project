package com.geekidentity.datacastle.preliminary.service;

import java.io.File;

import com.geekidentity.datacastle.preliminary.entity.BillDetail;
import com.geekidentity.showcase.common.service.BaseService;

/**
 * 
 * @author geekidentity
 * @date 2017年4月4日
 * @version 1.0
 *
 */
public interface BillDetailService extends BaseService<BillDetail> {
	/**
	 * 导入训练数据
	 * @param file
	 */
	void importData(File file);
}
