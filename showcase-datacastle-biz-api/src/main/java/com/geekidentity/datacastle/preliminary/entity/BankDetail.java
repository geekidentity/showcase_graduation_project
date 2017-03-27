package com.geekidentity.datacastle.preliminary.entity;

public class BankDetail {
	private Integer id;
	private Integer uId;
	private Long time;
	private Integer transactionType;
	private Integer transactionAmount;
	private Integer isWage;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Integer getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}
	public Integer getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Integer getIsWage() {
		return isWage;
	}
	public void setIsWage(Integer isWage) {
		this.isWage = isWage;
	}
}
