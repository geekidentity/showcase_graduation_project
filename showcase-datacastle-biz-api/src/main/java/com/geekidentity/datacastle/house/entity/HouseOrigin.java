package com.geekidentity.datacastle.house.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.geekidentity.excel.CellStyle;

/**
 * 
 * @author geekidentity
 * @date 2017年2月25日
 * @version 1.0
 *
 */
@Entity(name="houseOrigin")
public class HouseOrigin {
	@Id
	@CellStyle(title = "ID")
	private Integer id;
	@CellStyle(title = "名称")
	private String name;
	//参考均价
	@CellStyle(title = "参考均价")
	private String referencePrice;
	//建筑类别
	@CellStyle(title = "建筑类别")
	private String buildingCategory;
	//项目地址
	@CellStyle(title = "项目地址")
	private String projectAddress;
	//总户数（单位：户）
	@CellStyle(title = "总户数")
	private String totalHouses;
	//建筑面积（单位：平方米）
	@CellStyle(title = "建筑面积")
	private String constructionArea;
	//车位信息
	@CellStyle(title = "车位信息")
	private String parkingInfo;
	//绿化率
	@CellStyle(title = "绿化率")
	private String greenRate;
	//容积率
	@CellStyle(title = "容积率")
	private String volumeRate;
	//开放商
	@CellStyle(title = "开放商")
	private String openBusinessman;
	//物业公司
	@CellStyle(title = "物业公司")
	private String propertyCompany;
	//物业类型
	@CellStyle(title = "物业类型")
	private String propertyType;
	//装修情况
	@CellStyle(title = "装修情况")
	private String decorationSituation;
	//户型区间
	@CellStyle(title = "户型区间")
	private String unitRange;
	//物业费
	@CellStyle(title = "物业费")
	private String propertyCosts;
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
	public String getTotalHouses() {
		return totalHouses;
	}
	public void setTotalHouses(String totalHouses) {
		this.totalHouses = totalHouses;
	}
	public String getConstructionArea() {
		return constructionArea;
	}
	public void setConstructionArea(String constructionArea) {
		this.constructionArea = constructionArea;
	}
	public String getParkingInfo() {
		return parkingInfo;
	}
	public void setParkingInfo(String parkingInfo) {
		this.parkingInfo = parkingInfo;
	}
	public String getGreenRate() {
		return greenRate;
	}
	public void setGreenRate(String greenRate) {
		this.greenRate = greenRate;
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
	public String getVolumeRate() {
		return volumeRate;
	}
	public void setVolumeRate(String volumeRate) {
		this.volumeRate = volumeRate;
	}
	public String getPropertyCosts() {
		return propertyCosts;
	}
	public void setPropertyCosts(String propertyCosts) {
		this.propertyCosts = propertyCosts;
	}
	
}
