package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 顾客是否发生逾期行为的记录
 * @author geekidentity
 * @date 2017年4月9日
 * @version 1.0
 *
 */
@Entity
@Table(name="overdue_train")
public class Overdue {
	@Id
	private Integer uId;
	private Integer overdue;
	
	public Overdue() {}
	public Overdue(Integer uId, Integer overdue) {
		this.uId = uId;
		this.overdue = overdue;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer getOverdue() {
		return overdue;
	}
	public void setOverdue(Integer overdue) {
		this.overdue = overdue;
	}
	
}
