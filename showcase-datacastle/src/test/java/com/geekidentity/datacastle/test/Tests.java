package com.geekidentity.datacastle.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.cglib.core.ReflectUtils;

import com.geekidentity.datacastle.house.entity.HouseOrigin;
import com.geekidentity.excel.CellStyle;
import com.geekidentity.showcase.util.ReflectUtil;

public class Tests {

	@Test
	public void test() {
		List<String> array = new ArrayList<>();
		array.add("hello");
		System.out.println(Arrays.deepToString(array.toArray()));
	}

}
