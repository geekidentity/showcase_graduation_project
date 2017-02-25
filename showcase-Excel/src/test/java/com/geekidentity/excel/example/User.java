package com.geekidentity.excel.example;

import java.util.Date;

import com.geekidentity.excel.CellStyle;

public class User {
	@CellStyle(title = "ID")
	private Integer id;
	@CellStyle(title="姓名")
	private String name;
	@CellStyle(title="创建时间")
	private Date createTime;
	@CellStyle(title="number")
	private Double number;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Double getNumber() {
		return number;
	}
	public void setNumber(Double number) {
		this.number = number;
	}
	
}
