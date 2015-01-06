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
	private int OrderNr;
	
	/*
	 * Here I will store Taarten tesamen met aantal
	 */
    
	//public Map<Taart,int aantal> Bestelling;  
	
	public Bestelling() {
		super();
	}
   
}
