package com.geekidentity.datacastle.preliminary.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekidentity.datacastle.preliminary.entity.LoanTimeDailyModel;
import com.geekidentity.datacastle.test.TestBase;

public class LoanTimeServiceTest extends TestBase {

	@Autowired
	private LoanTimeService loanTimeService;
	
	@Test
	public void dailyDataTest() {
		List<LoanTimeDailyModel> loanTimeDailyModels = loanTimeService.dailyData();
		System.out.println(loanTimeDailyModels.size());
		assertNotNull(loanTimeDailyModels);
	}
}
