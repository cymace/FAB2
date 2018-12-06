package fr.eni.fab2.bean;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Reservation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private LocalDateTime dateReservation;
	private int numPlaces;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private User user;

	public Reservation() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Reservation(LocalDateTime dateReservation, int numPlaces, User user) {
		super();
		this.dateReservation = dateReservation;
		this.numPlaces = numPlaces;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateReservation() {
		return dateReservation;
	}
	
	public void setDateReservation (LocalDateTime dateReservation) {
		this.dateReservation =dateReservation;
	}
/*public void setDateReservation(String dateReservation) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
		this.dateReservation = LocalDateTime.parse(dateReservation, formatter);
	}*/

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

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", dateReservation=" + dateReservation + ", numPlaces=" + numPlaces + ", user="
				+ user + "]";
	}
	
	
	
	

}

