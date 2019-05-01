/*package com.sivalabs.mybatisdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class BlogService
{
 @Autowired
 private BlogMapper blogMapper; // This is to demonstratee how to inject Mappers directly
  
 public void insertBlog(Blog blog) {
  blogMapper.insertBlog(blog);
 }
  
 public Blog getBlogById(Integer blogId) {
  return blogMapper.getBlogById(blogId);
 }
  
 public List<Blog> getAllBlogs() {
  return blogMapper.getAllBlogs();
 }
}
*/