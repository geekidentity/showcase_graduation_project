package com.geekidentity.datacastle.common;

import java.io.File;

/**
 * 抽象原始数据处理服务
 * @author geekidentity
 * @date 2017年3月1日
 * @version 1.0
 *
 * @param <ORIGIN>
 * @param <TARGET>
 */
public interface OriginBaseService<ORIGIN, TARGET> {
	
	/**
	 * 将文件中数据导入数据库
	 * @param file 
	 */
	void insertOriginData(File file);
	
	/**
	 * 将原始数据处理成格式化数据
	 * @param source
	 * @return
	 */
	TARGET conversionData(ORIGIN origin);
}
