package com.geekidentity.datacastle.preliminary.model;

/**
 * 逾期率模型
 * 
 * @author geekidentity
 * @date 2017年4月16日
 * @version 1.0
 *
 */
public class OverdueRateModel {
	private Long loanTime;
	private Double overdueRate;

	public OverdueRateModel() {}

	public OverdueRateModel(Long loanTime, Double overdueRate) {
		this.loanTime = loanTime;
		this.overdueRate = overdueRate;
	}

	public Long getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(Long loanTime) {
		this.loanTime = loanTime;
	}

	public Double getOverdueRate() {
		return overdueRate;
	}

	public void setOverdueRate(Double overdueRate) {
		this.overdueRate = overdueRate;
	}

}
