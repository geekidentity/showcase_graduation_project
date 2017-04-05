package com.geekidentity.datacastle.preliminary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户浏览行为
 * @author geekidentity
 * @date 2017年4月4日
 * @version 1.0
 *
 */
@Entity
@Table(name="browse_history_train")
public class BrowseHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer uId;
	private Long time;
	private Integer behavior;
	private Integer subBehavior;

	public BrowseHistory() {}
	public BrowseHistory(Integer uId, Long time, Integer behavior, Integer subBehavior) {
		this.uId = uId;
		this.time = time;
		this.behavior = behavior;
		this.subBehavior = subBehavior;
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
	public Integer getBehavior() {
		return behavior;
	}
	public void setBehavior(Integer behavior) {
		this.behavior = behavior;
	}
	public Integer getSubBehavior() {
		return subBehavior;
	}
	public void setSubBehavior(Integer subBehavior) {
		this.subBehavior = subBehavior;
	}
}
