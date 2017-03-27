package com.geekidentity.datacastle.test;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geekidentity.datacastle.venture.entity.VentureProject;

public class Tests {
	public static void main(String[] args) {
		File file = new File("f:/智慧中国杯/微博签到.json");
		JsonFactory factory = new JsonFactory();
		ObjectMapper mapper = new ObjectMapper();
		Iterator<TreeMap> iterator;
		List<VentureProject> projects = new LinkedList<>();
		try {
			JsonParser jsonParser = factory.createParser(file);
			JsonParser mapParser = factory.createParser(file);
			TreeNode node = mapper.readTree(jsonParser);
			System.out.println(node.get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
