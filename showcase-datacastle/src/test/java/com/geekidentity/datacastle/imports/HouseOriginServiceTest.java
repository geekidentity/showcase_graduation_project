package com.geekidentity.datacastle.imports;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.house.entity.HouseOrigin;
import com.geekidentity.datacastle.house.service.HouseOriginService;
import com.geekidentity.datacastle.test.TestBase;
import com.geekidentity.excel.Excel;

public class HouseOriginServiceTest extends TestBase {

	@Autowired
	private HouseOriginService houseOriginService;
	@Test
	public void test() throws Exception {
		File file = new File("F:/创意赛/楼盘信息.xlsx");
		Excel<HouseOrigin> excel = new Excel<>(HouseOrigin.class, file);
		List<HouseOrigin> houseOrigins = excel.importFromXls(file);
		for (HouseOrigin houseOrigin : houseOrigins) {
			houseOriginService.create(houseOrigin);
		}
	}

}
