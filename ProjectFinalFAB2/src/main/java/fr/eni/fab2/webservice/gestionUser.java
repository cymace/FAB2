package fr.eni.fab2.webservice;

import java.io.IOException;
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

import fr.eni.fab2.bean.User;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.UserManager;
import fr.eni.fab2.exceptions.BLLException;

@Path("/users")
public class gestionUser {
			
		private UserManager userManager = BllManagerFactory.getUserManager();
		
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		public List<User> getusers(@Context final HttpServletResponse response)  {
			
			
			List<User> users=new ArrayList<>();		
			
			
			try {
				users = userManager.getAll();
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
			
			return users;
			
		}
		
		@GET
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public User getUser(@PathParam("id") int id, @Context final HttpServletResponse response)  {
			User user = null;
			
			try {
				user = userManager.getById(id);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return user;
			
		}	
		
		@GET
		@Path("/email={email}")
		@Consumes(MediaType.APPLICATION_JSON)
		public User getUser(@PathParam("email") String email, @Context final HttpServletResponse response)  {
			User user = null;
			
			try {
				user = userManager.getByEmail(email);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return user;
			
		}	
		

		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public User addUser(User user , @Context final HttpServletResponse response) {
			
			try {
				user= userManager.add(user);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			
			
			return user;
		}
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		public User updateUser(User userUpdate, @Context final HttpServletResponse response){
					
			
			try {
				userManager.update(userUpdate);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}

			
			
			return userUpdate;
			
			
		}
		
		@DELETE
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public User deleteUser(@PathParam("id") int id, @Context final HttpServletResponse response) {
			
			User user = null;
			try {
				user = userManager.getById(id);
				userManager.delete(user);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}
			
			
			
			return user;
		}
}
