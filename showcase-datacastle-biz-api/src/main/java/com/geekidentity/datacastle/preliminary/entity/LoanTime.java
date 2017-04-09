package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 放款时间信息
 * @author geekidentity
 * @date 2017年4月9日
 * @version 1.0
 *
 */
@Entity
@Table(name="loan_time_train")
public class LoanTime {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer uId;
	private Long loanTime;
	
	public LoanTime() {}
	public LoanTime(Integer uId, Long loanTime) {
		this.uId = uId;
		this.loanTime = loanTime;
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
	public Long getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(Long loanTime) {
		this.loanTime = loanTime;
	}
}
