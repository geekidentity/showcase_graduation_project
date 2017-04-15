package com.geekidentity.datacastle.preliminary.entity;

/**
 * 每天放贷数量模型
 * @author geekidentity
 * @date 2017年4月15日
 * @version 1.0
 *
 */
public class LoanTimeDailyModel {
	private Long loanTime;
	private Integer quantity;
	public Long getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(Long loanTime) {
		this.loanTime = loanTime;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
