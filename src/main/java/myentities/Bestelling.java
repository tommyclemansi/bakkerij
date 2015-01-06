package myentities;

import java.io.Serializable;
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
    
	//public Map<Taart,int aantal> Bestelling;  
	
	public Bestelling() {
		super();
	}
   
}
