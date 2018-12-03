package fr.eni.fab2.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupeSanguin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String groupe;
	private char rhesus;
	public GroupeSanguin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	public char getRhesus() {
		return rhesus;
	}
	public void setRhesus(char rhesus) {
		this.rhesus = rhesus;
	}
	@Override
	public String toString() {
		return "GroupeSanguin [id=" + id + ", groupe=" + groupe + ", rhesus=" + rhesus + "]";
	}
	
	

}
