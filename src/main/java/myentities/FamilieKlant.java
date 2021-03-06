/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;

import javax.persistence.*;
import static javax.persistence.FetchType.LAZY;

/**
 * Entity implementation class for Entity: FamilieKlant
 *
 */
@Entity
@DiscriminatorValue(value="F")
@PrimaryKeyJoinColumn(name = "KLANT_ID", columnDefinition = "KLANT_ID")
public class FamilieKlant extends Klant implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FamilieKlant() {
		super();
	}
	
	/*
	 * hier kunnen we no foto insteken
	 */
	@Lob
	@Basic(fetch = LAZY)
	private Byte[] image;  
	
   
}
