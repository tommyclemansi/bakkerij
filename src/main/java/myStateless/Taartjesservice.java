package myStateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Taartjesservice
 * 
 * This is a no interface bean
 * All public methods are Business Methods 
 */
@Stateless
@LocalBean
public class Taartjesservice {

    /**
     * Default constructor. 
     */
    public Taartjesservice() {
        // TODO Auto-generated constructor stub
    }
    
    public void addTaartje(String naam)
    {
    System.out.println("addTaartje invoked");	
    }
    
}
