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
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.OrderManager;
import fr.eni.fab2.exceptions.BLLException;


@Path("/orders")
public class gestionOrder {	
	
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

		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Order addOrder(Order order , @Context final HttpServletResponse response) {
        order.setDateOrder(LocalDateTime.now().withNano(0));
			try {
				order= orderManager.add(order);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			
			
			return order;
		}
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		public Order updateOrder(Order orderUpdate, @Context final HttpServletResponse response){
			orderUpdate.setDateOrder(LocalDateTime.now().withNano(0));

			
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


