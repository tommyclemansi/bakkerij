package myentities;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Taartje
 *
 */
@Entity
@Table(name = "TAART")
public class Taartje implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Taartje() {
		super();
	}
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "TAARTJESEQUENCE")
	@SequenceGenerator(name = "TAARTJESEQUENCE", allocationSize = 20)
	private int id;
	private String name;
	
	/*
	 *  soort, this will be a many to many
	 *  taartje kan tot meerdere soorten behoren (vb chocolade, fruit)
	 *  en soorten kunnen tot meerdere taarten behoren 
	 */
	private String soort;
	
	/*
	 * picture
	 */
	
    @Lob
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
