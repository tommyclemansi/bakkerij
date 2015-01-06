package myentities;

import java.io.Serializable;
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
	private int Id;
	/*
	 * elke klant heeft een naam en email (kon ook pk zijn)
	 */
	private String Naam;
	private String Email;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNaam() {
		return Naam;
	}
	public void setNaam(String naam) {
		Naam = naam;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
   
}
