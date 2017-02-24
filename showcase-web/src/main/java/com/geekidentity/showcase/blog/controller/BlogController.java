package com.geekidentity.showcase.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekidentity.showcase.blog.entity.Blog;
import com.geekidentity.showcase.blog.service.BlogService;

@RestController
@RequestMapping(value="blog/")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	@RequestMapping(value="{id}")
	public Blog getUnique(@PathVariable Integer id) {
		return blogService.getUnique(id);
	}
}
