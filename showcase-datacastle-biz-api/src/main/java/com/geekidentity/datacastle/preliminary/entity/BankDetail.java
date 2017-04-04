package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_detail_train")
public class BankDetail {
	//银行流水记录ID
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	//用户id
	private Integer uId;
	//时间戳
	private Long time;
	//交易类型
	private Integer transactionType;
	//交易金额
	private Double transactionAmount;
	//工资收入标记
	private Integer isWage;
	
	public BankDetail() {
	}
	
	public BankDetail(Integer uId, Long time, Integer transactionType, Double transactionAmount,
			Integer isWage) {
		this.uId = uId;
		this.time = time;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
		this.isWage = isWage;
	}
	
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
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Integer getIsWage() {
		return isWage;
	}
	public void setIsWage(Integer isWage) {
		this.isWage = isWage;
	}
}
