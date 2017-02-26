package com.geekidentity.datacastle.util;

import java.lang.reflect.Field;

public class ReflectUtil {
	
	public static String[] getFieldNames(Object o) {
		Field[] fields = o.getClass().getDeclaredFields();
		String[] names = new String[fields.length];
		for (int i = 0; i < fields.length; i++) {
			names[i] = fields[i].getName();
		}
		return names;
	}
}
