package com.geekidentity.datacastle.venture.model;

import java.io.Serializable;

public class CompanyInvention implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5236211186078365575L;
	private String 融资金额;
	private String 投资方;
	private String 阶段;
	private String 融资时间;
	public String get融资金额() {
		return 融资金额;
	}
	public void set融资金额(String 融资金额) {
		this.融资金额 = 融资金额;
	}
	public String get投资方() {
		return 投资方;
	}
	public void set投资方(String 投资方) {
		this.投资方 = 投资方;
	}
	public String get阶段() {
		return 阶段;
	}
	public void set阶段(String 阶段) {
		this.阶段 = 阶段;
	}
	public String get融资时间() {
		return 融资时间;
	}
	public void set融资时间(String 融资时间) {
		this.融资时间 = 融资时间;
	}
}
