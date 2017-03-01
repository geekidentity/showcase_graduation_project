package com.geekidentity.datacastle.company.service;

import java.io.File;
import java.util.List;

import com.geekidentity.datacastle.company.entity.CompanyRegistration;

public interface CompanyRegistrationOriginService {
	
	List<CompanyRegistration> parseOriginData(File file);
}
