/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bestelling
 *
 */
@Entity
public class Bestelling implements Serializable {

	
	private static final long serialVersionUID = 1L;
    @Id
	private int orderNr;
	
    /*
     * een bestelling hoort tot een klant
     * This is the owning side. 
     * 
     * default is to eagerly fetch
     * hier is bestelling owner omdat een bestelling niet kan bestaan zonder klant
     * mappedBy is niet nodig, omdat manytoOne, many altijd owner kant is 
     */
    @ManyToOne
    private Klant klant;
    
	/*
	 * Here I will store Taarten tesamen met aantal
	 */
    @ManyToMany
    @MapKeyColumn(name="NO_ORDERED") // this is the integer (aantal taartjes besteld)
	@JoinTable(joinColumns = @JoinColumn(name = "ORDERNO", referencedColumnName = "orderNr", columnDefinition = "ORDERNO"), inverseJoinColumns = @JoinColumn(name = "TAARTID", referencedColumnName = "id", columnDefinition = "TAARTID"))
	private Map<Integer,Taart> Bestelling;  
	
	public Bestelling() {
		super();
	}
   
}
