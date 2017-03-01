package com.geekidentity.datacastle.company.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekidentity.datacastle.company.entity.CompanyRegistration;
import com.geekidentity.datacastle.company.model.CompanyRegistrationOrigin;

@Service
@Transactional
public class CompanyRegistrationOriginServiceImp implements CompanyRegistrationOriginService {
	
	@Autowired
	private CompanyRegistrationService companyRegistrationService;
	
	@Override
	public List<CompanyRegistration> parseOriginData(File file) {
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper();
		MappingIterator<CompanyRegistrationOrigin> companys;
		try {
			JsonParser jsonParser = factory.createParser(file);
			companys = mapper.readValues(jsonParser, CompanyRegistrationOrigin.class);
			List<CompanyRegistration> list = generateArray(companys);
			companyRegistrationService.batchSave(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int invalid = 0;
		
		
		System.out.println("invalied number: " + invalid);
		return null;
	}
	
	private List<CompanyRegistration> generateArray(MappingIterator<CompanyRegistrationOrigin> companys) {
		List<CompanyRegistration> list = new ArrayList<>(); 
		while (companys.hasNext()) {
			try {
				CompanyRegistrationOrigin company = (CompanyRegistrationOrigin) companys.next();
				CompanyRegistration registration = new CompanyRegistration();
				BeanUtils.copyProperties(company, registration);
				
				registration.setId(company.get_id().get$oid());
				registration.setOrgCode(company.getOrg_code());
				registration.setBusinessScope(company.getBusiness_scope());
				registration.setCompanyType(company.getCompany_type());
				registration.setCompanyState(company.getCompany_state());
				registration.setCompanyAddress(company.getCompany_address());
				registration.setAcceptDate(company.getAccept_date().get$date());
				registration.setRegisterDate(company.getRegister_date().get$date());
				registration.setRegisterCapital(company.getRegister_capital());
				registration.setSocialInsurance(company.getSocial_insurance());
				registration.setRegisterGov(company.getRegister_gov());
				registration.setArtificialPerson(company.getArtificial_person());
				
				list.add(registration);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		return list;
	}

}
