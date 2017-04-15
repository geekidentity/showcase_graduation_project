package com.geekidentity.datacastle.preliminary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekidentity.datacastle.preliminary.entity.LoanTimeDailyModel;
import com.geekidentity.datacastle.preliminary.service.LoanTimeService;

@RestController
@RequestMapping(value="loanTime/")
public class LoanTimeController {
	
	@Autowired
	private LoanTimeService loanTimeService;
	
	@RequestMapping(value="/dailyData")
	public List<LoanTimeDailyModel> dailyData() {
		List<LoanTimeDailyModel> loanTimeDailyModels = loanTimeService.dailyData();
		return loanTimeDailyModels;
	}
}
