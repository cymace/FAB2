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

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.RestaurantManager;
import fr.eni.fab2.exceptions.BLLException;

@Path("/restaurants")
public class GestionRestaurant {



	
	private RestaurantManager restaurantManager = BllManagerFactory.getRestaurantManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Restaurant> getrestaurants(@Context final HttpServletResponse response)  {
		
		
		List<Restaurant> restaurants=new ArrayList<>();		
		
		
		try {
			restaurants = restaurantManager.getAll();
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return restaurants;
		
	}
	
	@GET
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Restaurant getRestaurant(@PathParam("id") int id, @Context final HttpServletResponse response)  {
		Restaurant restaurant = null;
		
		try {
			restaurant = restaurantManager.getById(id);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		return restaurant;
		
	}	
	

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Restaurant addRestaurant(Restaurant restaurant , @Context final HttpServletResponse response) {
		
		try {
			restaurant= restaurantManager.add(restaurant);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		}
		
		
		
		return restaurant;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Restaurant updateRestaurant(Restaurant restaurantUpdate, @Context final HttpServletResponse response){
				
		
		try {
			restaurantManager.update(restaurantUpdate);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}

		
		
		return restaurantUpdate;
		
		
	}
	
	@DELETE
	@Path("/{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Restaurant deleteRestaurant(@PathParam("id") int id, @Context final HttpServletResponse response) {
		
		Restaurant restaurant = null;
		try {
			restaurant = restaurantManager.getById(id);
			restaurantManager.delete(restaurant);
		} catch (BLLException e) {
			System.out.println(e.getMessage());
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}		
		}
		
		
		
		return restaurant;
	}

}
