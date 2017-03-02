package com.geekidentity.showcase.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

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
	public static void copyUnderlineProperties(Object origin, Object target) {
		Assert.notNull(origin, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

		List<String> underlinePropertyNames = getUnderlineFeildName(origin);
		
		for (String name : underlinePropertyNames) {
			Field field = getField(origin, name);
			if (field != null) {
				String targetFieldName = getCamelNameByUnderline(field.getName());
				Field targetField = getField(target, targetFieldName);
				if (targetField != null) {
					field.setAccessible(true);
					targetField.setAccessible(true);
					try {
						targetField.set(target, field.get(origin));
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			 
		}
		
	}
	
	/**
	 * 获取对象中有 '_' 的属性
	 * @param source 目标对象
	 * @return
	 */
	public static List<String> getUnderlineFeildName(Object source) {
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
	
	/**
	 * 将下划线方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。<br>
	 * 例如 get_User_name 则返回 getUserName， _id  return id
	 * @param underlineName
	 * @return
	 */
	public static String getCamelNameByUnderline(String underlineName) {
		StringBuilder builder = new StringBuilder();
		if (underlineName != null && underlineName.length() > 0) {
			char[] chs = underlineName.toCharArray();
			for (int i = 0; i < chs.length; i++) {
				if (chs[i] == '_' && i != 0) {
					builder.append(Character.toUpperCase(chs[++i]));
				} else if (chs[i] == '_' && i == 0) {//处理类似 _id的情况
					builder.append(chs[++i]);
				} else {
					builder.append(chs[i]);
				}
			}
			return builder.toString();
		}
		return underlineName;
	}
	
	/**
	 * 获取对象的field 如果没有则返回 null.
	 * @param o
	 * @param name
	 * @return
	 */
	public static Field getField(Object o, String name) {
		try {
			return o.getClass().getDeclaredField(name);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
