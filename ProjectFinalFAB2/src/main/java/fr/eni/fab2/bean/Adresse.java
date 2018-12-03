package fr.eni.fab2.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdressePrincipaleOuSecondaire")
public class Adresse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nomRue;
	
	private int numRue;
	
	private boolean adressePrincipale;

	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}


	public boolean isAdressePrincipale() {
		return adressePrincipale;
	}


	public void setAdressePrincipale(boolean adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}


	@Override
	public String toString() {
		return "Adresse [id=" + id + ", nomRue=" + nomRue + ", numRue=" + numRue + "]";
	}
	
	
	

}
