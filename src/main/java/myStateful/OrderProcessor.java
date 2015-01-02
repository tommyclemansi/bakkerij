/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myStateful;

import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.SessionSynchronization;
import javax.ejb.Stateful;
import javax.ejb.Remove;

import org.apache.tools.ant.types.LogLevel;

import myentities.Taart;

/**
 * Session Bean implementation class OrderProcessor
 * 
 * This Stateful session bean is responsible for storing the order
 * 
 * SessionSynchronization can be used on stateful EJBs
 * this to get to know demarcation points
 */
@Stateful
@LocalBean
public class OrderProcessor implements SessionSynchronization 
{
	
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


	@Override
	public void afterBegin() throws EJBException//, RemoteException 
	{
		// TODO Auto-generated method stub
	System.out.println("afterBegin called");	
	}


	@Override
	public void afterCompletion(boolean arg0) throws EJBException//,RemoteException 
	{
		// TODO Auto-generated method stub
		System.out.println("afterCompletion called");
		
	}


	@Override
	public void beforeCompletion() throws EJBException//, RemoteException 
	{
		// TODO Auto-generated method stub
		System.out.println("beforeCompletion called");
	}

}
