package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 信用卡账单记录
 * @author geekidentity
 * @date 2017年4月4日
 * @version 1.0
 *
 */
@Entity
@Table(name="bill_detail_train")
public class BillDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	//用户ID
	private Integer uId;
	//账单时间戳
	private Long time;
	//银行ID
	private Integer bankId;
	//上期账单金额
	private Double previousBillAmount;
	//上期还款金额
	private Double previousRepaymentAmount;
	//信用卡额度
	private Double creditCardLimit;
	//本期账单余额
	private Double currentBillBalance;
	//本期账单最低还款额
	private Double currentBillMinimumRepaymentAmount;
	//消费笔数
	private Integer consumptionNumber;
	//本期账单金额
	private Double currentBillAmount;
	//调整金额
	private Double adjustAmount;
	//循环利息
	private Double cycleInterest;
	//可用余额
	private Double availableBalance;
	//预借现金额度
	private Double prepaidCashAmount;
	//还款状态
	private Integer repaymentStatus;
	
	public BillDetail() {}
	
	public BillDetail(Integer uId, Long time, Integer bankId, Double previousBillAmount, Double previousRepaymentAmount,
			Double creditCardLimit, Double currentBillBalance, Double currentBillMinimumRepaymentAmount,
			Integer consumptionNumber, Double currentBillAmount, Double adjustAmount, Double cycleInterest,
			Double availableBalance, Double prepaidCashAmount, Integer repaymentStatus) {
		this.uId = uId;
		this.time = time;
		this.bankId = bankId;
		this.previousBillAmount = previousBillAmount;
		this.previousRepaymentAmount = previousRepaymentAmount;
		this.creditCardLimit = creditCardLimit;
		this.currentBillBalance = currentBillBalance;
		this.currentBillMinimumRepaymentAmount = currentBillMinimumRepaymentAmount;
		this.consumptionNumber = consumptionNumber;
		this.currentBillAmount = currentBillAmount;
		this.adjustAmount = adjustAmount;
		this.cycleInterest = cycleInterest;
		this.availableBalance = availableBalance;
		this.prepaidCashAmount = prepaidCashAmount;
		this.repaymentStatus = repaymentStatus;
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
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public Double getPreviousBillAmount() {
		return previousBillAmount;
	}
	public void setPreviousBillAmount(Double previousBillAmount) {
		this.previousBillAmount = previousBillAmount;
	}
	public Double getPreviousRepaymentAmount() {
		return previousRepaymentAmount;
	}
	public void setPreviousRepaymentAmount(Double previousRepaymentAmount) {
		this.previousRepaymentAmount = previousRepaymentAmount;
	}
	public Double getCreditCardLimit() {
		return creditCardLimit;
	}
	public void setCreditCardLimit(Double creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}
	public Double getCurrentBillBalance() {
		return currentBillBalance;
	}
	public void setCurrentBillBalance(Double currentBillBalance) {
		this.currentBillBalance = currentBillBalance;
	}
	public Double getCurrentBillMinimumRepaymentAmount() {
		return currentBillMinimumRepaymentAmount;
	}
	public void setCurrentBillMinimumRepaymentAmount(Double currentBillMinimumRepaymentAmount) {
		this.currentBillMinimumRepaymentAmount = currentBillMinimumRepaymentAmount;
	}
	public Integer getConsumptionNumber() {
		return consumptionNumber;
	}
	public void setConsumptionNumber(Integer consumptionNumber) {
		this.consumptionNumber = consumptionNumber;
	}
	public Double getCurrentBillAmount() {
		return currentBillAmount;
	}
	public void setCurrentBillAmount(Double currentBillAmount) {
		this.currentBillAmount = currentBillAmount;
	}
	public Double getAdjustAmount() {
		return adjustAmount;
	}
	public void setAdjustAmount(Double adjustAmount) {
		this.adjustAmount = adjustAmount;
	}
	public Double getCycleInterest() {
		return cycleInterest;
	}
	public void setCycleInterest(Double cycleInterest) {
		this.cycleInterest = cycleInterest;
	}
	public Double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public Double getPrepaidCashAmount() {
		return prepaidCashAmount;
	}
	public void setPrepaidCashAmount(Double prepaidCashAmount) {
		this.prepaidCashAmount = prepaidCashAmount;
	}
	public Integer getRepaymentStatus() {
		return repaymentStatus;
	}
	public void setRepaymentStatus(Integer repaymentStatus) {
		this.repaymentStatus = repaymentStatus;
	}
	
}
