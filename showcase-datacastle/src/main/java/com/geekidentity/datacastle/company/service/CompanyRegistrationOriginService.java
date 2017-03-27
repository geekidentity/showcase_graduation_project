package com.geekidentity.datacastle.company.service;

import java.io.File;
import java.io.IOException;
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
import com.geekidentity.datacastle.company.entity.CompanyRegistration;
import com.geekidentity.datacastle.company.model.CompanyRegistrationOrigin;

@Service
@Transactional
public class CompanyRegistrationOriginService implements OriginBaseService<CompanyRegistrationOrigin, CompanyRegistration> {
	
	@Autowired
	private CompanyRegistrationService companyRegistrationService;
	
	@Override
	public void insertOriginData(File file) {
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper();
		Iterator<CompanyRegistrationOrigin> companys;
		List<CompanyRegistration> registrations = new LinkedList<>();
		int failed = 0;
		try {
			JsonParser jsonParser = factory.createParser(file);
			companys = mapper.readValues(jsonParser, CompanyRegistrationOrigin.class);
			
			while (companys.hasNext()) {
				try {
					CompanyRegistrationOrigin origin = (CompanyRegistrationOrigin) companys.next();
					CompanyRegistration target = conversionData(origin);
					registrations.add(target);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					failed++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		companyRegistrationService.batchSave(registrations);
		System.out.println("failed:" + failed);
	}
	
	@Override
	public CompanyRegistration conversionData(CompanyRegistrationOrigin origin) {
		CompanyRegistration target = new CompanyRegistration();
		BeanUtils.copyProperties(origin, target);
		
		target.setId(origin.get_id().get$oid());
		target.setOrgCode(origin.getOrg_code());
		target.setBusinessScope(origin.getBusiness_scope());
		target.setCompanyType(origin.getCompany_type());
		target.setCompanyState(origin.getCompany_state());
		target.setCompanyAddress(origin.getCompany_address());
		target.setAcceptDate(origin.getAccept_date().get$date());
		target.setRegisterDate(origin.getRegister_date() == null ? null : origin.getRegister_date().get$date());
		target.setRegisterCapital(origin.getRegister_capital());
		target.setSocialInsurance(origin.getSocial_insurance());
		target.setRegisterGov(origin.getRegister_gov());
		target.setArtificialPerson(origin.getArtificial_person());
		target.setHousingFund(origin.getHousing_fund());
		return target;
	}

}
