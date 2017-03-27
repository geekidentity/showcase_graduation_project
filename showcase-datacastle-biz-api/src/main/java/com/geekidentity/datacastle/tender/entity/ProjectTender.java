package com.geekidentity.datacastle.tender.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectTender {
	@Id
	private Integer id;
	private Date releaseDate;
	private String title;
	private String type;
	private String region;
	private String biddingCompany;
	private String agentCompany;
	private String tenderCompany;
	private String biddingNumber;
	private String money;
	private String sourceUrl;
	@Column(columnDefinition="LONGTEXT")
	private String biddingContent;
	private Integer oldId;
	
	public ProjectTender() {}
	
	public ProjectTender(Integer id, Date releaseDate, String title, String type, String region, String biddingCompany,
			String agentCompany, String tenderCompany, String biddingNumber, String money, String sourceUrl,
			String biddingContent, Integer oldId) {
		super();
		this.id = id;
		this.releaseDate = releaseDate;
		this.title = title;
		this.type = type;
		this.region = region;
		this.biddingCompany = biddingCompany;
		this.agentCompany = agentCompany;
		this.tenderCompany = tenderCompany;
		this.biddingNumber = biddingNumber;
		this.money = money;
		this.sourceUrl = sourceUrl;
		this.biddingContent = biddingContent;
		this.oldId = oldId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBiddingCompany() {
		return biddingCompany;
	}
	public void setBiddingCompany(String biddingCompany) {
		this.biddingCompany = biddingCompany;
	}
	public String getAgentCompany() {
		return agentCompany;
	}
	public void setAgentCompany(String agentCompany) {
		this.agentCompany = agentCompany;
	}
	public String getTenderCompany() {
		return tenderCompany;
	}
	public void setTenderCompany(String tenderCompany) {
		this.tenderCompany = tenderCompany;
	}
	public String getBiddingNumber() {
		return biddingNumber;
	}
	public void setBiddingNumber(String biddingNumber) {
		this.biddingNumber = biddingNumber;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getBiddingContent() {
		return biddingContent;
	}
	public void setBiddingContent(String biddingContent) {
		this.biddingContent = biddingContent;
	}
	public Integer getOldId() {
		return oldId;
	}
	public void setOldId(Integer oldId) {
		this.oldId = oldId;
	}
}
