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

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.PlateManager;
import fr.eni.fab2.exceptions.BLLException;

@Path("/plates")
public class GestionPlats {
	
	
	
	private PlateManager plateManager = BllManagerFactory.getPlateManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Plate> getplates(@Context final HttpServletResponse response)  {
		
		
		List<Plate> plates=new ArrayList<>();		
		
		
		try {
			plates = plateManager.getAll();
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return plates;
		
	}
	
	@GET
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate getPlate(@PathParam("id") int id, @Context final HttpServletResponse response)  {
		Plate plate = null;
		
		try {
			plate = plateManager.getById(id);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		return plate;
		
	}
	
	@GET
	@Path("/restaurant={id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Plate> getPlatesByRestaurant(@PathParam("id") int id, @Context final HttpServletResponse response)  {
		List<Plate> plates = new ArrayList<>();
		
		try {
			
			plates = plateManager.getByRestaurant(BllManagerFactory.getRestaurantManager().getById(id));
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return plates;
		
	}
	
	
	

	
	@POST
	@Path("/restaurant={id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate addPlate(@PathParam("id") int idRestaurant, Plate plate , @Context final HttpServletResponse response) {
		if(plate==null){
			plate =new Plate();
		}
		try {
						
			plate= plateManager.add(plate , idRestaurant);
			
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
			}
		
		
		
		return plate;
	}
	/*
	@POST
	@Path("/addComments/plateId={idPlate:\\d+}&userId={idUser:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Comment addComment(@PathParam("idPlate") int idPlate,@PathParam("idUser") int idUser, Comment comment , @Context final HttpServletResponse response)  {
	
		
		try {
			
			Plate plate=plateManager.getById(idPlate);
			List<Comment> comments;
			if(plate.getComments()==null){
				comments= new ArrayList<>();
			}else{
			 comments = plate.getComments();
			}
			comments.add(BllManagerFactory.getCommentManager().add(comment,idUser));
			plate.setComments(comments);
			plateManager.update(plate);

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
	*/
	
	@PUT
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate updatePlate(@PathParam("id") int id,Plate plateUpdate, @Context final HttpServletResponse response){
			plateUpdate.setId(id);	
		
		try {
			plateManager.update(plateUpdate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}

		
		
		return plateUpdate;
		
		
	}
	
	@DELETE
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate deletePlate(@PathParam("id") int id, @Context final HttpServletResponse response) {
		
		Plate plate = null;
		try {
			plate = plateManager.getById(id);
			plateManager.delete(plate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}
			
		
		return plate;
	}

}
