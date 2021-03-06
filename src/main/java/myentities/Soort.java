/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myentities;

import java.io.Serializable;
import java.util.Set;

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

   
	/*
     * gewoon een soortNaam
     */
    private String soort;
    
    /*
     * taarten die tot die soort behoren
     * 
     * een soort behoort to 0 of meerdere taarten
     */
    @ManyToMany(targetEntity = myentities.Taart.class)
    @JoinTable(joinColumns = @JoinColumn(name = "soort_id", referencedColumnName = "id", columnDefinition = "SOORTID"), inverseJoinColumns = @JoinColumn(name = "taarten_id", referencedColumnName = "id", columnDefinition = "TAARTID"))
	private Set<Taart> taarten;
	
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
   
	 public Set<Taart> getTaarten() {
			return taarten;
		}

		public void setTaarten(Set<Taart> taarten) {
			this.taarten = taarten;
		}

}
