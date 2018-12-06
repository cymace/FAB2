package fr.eni.fab2.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.*;

@Entity
@Table(name = "Order_DB")
public class Order implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	LocalDateTime dateOrder;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	private User user;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.LAZY)
	 @JsonIgnore
	private List<Plate> plates;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.LAZY)
	 @JsonIgnore
	private Restaurant restaurant;
	

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(LocalDateTime dateOrder, User user) {
		super();
		this.dateOrder = dateOrder;
		this.user = user;
	}
	
	

	public Order(LocalDateTime dateOrder, User user, List<Plate> plates, Restaurant restaurant) {
		super();
		this.dateOrder = dateOrder;
		this.user = user;
		this.plates = plates;
		this.restaurant = restaurant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(LocalDateTime dateOrder) {
		this.dateOrder = dateOrder;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Plate> getPlates() {
		return plates;
	}

	public void setPlates(List<Plate> plates) {
		this.plates = plates;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	

}
