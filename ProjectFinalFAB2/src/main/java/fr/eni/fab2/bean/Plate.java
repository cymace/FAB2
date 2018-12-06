package fr.eni.fab2.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
public class Plate implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String imagePlate;
	private float prix;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Comment> comments;
	
	@ManyToMany(mappedBy="plates")
	@Basic(fetch=FetchType.LAZY)
	List<Restaurant> restaurants;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.LAZY)	
	List<Order> orders;

	public Plate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plate(String name, String imagePlate, float prix, List<Comment> comments, List<Restaurant> restaurants,
			List<Order> orders) {
		super();
		this.name = name;
		this.imagePlate = imagePlate;
		this.prix = prix;
		this.comments = comments;
		this.restaurants = restaurants;
		this.orders = orders;
	}
	
	

	public Plate(String name, String imagePlate, float prix, List<Comment> comments, List<Order> orders) {
		super();
		this.name = name;
		this.imagePlate = imagePlate;
		this.prix = prix;
		this.comments = comments;
		this.orders = orders;
	}
	
	public Plate(String name, String imagePlate, float prix) {
		super();
		this.name = name;
		this.imagePlate = imagePlate;
		this.prix = prix;
		this.comments = comments;
		this.orders = orders;
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

	public String getImagePlate() {
		return imagePlate;
	}

	public void setImagePlate(String imagePlate) {
		this.imagePlate = imagePlate;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Plate [id=" + id + ", name=" + name + ", imagePlate=" + imagePlate + ", prix=" + prix + "]";
	}
	
	
	

}
