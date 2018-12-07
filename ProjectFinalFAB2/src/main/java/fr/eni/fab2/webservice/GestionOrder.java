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

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.OrderManager;
import fr.eni.fab2.exceptions.BLLException;


@Path("/orders")
public class GestionOrder {	
	
	private Order orderTest;
	
		private OrderManager orderManager = BllManagerFactory.getOrderManager();
		
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		public List<Order> getOrders(@Context final HttpServletResponse response)  {		
			
			List<Order> orders=new ArrayList<>();		
			
			
			try {
				orders = orderManager.getAll();
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return orders;
			
		}
		
		@GET
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Order getOrder(@PathParam("id") int id, @Context final HttpServletResponse response)  {
			Order order = null;
			
			try {
				order = orderManager.getById(id);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return order;
			
		}
		
		@GET
		@Path("/{orderId:\\d+}/plates")
		@Consumes(MediaType.APPLICATION_JSON)
		public List<Plate> getPlatesByOrder(@PathParam("orderId") int orderId,
				@Context final HttpServletResponse response) {
			List<Plate> plates = new ArrayList<>();

			try {

				plates = BllManagerFactory.getPlateManager().getByOrder(orderManager.getById(orderId));
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
		@Path("/{restaurantId:\\d+}/restaurants")
		@Consumes(MediaType.APPLICATION_JSON)
		public Restaurant getRestaurantByOrder(@PathParam("restaurantId") int orderId,
				@Context final HttpServletResponse response) {
			Restaurant restaurant = null;

			try {

				restaurant = BllManagerFactory.getRestaurantManager().getByOrder(orderManager.getById(orderId));
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

		
		@POST
		@Path("/idUser={userId:\\d+}&idRestaurant={restaurantsId:\\d+}&idPlate={plateId:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Order addOrder(@PathParam("userId") int userId, @PathParam("restaurantsId") int restaurantsId ,@PathParam("plateId") int plateId , @Context final HttpServletResponse response) {
			
			
				Order order= new Order();
				
				
				
			
			
			try {
				order= orderManager.add(order,userId,restaurantsId,plateId);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			
			return order;
		}
		@POST
		@Path("/addPlate/idOrder={orderId}&idPlate={plateId:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Order addPlate( @PathParam("orderId") int orderId ,@PathParam("plateId") int plateId, @Context final HttpServletResponse response){
			Order order = null;
			try {
				
				order = orderManager.getById(orderId);
				
					
				
				order = orderManager.addPlate(order, plateId);;
				
				
			} catch (BLLException e) {
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}	
			}
			
			return order;
		
		}
		
		@PUT
		@Path("/idOrder={orderId}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Order updateOrder( @PathParam("orderId") int orderId, Order orderUpdate, @Context final HttpServletResponse response){
			
			orderUpdate.setId(orderId);
			
						
			
			try {
				orderManager.update(orderUpdate);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}

			
			
			return orderUpdate;
			
			
		}
		
		@DELETE
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Order deleteOrder(@PathParam("id") int id, @Context final HttpServletResponse response) {
			
			Order order = null;
			try {
				order = orderManager.getById(id);
				orderManager.delete(order);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}			
			
			return order;
		}

	}


