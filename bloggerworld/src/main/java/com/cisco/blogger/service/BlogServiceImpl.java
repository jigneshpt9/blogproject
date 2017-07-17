package com.cisco.blogger.service;

import java.util.List;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;
import com.cisco.blogger.data.BlogDAO;
import com.cisco.blogger.data.BlogDAOImpl;

public class BlogServiceImpl implements BlogService {

	BlogDAO blogDAO = new BlogDAOImpl();
	
	public int createBlog(Blog blog) {
		
		int blogId = blogDAO.createBlog(blog);
		
		return blogId;
		
	}

	public Blog updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> searchBlogs(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	public Blog viewBlog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> listAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addComment(int blogId, Comment comment) {
		// TODO Auto-generated method stub
		
	}

	public int upvoteComment(int commentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int undoLikeComment(int commentId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
