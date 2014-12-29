/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateful;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Remove;

import myentities.Taart;

/**
 * Session Bean implementation class OrderProcessor
 * 
 * This Stateful session bean is responsible for storing the order
 * This 
 */
@Stateful
@LocalBean
public class OrderProcessor {
	
	private List<Taart> orderedTaartjes;

    /**
     * Default constructor. 
     */
    public OrderProcessor() {
        // TODO Auto-generated constructor stub
    }
    
    
    /*
     * these 2 methods will be called at the end:
     * to either persist or cancel
     * This should release the bean at the end of call
     */
    @Remove
    public void placeOrder()
    {
    	
    }
    
    
    @Remove
    public void cancel()
    {
    	
    }

}
