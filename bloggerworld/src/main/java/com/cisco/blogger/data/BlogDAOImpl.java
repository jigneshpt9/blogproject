package com.cisco.blogger.data;

import java.util.List;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;

public class BlogDAOImpl implements BlogDAO {

	public int createBlog(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
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
