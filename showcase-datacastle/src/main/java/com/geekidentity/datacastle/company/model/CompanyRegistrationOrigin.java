package com.geekidentity.datacastle.company.model;

import javax.persistence.Entity;

@Entity
public class CompanyRegistrationOrigin {
	private Id _id;
	private String province;
	private String city;
	private String license;
	private String name;
	private String org_code;
	private String housing_fund;
	private AcceptDate accept_date;
	private String business_scope;
	private String company_type;
	private RegisterDate register_date;
	private String phone;
	private String company_state;
	private String[] keyword;
	private String sizhong_tag;
	private String company_address;
	private String details;
	private String register_capital;
	private String social_insurance;
	private String register_gov;
	private String artificial_person;
	public Id get_id() {
		return _id;
	}
	public void set_id(Id _id) {
		this._id = _id;
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
	public String getOrg_code() {
		return org_code;
	}
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	public String getHousing_fund() {
		return housing_fund;
	}
	public void setHousing_fund(String housing_fund) {
		this.housing_fund = housing_fund;
	}
	public AcceptDate getAccept_date() {
		return accept_date;
	}
	public void setAccept_date(AcceptDate accept_date) {
		this.accept_date = accept_date;
	}
	public String getBusiness_scope() {
		return business_scope;
	}
	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}
	
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	
	public RegisterDate getRegister_date() {
		return register_date;
	}
	public void setRegister_date(RegisterDate register_date) {
		this.register_date = register_date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCompany_state() {
		return company_state;
	}
	public void setCompany_state(String company_state) {
		this.company_state = company_state;
	}
	public String[] getKeyword() {
		return keyword;
	}
	public void setKeyword(String[] keyword) {
		this.keyword = keyword;
	}
	public String getSizhong_tag() {
		return sizhong_tag;
	}
	public void setSizhong_tag(String sizhong_tag) {
		this.sizhong_tag = sizhong_tag;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getRegister_capital() {
		return register_capital;
	}
	public void setRegister_capital(String register_capital) {
		this.register_capital = register_capital;
	}
	public String getSocial_insurance() {
		return social_insurance;
	}
	public void setSocial_insurance(String social_insurance) {
		this.social_insurance = social_insurance;
	}
	public String getRegister_gov() {
		return register_gov;
	}
	public void setRegister_gov(String register_gov) {
		this.register_gov = register_gov;
	}
	public String getArtificial_person() {
		return artificial_person;
	}
	public void setArtificial_person(String artificial_person) {
		this.artificial_person = artificial_person;
	}
	
}
