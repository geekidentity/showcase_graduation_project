package com.geekidentity.datacastle.venture.service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekidentity.datacastle.common.OriginBaseService;
import com.geekidentity.datacastle.venture.entity.VentureProject;
import com.geekidentity.datacastle.venture.model.VentureProjectOrigin;
import com.geekidentity.showcase.util.BeanUtil;

@Service
@Transactional
public class VentureProjectOriginService implements OriginBaseService<VentureProjectOrigin, VentureProject> {

	@Autowired
	private VentureProjectService ventureProjectService;
	
	@Override
	public void importOriginData(File file) {
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper();
		Iterator<VentureProjectOrigin> iterator;
		List<VentureProject> projects = new LinkedList<>();
		try {
			JsonParser jsonParser = factory.createParser(file);
			iterator = mapper.readValues(jsonParser, VentureProjectOrigin.class);
			int failed = 0;
			while (iterator.hasNext()) {
				try {
					VentureProjectOrigin origin = (VentureProjectOrigin) iterator.next();
					VentureProject target = conversionData(origin);
					projects.add(target);
				} catch (Exception e) {
					failed++;
				}
			}
			
			System.out.println(projects.size());
			System.out.println(failed);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ventureProjectService.batchSave(projects);
		
	}

	@Override
	public VentureProject conversionData(VentureProjectOrigin origin) {
		VentureProject target = new VentureProject();
		BeanUtils.copyProperties(origin, target);
		BeanUtil.copyUnderlineProperties(origin, target);
		target.setCompanyProgresses(Arrays.toString(origin.getCompany_progress().toArray()));
		target.setStockholders(Arrays.toString(origin.getStockholder().toArray()));
		target.setKeywords(Arrays.toString(origin.getKeywords().toArray()));
		target.setCrawlTime(origin.getCrawl_time().get$date());
		
		return target;
	}

}
