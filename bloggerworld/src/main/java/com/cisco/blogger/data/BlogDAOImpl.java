package com.cisco.blogger.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.Comment;

public class BlogDAOImpl implements BlogDAO {

	static EntityManager em;

	public BlogDAOImpl() {

		if (null == em) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("blogger");
			em = factory.createEntityManager();
		}

	}

	public int createBlog(Blog blog) {
		
		em.getTransaction().begin();
		em.persist(blog);
		em.getTransaction().commit();
		System.out.println("BlogAdded-"+blog.getBlogId());
		
		return blog.getBlogId();
		
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
