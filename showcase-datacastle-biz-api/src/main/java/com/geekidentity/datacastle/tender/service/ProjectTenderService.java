package com.geekidentity.datacastle.tender.service;

import java.io.File;

import com.geekidentity.datacastle.tender.entity.ProjectTender;
import com.geekidentity.showcase.common.service.BaseService;

public interface ProjectTenderService extends BaseService<ProjectTender> {
	
	/**
	 * 从txt文件中导入数据
	 * @param file
	 */
	void insertFromTxt(File file);
}
