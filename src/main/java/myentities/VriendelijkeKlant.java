/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: VriendelijkeKlant
 *
 */
@Entity
@DiscriminatorValue(value="V")
@PrimaryKeyJoinColumn(name = "KLANT_ID", columnDefinition = "KLANT_ID")
public class VriendelijkeKlant extends Klant implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public VriendelijkeKlant() {
		super();
	}
   
}
