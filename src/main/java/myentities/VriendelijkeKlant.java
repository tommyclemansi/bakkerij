package myentities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: VriendelijkeKlant
 *
 */
@Entity

public class VriendelijkeKlant extends Klant implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public VriendelijkeKlant() {
		super();
	}
   
}
