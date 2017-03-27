package com.geekidentity.datacastle.preliminary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekidentity.datacastle.preliminary.entity.UserInfo;
import com.geekidentity.datacastle.preliminary.service.UserInfoService;

@RestController
@RequestMapping(value="/datacastle")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping(value="/user_info/{id}")
	public UserInfo getUnique(@PathVariable Integer id) {
		return userInfoService.get(id);
	}
	
	@DeleteMapping(value="/user_info")
	public String delete() {
		return "delete";
	}
}
