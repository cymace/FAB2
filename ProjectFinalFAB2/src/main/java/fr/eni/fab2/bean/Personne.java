package fr.eni.fab2.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PersonneAvecPlusieursAdresses")
public class Personne implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String prenom;
	
	@OneToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="relation_personne_adresses")
	@JoinColumn(name="personne")
	private List<Adresse> adresses;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	private GroupeSanguin groupeSanguin;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	public GroupeSanguin getGroupeSanguin() {
		return groupeSanguin;
	}
	public void setGroupeSanguin(GroupeSanguin groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresses=" + adresses
				+ ", groupeSanguin=" + groupeSanguin + "]";
	}
	

	
	
	
	
	
	
	
}
