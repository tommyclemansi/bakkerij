package myentities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Klant
 * abstract prevents it from being initialized
 */
@Entity
public abstract class Klant implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Klant() {
		super();
	}
	
	//PK
	@Id
	private int id;
	/*
	 * elke klant heeft een naam en email (kon ook pk zijn)
	 */
	private String naam;
	private String email;
	
	/*
	 * een klant heeft0 of meerdere bestellingen
	 * mappedBy betekent hier dat:
	 * 
	 * Bestelling.klant de owner van de relatie is 
	 * dus een Bestelling kan niet bestaan zonder een klant
	 * 
	 */
	@OneToMany(mappedBy = "klant")
    private Set<Bestelling> bestellingen;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		naam = naam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
   
}
