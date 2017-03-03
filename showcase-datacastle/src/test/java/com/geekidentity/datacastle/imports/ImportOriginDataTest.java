package com.geekidentity.datacastle.imports;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.geekidentity.datacastle.company.service.CompanyRegistrationOriginService;
import com.geekidentity.datacastle.house.entity.HouseOrigin;
import com.geekidentity.datacastle.house.service.HouseOriginService;
import com.geekidentity.datacastle.tender.entity.ProjectTender;
import com.geekidentity.datacastle.tender.service.ProjectTenderService;
import com.geekidentity.datacastle.test.TestBase;
import com.geekidentity.datacastle.venture.service.VentureProjectOriginService;
import com.geekidentity.excel.Excel;

public class ImportOriginDataTest extends TestBase {
	
	@Autowired
	private HouseOriginService houseOriginService;
	//@Autowired
	private VentureProjectOriginService ventureProjectOriginService;
	@Autowired
	private CompanyRegistrationOriginService companyRegistrationOriginService;
	@Autowired
	private ProjectTenderService projectTenderService;
	@Test
	@Transactional
	public void insertProjectTenderOriginImport() throws Exception {
		File file = new File("f:/智慧中国杯/项目招标.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		List<ProjectTender> list = new ArrayList<>();
		reader.readLine();
		while((line = reader.readLine()) != null) {
			int i = 0;
			String[] values = line.split("\"	\"");
			ProjectTender tender = new ProjectTender();
			String idStr = values[i++].substring(1);
			tender.setId(Integer.valueOf(idStr));
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			tender.setReleaseDate(dateFormat.parse(values[i++]));
			tender.setTitle(values[i++]);
			tender.setType(values[i++]);
			tender.setRegion(values[i++]);
			tender.setBiddingCompany(values[i++]);
			tender.setAgentCompany(values[i++]);
			tender.setTenderCompany(values[i++]);
			tender.setBiddingNumber(values[i++]);
			tender.setMoney(values[i++]);
			tender.setSourceUrl(values[i++]);
			tender.setBiddingContent(values[i++]);
			String oldIdStr = values[i++];
			oldIdStr = oldIdStr.substring(0, oldIdStr.length()-1);
			tender.setOldId(Integer.valueOf(oldIdStr));
			list.add(tender);
		}
		
		reader.close();
		projectTenderService.batchSave(list);
	}
	
	//@Test
	public void ventureProjectOriginImportTest() {
		File file = new File("f:/智慧中国杯/创业项目.json");
		ventureProjectOriginService.importOriginData(file);
	}
	
	// done
	@Test
	@Ignore
	public void houseOriginTest() throws Exception {
		File file = new File("F:/智慧中国杯/楼盘信息.xlsx");
		Excel<HouseOrigin> excel = new Excel<>(HouseOrigin.class, file);
		List<HouseOrigin> houseOrigins = excel.importFromXls(file);
		for (HouseOrigin houseOrigin : houseOrigins) {
			houseOriginService.create(houseOrigin);
		}
	}
	
	// done
	@Test
	@Ignore
	public void CompanyRegistrationOriginTest() {
		File file = new File("f:/智慧中国杯/公司注册.json");
		companyRegistrationOriginService.importOriginData(file);
	}
}
