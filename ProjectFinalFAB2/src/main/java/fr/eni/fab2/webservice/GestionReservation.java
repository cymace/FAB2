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

	import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bll.manager.BllManagerFactory;
	import fr.eni.fab2.bll.manager.ReservationManager;
	import fr.eni.fab2.exceptions.BLLException;

	@Path("/reservations")
	public class GestionReservation {
		
		
		private ReservationManager reservationManager = BllManagerFactory.getReservationManager();
		
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		public List<Reservation> getReservations(@Context final HttpServletResponse response)  {
			
			
			List<Reservation> reservations=new ArrayList<>();		
			
			
			try {
				reservations = reservationManager.getAll();
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return reservations;
			
		}
		
		@GET
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Reservation getReservation(@PathParam("id") int id, @Context final HttpServletResponse response)  {
			Reservation reservation = null;
			
			try {
				reservation = reservationManager.getById(id);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			return reservation;
			
		}

		
		@POST
		@Path("/idUser={userId:\\d+}&idRestaurant=(restaurantId:\\d+")
		@Consumes(MediaType.APPLICATION_JSON)
		public Reservation addReservation(@PathParam("userId") int userId,@PathParam("restaurantId") int restaurantId,Reservation reservation , @Context final HttpServletResponse response) {
			
		
			try {
				Restaurant restaurant = BllManagerFactory.getRestaurantManager().getById(restaurantId);
				List<Reservation> reservations =(restaurant.getReservations()==null)? new ArrayList<>(): restaurant.getReservations();
				
				reservation= reservationManager.add(reservation, userId);
				
				reservations.add(reservation);
				restaurant.setReservations(reservations);
				BllManagerFactory.getRestaurantManager().update(restaurant);
				
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		}
			
			
			
			return reservation;
		}
		
		@PUT
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Reservation updateReservation(@PathParam("id") int id,Reservation reservationUpdate, @Context final HttpServletResponse response){
			
			reservationUpdate.setId(id);
			reservationUpdate.setDateReservation(LocalDateTime.now().withNano(0));
			try {
				reservationManager.update(reservationUpdate);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}

			
			
			return reservationUpdate;
			
			
		}
		
		@DELETE
		@Path("/{id:\\d+}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Reservation deleteReservation(@PathParam("id") int id, @Context final HttpServletResponse response) {
			
			Reservation reservation = null;
			try {
				reservation = reservationManager.getById(id);
				reservationManager.delete(reservation);
			} catch (BLLException e) {
				System.out.println(e.getMessage());
				try {
					response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				} catch (IOException ex) {
					System.out.println(ex.getMessage());
				}		
			}			
			
			return reservation;
		}

}
