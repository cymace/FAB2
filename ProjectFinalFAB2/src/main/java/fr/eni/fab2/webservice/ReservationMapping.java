package fr.eni.fab2.webservice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.User;

public class ReservationMapping {
	

	private String dateReservation;
	private int numPlaces;
	
	private User user;
	
	
	public Reservation getReservation(){
		Reservation reservation = new Reservation();
		reservation.setUser(user);
		reservation.setNumPlaces(numPlaces);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			
			reservation.setDateReservation(LocalDateTime.parse(dateReservation, formatter));
		
		return reservation;
	}

	public String getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNumPlaces() {
		return numPlaces;
	}

	public void setNumPlaces(int numPlaces) {
		this.numPlaces = numPlaces;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
