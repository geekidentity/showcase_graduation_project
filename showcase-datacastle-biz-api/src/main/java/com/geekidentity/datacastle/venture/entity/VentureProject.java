package com.geekidentity.datacastle.venture.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.geekidentity.datacastle.venture.model.CompanyInvention;

@Entity
public class VentureProject {
	
	@Id
	private String id;
	private Integer sichuanSichuang;
	@Column(columnDefinition="BLOB")
	private String[] companyProgress;
	private String companyType;
	private Date createTime;
	private BigDecimal financeValue;
	@Column(columnDefinition="BLOB")
	private String[] stockholder;
	@Column(columnDefinition="BLOB")
	private String[] keywords;
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
	private BigDecimal companyMoney;
	private String companyPerson;
	private String industry;
	private Date companyStart;
	private String companyState;
	private String companyAddress;
	private String sourceId;
	private Integer companyInventionCount;
	@Column(columnDefinition="BLOB")
	private CompanyInvention[] companyInvention;
	
	public CompanyInvention[] getCompanyInvention() {
		return companyInvention;
	}
	public void setCompanyInvention(CompanyInvention[] companyInvention) {
		this.companyInvention = companyInvention;
	}
	public Integer getCompanyInventionCount() {
		return companyInventionCount;
	}
	public void setCompanyInventionCount(Integer companyInventionCount) {
		this.companyInventionCount = companyInventionCount;
	}
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public BigDecimal getFinanceValue() {
		return financeValue;
	}
	public void setFinanceValue(BigDecimal financeValue) {
		this.financeValue = financeValue;
	}
	
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String[] getCompanyProgress() {
		return companyProgress;
	}
	public void setCompanyProgress(String[] companyProgress) {
		this.companyProgress = companyProgress;
	}
	public String[] getStockholder() {
		return stockholder;
	}
	public void setStockholder(String[] stockholder) {
		this.stockholder = stockholder;
	}
	public String[] getKeywords() {
		return keywords;
	}
	public void setKeywords(String[] keywords) {
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
	public BigDecimal getCompanyMoney() {
		return companyMoney;
	}
	public void setCompanyMoney(BigDecimal companyMoney) {
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
