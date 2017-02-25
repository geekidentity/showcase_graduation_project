package com.geekidentity.excel.example;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;

import com.geekidentity.excel.Excel;

public class ExcelTest {
	private Excel<User> excel = null;
	@Test
	public void test() throws InvalidFormatException, InstantiationException, IOException {
		File file = new File("F:/创意赛/User.xlsx");
		excel = new Excel<>(User.class, file);
		List<User> list = excel.importFromXls(file);
		System.out.println(list);
	}
	
	
	public static void main(String[] args) {
		Date date = new Date((long) 42719.0);
		System.out.println(date);
	}
}
