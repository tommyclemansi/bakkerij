/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package mySingleton;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.AccessTimeout;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;


/**
 * Session Bean implementation class myStaticPage
 * 
 * I will load here some static content for my Webpage
 * maybe images..
 * 
 */
@Singleton
@LocalBean
@Startup // startup @Dependson can be used if it depends also on another Singleton bean
public class MyStaticPage implements MyStaticPageI {
/*
 * private fields:
 */
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
    /**
     * Default constructor. 
     */
    public MyStaticPage() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
  	public void initialize()
  	{
  		logger.log(Level.INFO, "PostConstruct - initialize invoked");
  	}
  
	@PreDestroy
  	public void cleanup()
  	{
  		logger.log(Level.INFO, "PreDestroy - cleanup invoked");
  	}
	
	/*
	 * every midnight this should run
	 */
	/* (non-Javadoc)
	 * @see mySingleton.MyStaticPageI#loadsomeContent()
	 */
	@Override
	@Schedule(hour="23",minute="59")
	public void loadsomeContent()
	{
		logger.log(Level.INFO, "scheduled method loadsomeContent invoked");
	}

	/*
	 * container managed synchronization is the default
	 * Only 1 Thread may access accesssomecontent at a time
	 * 
	 * Write is default
	 * we can specify a maximum of time other clients can wait 
	 * they receive AccessTimeoutException
	 */
	@AccessTimeout(value=1,unit=TimeUnit.MINUTES)
	public void accesssomeContent()
	{
		logger.log(Level.INFO, "scheduled method loadsomeContent invoked");
	}
	
	/*
	 * overrides the default WRITE Lock
	 */
	@Lock(LockType.READ)
	public void accesssomeotherContent()
	{
		logger.log(Level.INFO, "scheduled method loadsomeContent invoked");
	}
	
}
