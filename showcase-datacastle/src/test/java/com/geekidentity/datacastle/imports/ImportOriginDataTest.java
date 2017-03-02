package com.geekidentity.datacastle.imports;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.test.TestBase;
import com.geekidentity.datacastle.venture.service.VentureProjectOriginService;

public class ImportOriginDataTest extends TestBase {
	
	@Autowired
	private VentureProjectOriginService ventureProjectOriginService;
	
	@Test
	public void ventureProjectOriginImportTest() {
		File file = new File("f:/智慧中国杯/创业项目.json");
		ventureProjectOriginService.importOriginData(file);
	}
}
