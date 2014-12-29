package myentities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Taartje
 *
 */
@Entity

public class Taartje implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Taartje() {
		super();
	}
	@Id
	private int id;
	private String name;
	private String soort;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSoort() {
		return soort;
	}
	public void setSoort(String soort) {
		this.soort = soort;
	}
   
}
