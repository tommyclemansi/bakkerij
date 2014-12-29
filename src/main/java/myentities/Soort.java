/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Soort
 *
 * Een Taart kan vele Soorten hebben
 * een Soort kan ook veel taarten hebben
 * maar unidirectional ManyToMany from taart
 */
@Entity
@Table(name = "SOORT")
@SequenceGenerator(name = "SOORTSEQUENCE", allocationSize = 20)
public class Soort implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
    @Id
	@GeneratedValue(strategy = SEQUENCE, generator = "SOORTSEQUENCE")
	private int id;

    private String soort;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSoort() {
		return soort;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}

	public Soort() {
		super();
	}
   
}
