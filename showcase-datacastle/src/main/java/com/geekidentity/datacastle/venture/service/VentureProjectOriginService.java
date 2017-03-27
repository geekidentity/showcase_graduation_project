package com.geekidentity.datacastle.venture.service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekidentity.datacastle.common.OriginBaseService;
import com.geekidentity.datacastle.venture.entity.VentureProject;
import com.geekidentity.datacastle.venture.model.CompanyInvention;
import com.geekidentity.datacastle.venture.model.VentureProjectOrigin;
import com.geekidentity.showcase.util.BeanUtil;

@Service
@Transactional
public class VentureProjectOriginService implements OriginBaseService<VentureProjectOrigin, VentureProject> {

	@Autowired
	private VentureProjectService ventureProjectService;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void insertOriginData(File file) {
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper();
		Iterator<VentureProjectOrigin> iterator;
		List<VentureProject> projects = new LinkedList<>();
		try {
			JsonParser jsonParser = factory.createParser(file);
			JsonParser mapParser = factory.createParser(file);
			iterator = mapper.readValues(jsonParser, VentureProjectOrigin.class);
			int failed = 0;
			
			Map<String, Map> map = null;
			VentureProject target = null;
			while (iterator.hasNext()) {
				try {
					map = mapper.readValue(mapParser, Map.class);
					VentureProjectOrigin origin = iterator.next();
					target = conversionData(origin);
					projects.add(target);
				} catch (Exception e) {
					String msg = e.getMessage();
					if (msg.contains("finance_value")) {
						failed++;
						Map t = map.get("finance_value");
						if (t != null) {
							Object value = t.get("$numberLong");
							target.setFinanceValue(new BigDecimal(value.toString()));
						}
					}
					if (msg.contains("company_money")) {
						failed++;
						Map t = map.get("company_money");
						if (t != null) {
							Object value = t.get("$numberLong");
							target.setCompanyMoney(new BigDecimal(value.toString()));
						}
					}
					
				}
			}
			
			System.out.println(projects.size());
			System.out.println(failed);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date begin = new Date();
		System.out.println("begin batch save ventureProject: " + begin);
		ventureProjectService.batchSave(projects);
		Date end = new Date();
		System.out.println("end batch save ventureProject: " + end);
		System.out.println("batch user time: " + (end.getTime() - begin.getTime()) / 1000 + "s");
		
	}

	@Override
	public VentureProject conversionData(VentureProjectOrigin origin) {
		VentureProject target = new VentureProject();
		BeanUtils.copyProperties(origin, target);
		BeanUtil.copyUnderlineProperties(origin, target);
		target.setCompanyProgress(origin.getCompany_progress());
		target.setKeywords(origin.getKeywords());
		target.setCrawlTime(origin.getCrawl_time().get$date());
		target.setId(origin.get_id().get$oid());
		
		// process CompanyInvention
		CompanyInvention[] inventions = origin.getCompany_invention();
		target.setCompanyInvention(inventions);
		
		if (inventions != null) {
			target.setCompanyInventionCount(inventions.length);
		} else {
			target.setCompanyInventionCount(0);
		}
		return target;
	}

}
