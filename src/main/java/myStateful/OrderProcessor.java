/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateful;

import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import javax.ejb.Remove;

import org.apache.tools.ant.types.LogLevel;

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
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private List<Taart> orderedTaartjes;

    /**
     * Default constructor. 
     */
    public OrderProcessor() {
        // TODO Auto-generated constructor stub
    }
    
    
    @PostConstruct()
    @PostActivate()
    public void initialize()
    {
    logger.log(Level.INFO,"initialize called (PostConstruct,PostActivate)");	
    }
    
    
    @PreDestroy()
    @PrePassivate()
    public void cleanup()
    {
    logger.log(Level.INFO, "");	
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
