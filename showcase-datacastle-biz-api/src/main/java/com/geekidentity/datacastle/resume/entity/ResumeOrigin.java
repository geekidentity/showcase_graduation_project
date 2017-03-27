package com.geekidentity.datacastle.resume.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.geekidentity.excel.CellStyle;

/**
 * 求职简历原始数据
 * @author geekidentity
 * @date 2017年2月26日
 * @version 1.0
 *
 */
@Entity()
public class ResumeOrigin {
	@Id
	@CellStyle(title="ID")
	private Integer id;
	@CellStyle(title="性别")
	private String gender;
	@CellStyle(title="年龄")
	private String age;
	@CellStyle(title="学位信息")
	private String degree;
	@CellStyle(title="专业信息")
	private String professional;
	@CellStyle(title="前一个工作单位行业")
	private String preUnitIndustry;
	@CellStyle(title="前一个单位所担职位")
	private String preUnitPosition;
	@CellStyle(title="意向职位")
	private String intentionPosition;
	@CellStyle(title="意向行业")
	private String intentionIndustry;
	@CellStyle(title="期望薪资")
	private String expectedSalary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public String getPreUnitIndustry() {
		return preUnitIndustry;
	}
	public void setPreUnitIndustry(String preUnitIndustry) {
		this.preUnitIndustry = preUnitIndustry;
	}
	public String getPreUnitPosition() {
		return preUnitPosition;
	}
	public void setPreUnitPosition(String preUnitPosition) {
		this.preUnitPosition = preUnitPosition;
	}
	public String getIntentionPosition() {
		return intentionPosition;
	}
	public void setIntentionPosition(String intentionPosition) {
		this.intentionPosition = intentionPosition;
	}
	public String getIntentionIndustry() {
		return intentionIndustry;
	}
	public void setIntentionIndustry(String intentionIndustry) {
		this.intentionIndustry = intentionIndustry;
	}
	public String getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	
}
