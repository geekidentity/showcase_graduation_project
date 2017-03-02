package com.geekidentity.showcase.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeanUtilTest {
	
	@Test
	public void getCamelNameTest() {
		String underlineName = "get_User_name";
		String result = BeanUtil.getCamelNameByUnderline(underlineName);
		assertEquals("getUserName", result);
		
		String id = "_id";
		assertEquals("id", BeanUtil.getCamelNameByUnderline(id));
	}
}
