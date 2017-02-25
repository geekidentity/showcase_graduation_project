package com.geekidentity.datacastle.house;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.house.service.HouseOriginService;
import com.geekidentity.datacastle.test.TestBase;

public class HouseOriginServiceTest extends TestBase {

	@Autowired
	private HouseOriginService houseOriginService;
	@Test
	public void test() {
		Integer id = 1;
		houseOriginService.get(id);
	}

}
