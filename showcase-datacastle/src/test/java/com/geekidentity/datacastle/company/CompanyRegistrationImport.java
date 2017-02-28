package com.geekidentity.datacastle.company;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekidentity.datacastle.company.model.CompanyRegistrationOrigin;

public class CompanyRegistrationImport {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JsonFactory factory = new JsonFactory();
		File file = new File("F:/智慧中国杯/公司注册.json");
		ObjectMapper mapper = new ObjectMapper();
		JsonParser jsonParser = factory.createParser(file);
		MappingIterator<CompanyRegistrationOrigin> companys = mapper.readValues(jsonParser, CompanyRegistrationOrigin.class);
		
		int invalid = 0;
		while (companys.hasNext()) {
			try {
				CompanyRegistrationOrigin company = (CompanyRegistrationOrigin) companys.next();
				//System.out.println(company.getCity());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				invalid ++;
				e.printStackTrace();
			}
		}
		
		System.out.println("invalied number: " + invalid);
	}
}
