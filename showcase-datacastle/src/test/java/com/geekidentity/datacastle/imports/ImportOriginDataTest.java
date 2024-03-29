package com.geekidentity.datacastle.imports;

import java.io.File;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.company.service.CompanyRegistrationOriginService;
import com.geekidentity.datacastle.house.entity.HouseOrigin;
import com.geekidentity.datacastle.house.service.HouseOriginService;
import com.geekidentity.datacastle.preliminary.service.BankDetailService;
import com.geekidentity.datacastle.preliminary.service.BillDetailService;
import com.geekidentity.datacastle.preliminary.service.BrowseHistoryService;
import com.geekidentity.datacastle.preliminary.service.LoanTimeService;
import com.geekidentity.datacastle.preliminary.service.OverdueService;
import com.geekidentity.datacastle.preliminary.service.UserInfoService;
import com.geekidentity.datacastle.tender.service.ProjectTenderService;
import com.geekidentity.datacastle.test.TestBase;
import com.geekidentity.datacastle.venture.service.VentureProjectOriginService;
import com.geekidentity.excel.Excel;

public class ImportOriginDataTest extends TestBase {
	
	@Autowired
	private HouseOriginService houseOriginService;
	@Autowired
	private VentureProjectOriginService ventureProjectOriginService;
	@Autowired
	private CompanyRegistrationOriginService companyRegistrationOriginService;
	@Autowired
	private ProjectTenderService projectTenderService;
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private BankDetailService bankDetailService;
	@Autowired
	private BrowseHistoryService browseHistoryService;
	@Autowired
	private BillDetailService billDetailService;
	@Autowired
	private LoanTimeService loanTimeService;
	@Autowired
	private OverdueService overdueService;
	
	// done
	@Test
	@Ignore
	public void insertOverdueTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/overdue_train.txt");
		overdueService.importData(file);
	}
	
	// done
	@Test
	@Ignore
	public void insertLoanTimeTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/loan_time_train.txt");
		loanTimeService.importData(file);
	}
	
	// done
	@Test
	@Ignore
	public void insertBillDetailTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/bill_detail_train.txt");
		billDetailService.importData(file);
	}
	
	// done
	@Test
	@Ignore
	public void insertBrowseHistoryTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/browse_history_train.txt");
		browseHistoryService.importData(file);
	}
	
	// done
	@Test
	@Ignore
	public void insertBankDetailTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/bank_detail_train.txt");
		bankDetailService.importData(file);
	}
	
	// done
	@Test
	@Ignore
	public void insertUserInfoTrainTest() {
		File file = new File("F:/智慧中国杯/个人征信/train/user_info_train.txt");
		userInfoService.importData(file);;
	}
	
	// done
	@Test
	@Ignore
	public void insertProjectTenderOriginImport() throws Exception {
		File file = new File("f:/智慧中国杯/项目招标.txt");
		projectTenderService.insertFromTxt(file);
	}
	
	// done
	@Test
	@Ignore
	public void ventureProjectOriginImportTest() {
		File file = new File("f:/智慧中国杯/创业项目.json");
		ventureProjectOriginService.insertOriginData(file);
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
		companyRegistrationOriginService.insertOriginData(file);
	}
}
