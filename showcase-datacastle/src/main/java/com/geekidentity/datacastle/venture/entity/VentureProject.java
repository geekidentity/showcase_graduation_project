package com.geekidentity.datacastle.venture.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VentureProject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ids;
	private String id;
	private Integer sichuanSichuang;
	private String companyProgresses;
	private String companyType;
	private Date createTime;
	private Integer financeValue;
	private String stockholders;
	private String keywords;
	private String registrationCode;
	private String source;
	private String companyName;
	private String companySite;
	private String financeStage;
	private String projectName;
	private String sourceUrl;
	private String distinctId;
	private Date crawlTime;
	private String address;
	private Integer companyMoney;
	private String companyPerson;
	private String industry;
	private Date companyStart;
	private String companyState;
	private String financingAmount;
	private String investor;
	private String stage;
	private String financingTime;
	private String companyAddress;
	private String sourceId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSichuanSichuang() {
		return sichuanSichuang;
	}
	public void setSichuanSichuang(Integer sichuanSichuang) {
		this.sichuanSichuang = sichuanSichuang;
	}
	
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getFinanceValue() {
		return financeValue;
	}
	public void setFinanceValue(Integer financeValue) {
		this.financeValue = financeValue;
	}

	public String getCompanyProgresses() {
		return companyProgresses;
	}
	public void setCompanyProgresses(String companyProgresses) {
		this.companyProgresses = companyProgresses;
	}
	public String getStockholders() {
		return stockholders;
	}
	public void setStockholders(String stockholders) {
		this.stockholders = stockholders;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getRegistrationCode() {
		return registrationCode;
	}
	public void setRegistrationCode(String registrationCode) {
		this.registrationCode = registrationCode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanySite() {
		return companySite;
	}
	public void setCompanySite(String companySite) {
		this.companySite = companySite;
	}
	public String getFinanceStage() {
		return financeStage;
	}
	public void setFinanceStage(String financeStage) {
		this.financeStage = financeStage;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getDistinctId() {
		return distinctId;
	}
	public void setDistinctId(String distinctId) {
		this.distinctId = distinctId;
	}
	public Date getCrawlTime() {
		return crawlTime;
	}
	public void setCrawlTime(Date crawlTime) {
		this.crawlTime = crawlTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCompanyMoney() {
		return companyMoney;
	}
	public void setCompanyMoney(Integer companyMoney) {
		this.companyMoney = companyMoney;
	}
	public String getCompanyPerson() {
		return companyPerson;
	}
	public void setCompanyPerson(String companyPerson) {
		this.companyPerson = companyPerson;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public Date getCompanyStart() {
		return companyStart;
	}
	public void setCompanyStart(Date companyStart) {
		this.companyStart = companyStart;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	
	public String getFinancingAmount() {
		return financingAmount;
	}
	public void setFinancingAmount(String financingAmount) {
		this.financingAmount = financingAmount;
	}
	public String getInvestor() {
		return investor;
	}
	public void setInvestor(String investor) {
		this.investor = investor;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getFinancingTime() {
		return financingTime;
	}
	public void setFinancingTime(String financingTime) {
		this.financingTime = financingTime;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	
}
