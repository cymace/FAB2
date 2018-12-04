package fr.eni.fab2.webservice;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.CommentManager;
import fr.eni.fab2.exceptions.BLLException;


@Path("/comments")
public class gestionComment {

	
	
	private CommentManager commentManager = BllManagerFactory.getCommentManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Comment> getComments(@Context final HttpServletResponse response)  {
		
		
		List<Comment> comments=new ArrayList<>();		
		
		
		try {
			comments = commentManager.getAll();
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		return comments;
		
	}
	
	@GET
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment getComment(@PathParam("id") int id, @Context final HttpServletResponse response)  {
		Comment comment = null;
		
		try {
			comment = commentManager.getById(id);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		return comment;
		
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment addComment(Comment comment , @Context final HttpServletResponse response) {
		
		comment.setDateComment(LocalDateTime.now().withNano(0));
		try {
			comment= commentManager.add(comment);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		
		
		return comment;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment updateComment(Comment commentUpdate, @Context final HttpServletResponse response){
		
		commentUpdate.setDateComment(LocalDateTime.now().withNano(0));
		try {
			commentManager.update(commentUpdate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}

		
		
		return commentUpdate;
		
		
	}
	
	@DELETE
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment deleteComment(@PathParam("id") int id, @Context final HttpServletResponse response) {
		
		Comment comment = null;
		try {
			comment = commentManager.getById(id);
			commentManager.delete(comment);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}			
		
		return comment;
	}

}
