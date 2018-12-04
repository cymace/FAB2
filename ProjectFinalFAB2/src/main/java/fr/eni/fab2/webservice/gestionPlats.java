package fr.eni.fab2.webservice;

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

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.PlateManager;
import fr.eni.fab2.exceptions.BLLException;

@Path("/plats")
public class gestionPlats {
	
	private PlateManager plateManager = BllManagerFactory.getPlateManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Plate> getplats(@Context final HttpServletResponse response)  {
		
		
		List<Plate> plates=new ArrayList<>();		
		
		
		try {
			plates = plateManager.getAll();
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		
		return plates;
		
	}
	
	@GET
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate getplat(@PathParam("id") int id, @Context final HttpServletResponse response)  {
		Plate plate = null;
		
		try {
			plate = plateManager.getById(id);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		
		return plate;
		
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate addplate(Plate plate , @Context final HttpServletResponse response) {
		
		try {
			plate= plateManager.add(plate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		
		
		
		return plate;
	}
	
	@PUT
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Plate updatePlate(@PathParam("id") int id , Plate plateUpdate, @Context final HttpServletResponse response){
		plateUpdate.setId(id);
		
		
		try {
			plateManager.update(plateUpdate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		
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
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		
		}
		
		
		
		return plate;
	}

}
