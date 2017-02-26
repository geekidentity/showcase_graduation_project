package com.geekidentity.datacastle.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;
import org.springframework.cglib.core.ReflectUtils;

import com.geekidentity.datacastle.house.entity.HouseOrigin;
import com.geekidentity.datacastle.util.ReflectUtil;
import com.geekidentity.excel.CellStyle;

public class Tests {

	@Test
	public void test() {
		HouseOrigin houseOrigin = new HouseOrigin();
		Field[] fields = houseOrigin.getClass().getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.isAnnotationPresent(CellStyle.class));
		}
	}

}
