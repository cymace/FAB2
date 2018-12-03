package fr.eni.fab2.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String surname;
	private String name;
	private String phone;
	private String mail;
	private String password;
	private boolean isAdmin;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	List<Reservation> reservations;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Order> orders;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Comment> comments;*/

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String surname, String name, String phone, String mail, String password, boolean isAdmin) {
		super();
		this.surname = surname;
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
		this.isAdmin = isAdmin;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", surname=" + surname + ", name=" + name + ", phone=" + phone + ", mail=" + mail
				+ ", password=" + password + ", isAdmin=" + isAdmin + "]";
	}
	
	
	

}
