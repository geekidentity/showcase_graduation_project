package com.geekidentity.datacastle.house.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author geekidentity
 * @date 2017年2月25日
 * @version 1.0
 *
 */
@Entity(name="house")
public class HouseOrigin {
	@Id
	private Integer id;
	private String name;
	//参考均价
	private String referencePrice;
	//建筑类别
	private String buildingCategory;
	//项目地址
	private String projectAddress;
	//总户数（单位：户）
	private Integer totalHouses;
	//建筑面积（单位：平方米）
	private Integer constructionArea;
	//车位信息
	private Double greenRate;
	//容积率
	private Double volumeRate;
	//开放商
	private String openBusinessman;
	//物业公司
	private String propertyCompany;
	//物业类型
	private String propertyType;
	//装修情况
	private String decorationSituation;
	//户型区间
	private String unitRange;
	//物业费
	private Double propertyCosts;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}
	public String getBuildingCategory() {
		return buildingCategory;
	}
	public void setBuildingCategory(String buildingCategory) {
		this.buildingCategory = buildingCategory;
	}
	public String getProjectAddress() {
		return projectAddress;
	}
	public void setProjectAddress(String projectAddress) {
		this.projectAddress = projectAddress;
	}
	public Integer getTotalHouses() {
		return totalHouses;
	}
	public void setTotalHouses(Integer totalHouses) {
		this.totalHouses = totalHouses;
	}
	public Integer getConstructionArea() {
		return constructionArea;
	}
	public void setConstructionArea(Integer constructionArea) {
		this.constructionArea = constructionArea;
	}
	public Double getGreenRate() {
		return greenRate;
	}
	public void setGreenRate(Double greenRate) {
		this.greenRate = greenRate;
	}
	public Double getVolumeRate() {
		return volumeRate;
	}
	public void setVolumeRate(Double volumeRate) {
		this.volumeRate = volumeRate;
	}
	public String getOpenBusinessman() {
		return openBusinessman;
	}
	public void setOpenBusinessman(String openBusinessman) {
		this.openBusinessman = openBusinessman;
	}
	public String getPropertyCompany() {
		return propertyCompany;
	}
	public void setPropertyCompany(String propertyCompany) {
		this.propertyCompany = propertyCompany;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getDecorationSituation() {
		return decorationSituation;
	}
	public void setDecorationSituation(String decorationSituation) {
		this.decorationSituation = decorationSituation;
	}
	public String getUnitRange() {
		return unitRange;
	}
	public void setUnitRange(String unitRange) {
		this.unitRange = unitRange;
	}
	public Double getPropertyCosts() {
		return propertyCosts;
	}
	public void setPropertyCosts(Double propertyCosts) {
		this.propertyCosts = propertyCosts;
	}
	
}
