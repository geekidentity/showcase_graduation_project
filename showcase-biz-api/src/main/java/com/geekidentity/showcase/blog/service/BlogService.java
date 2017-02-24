package com.geekidentity.showcase.blog.service;

import com.geekidentity.showcase.blog.entity.Blog;

/**
 * Blog接口
 * @author geekidentity
 * @since 0.0.1
 * @version 0.0.1
 */
public interface BlogService {

	Blog getUnique(Integer id);
	
	
}
