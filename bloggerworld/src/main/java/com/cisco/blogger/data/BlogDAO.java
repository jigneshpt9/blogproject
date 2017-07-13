package com.cisco.blogger.data;

import java.util.List;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;

public interface BlogDAO {
	
	public int createBlog(Blog blog);
	
	public Blog updateBlog(Blog blog);
	
	public List<Blog> searchBlogs(String keyword);
	
	public Blog viewBlog(int blogId);
	
	public List<Blog> listAllBlogs();
	
	public void addComment(int blogId,Comment comment);
	
	public int upvoteComment(int commentId);
	
	public int undoLikeComment(int commentId);
	
	

}
