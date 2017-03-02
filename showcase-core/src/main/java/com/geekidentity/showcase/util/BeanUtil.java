package com.geekidentity.datacastle.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

/**
 * 
 * @author geekidentity
 * @date 2017年3月1日
 * @version 1.0
 *
 */
public class BeanUtil extends BeanUtils {
	
	/**
	 * 将有下划线的property 复制为没下划线的porperty<br>
	 * 例如： 将属性 my_field 复制目标属性 myField
	 */
	public static void copyUnderlineProperties(Object source, Object target) {
		String[] ignoreProperties = (String[]) getNoUnderlineProperties(source).toArray();
		copyProperties(source, target, ignoreProperties);;
	}
	
	/**
	 * 获取对象中没有 '_' 的属性
	 * @param source 目标对象
	 * @return
	 */
	public static List<String> getNoUnderlineProperties(Object source) {
		List<String> underlineProperties = new ArrayList<>();
		Field[] fields = source.getClass().getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();
			if (fieldName.contains("_")) {
				underlineProperties.add(fieldName);
			}
		}
		return underlineProperties;
	}
	
}
