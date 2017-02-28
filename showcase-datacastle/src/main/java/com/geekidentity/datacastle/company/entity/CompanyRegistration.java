package com.geekidentity.datacastle.company.entity;

import java.util.Date;

import javax.persistence.Entity;

import com.geekidentity.datacastle.company.model.Id;

@Entity
public class CompanyRegistration {
	private Id id;
	private String province;
	private String city;
	private String license;
	private String name;
	private String orgCode;
	private String housingFund;
	private Date acceptDate;
	private String businessScope;
	private String companyType;
	private Date registerDate;
	private String phone;
	private String companyState;
	private String keywords;
	private String sizhongTag;
	private String companyAddress;
	private String details;
	private String registerCapital;
	private String socialInsurance;
	private String registerGov;
	private String artificialPerson;
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getHousingFund() {
		return housingFund;
	}
	public void setHousingFund(String housingFund) {
		this.housingFund = housingFund;
	}
	public Date getAcceptDate() {
		return acceptDate;
	}
	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}
	public String getBusinessScope() {
		return businessScope;
	}
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getSizhongTag() {
		return sizhongTag;
	}
	public void setSizhongTag(String sizhongTag) {
		this.sizhongTag = sizhongTag;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getRegisterCapital() {
		return registerCapital;
	}
	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}
	public String getSocialInsurance() {
		return socialInsurance;
	}
	public void setSocialInsurance(String socialInsurance) {
		this.socialInsurance = socialInsurance;
	}
	public String getRegisterGov() {
		return registerGov;
	}
	public void setRegisterGov(String registerGov) {
		this.registerGov = registerGov;
	}
	public String getArtificialPerson() {
		return artificialPerson;
	}
	public void setArtificialPerson(String artificialPerson) {
		this.artificialPerson = artificialPerson;
	}
	
}
