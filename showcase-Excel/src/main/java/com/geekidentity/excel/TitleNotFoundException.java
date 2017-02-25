package com.geekidentity.excel;

@SuppressWarnings("serial")
public class TitleNotFoundException extends Exception {
	private String title;

	public TitleNotFoundException(String title) {
		this.title = title;
	}
	@Override
	public String getMessage() {
		return "title: " + title + "在excel中没有找到";
	}
}
