package com.cisco.blogger.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cisco.blogger.api.Blog;
import com.cisco.blogger.api.BlogCreateException;
import com.cisco.blogger.api.BlogException;
import com.cisco.blogger.service.BlogService;
import com.cisco.blogger.service.BlogServiceImpl;

@Path("/blog")
public class BlogOperationsRootResource {
	
	BlogService blogService = new BlogServiceImpl();
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response add(Blog blog) {
		try {
		int blogId = blogService.createBlog(blog);
		
		return Response.ok().entity(blog).header("location", "/blog/view/" + blogId).build();

		} catch(BlogCreateException bce) {
			return Response.status(400).build();
		} catch(BlogException be) {
			return Response.status(500).build();
		}
		
	}
	
	@GET
	@Path("/view/{blogId}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getBlogById(@PathParam("blogId") int blogId) {
		try {
		Blog blog = blogService.viewBlog(blogId);
		
		return Response.ok().entity(blog).build();

		} catch(BlogCreateException bce) {
			return Response.status(400).build();
		} catch(BlogException be) {
			return Response.status(500).build();
		}
		
	}

}
