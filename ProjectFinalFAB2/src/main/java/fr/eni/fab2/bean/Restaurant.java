package fr.eni.fab2.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Restaurant implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String addresse;
	private int numberPlacesMax;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Reservation> reservations;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Order> orders;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Plate> plates;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Restaurant(String name, String addresse, int numberPlacesMax) {
		super();
		this.name = name;
		this.addresse = addresse;
		this.numberPlacesMax = numberPlacesMax;
	}
	
	
	
	public Restaurant(String name, String addresse, int numberPlacesMax, List<Reservation> reservations,
			List<Order> orders, List<Plate> plates) {
		super();
		this.name = name;
		this.addresse = addresse;
		this.numberPlacesMax = numberPlacesMax;
		this.reservations = reservations;
		this.orders = orders;
		this.plates = plates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public int getNumberPlacesMax() {
		return numberPlacesMax;
	}

	public void setNumberPlacesMax(int numberPlacesMax) {
		this.numberPlacesMax = numberPlacesMax;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Plate> getPlates() {
		return plates;
	}

	public void setPlates(List<Plate> plates) {
		this.plates = plates;
	}


	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", addresse=" + addresse + ", numberPlacesMax="
				+ numberPlacesMax + "]";
	}
}
