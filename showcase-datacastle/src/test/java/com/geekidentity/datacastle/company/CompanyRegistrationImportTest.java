package com.geekidentity.datacastle.company;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.company.service.CompanyRegistrationOriginService;
import com.geekidentity.datacastle.test.TestBase;


public class CompanyRegistrationImportTest extends TestBase{
	
	@Autowired
	private CompanyRegistrationOriginService companyRegistrationOriginService;
	@Test
	public void test1() {
		File file = new File("f:/智慧中国杯/公司注册.json");
		companyRegistrationOriginService.parseOriginData(file);
	}
}
