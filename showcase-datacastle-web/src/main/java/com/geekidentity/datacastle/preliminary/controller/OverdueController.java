package com.geekidentity.datacastle.preliminary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekidentity.datacastle.preliminary.model.OverdueRateModel;
import com.geekidentity.datacastle.preliminary.service.OverdueService;

@RestController
@RequestMapping(value="overdue/")
public class OverdueController {
	
	@Autowired
	private OverdueService overdueService;
	
	@RequestMapping(value="rate")
	public List<OverdueRateModel> overdueRate() {
		return overdueService.overdueRate();
	}
}
