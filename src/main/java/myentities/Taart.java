/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.FetchType.LAZY;

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
	 * 
	 * making use of Bean validation here.. 
	 * @PrePersist, PreUpdate & PreRemove will trigger this
	 */
	@NotNull(message="Naam van de taart is verplicht")
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
	
	/*
	 * Soort.taarten is hier de owner van de relatie
	 * 
	 */
	
	@ManyToMany(mappedBy = "taarten")
	//@JoinTable(name = "TAART_SOORT")
	private Set<Soort> soort;
	
	/*
	 * picture
	 */
	
    @Lob
	@Basic(fetch = LAZY)
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
