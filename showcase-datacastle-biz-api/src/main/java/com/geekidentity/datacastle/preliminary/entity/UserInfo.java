package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user_info_train")
public class UserInfo {

	//用户id
	@Id
	private Integer id;
	//性别
	private Integer gender;
	//职业
	private Integer occupation;
	//教育程度
	private Integer education;
	//婚姻状态
	private Integer maritalStatus;
	//户口类型
	private Integer accountType;
	
	public UserInfo() {}
	
	public UserInfo(Integer id, Integer gender, Integer occupation, Integer education, Integer maritalStatus,
			Integer accountType) {
		this.id = id;
		this.gender = gender;
		this.occupation = occupation;
		this.education = education;
		this.maritalStatus = maritalStatus;
		this.accountType = accountType;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getOccupation() {
		return occupation;
	}
	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public Integer getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Integer getAccountType() {
		return accountType;
	}
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	
}
