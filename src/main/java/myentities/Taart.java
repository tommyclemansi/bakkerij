/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Taartje
 *
 */
@Entity
@Table(name = "TAART")
public class Taart implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Taart() {
		super();
	}
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "TAARTJESEQUENCE")
	@SequenceGenerator(name = "TAARTJESEQUENCE", allocationSize = 20)
	private int id;
	
	/*
	 * naam van dee Taart
	 */
	private String naam;
	
	/*
	 *  soort, this will be a many to many
	 *  taartje kan tot meerdere soorten behoren (vb chocolade, fruit)
	 *  en soorten kunnen tot meerdere taarten behoren 
	 */
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Set<Soort> getSoort() {
		return soort;
	}
	public void setSoort(Set<Soort> soort) {
		this.soort = soort;
	}
	@ManyToMany
	@JoinTable(name = "TAART_SOORT")
	private Set<Soort> soort;
	
	/*
	 * picture
	 */
	
    @Lob
	private Byte[] image;  
	
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

   
}
