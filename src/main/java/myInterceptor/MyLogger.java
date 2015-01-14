/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
/**
 * 
 */
package myInterceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.interceptor.AroundInvoke;
import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/*
 * switched to CDI interceptor due to WELD Exception
 */
/**
 * @author tcleyman
 *
 */
@TomsLog
@Interceptor
public class MyLogger {
    /*
     * changed to private static final 
     * Logger should be Thread Safe
     */
	private static final Logger logger = Logger.getLogger(MyLogger.class.getName());
	
	/**
	 *  Logging Interceptor
	 *  
	 *  Placed on every bean through ejb-jar.xml file
	 */
	
	// this is an implementation:
	@PostConstruct()
    @PostActivate()
    public void initialize(InvocationContext ic) throws Exception
    {
		logger.log(Level.INFO,"initialize (PostConstruct, PostActivate): " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
			
    }
    
    
    @PreDestroy()
    @PrePassivate()
    public void cleanup(InvocationContext ic) throws Exception
    {
    	logger.log(Level.INFO,"cleanup(PreDestroy, PrePassivate): " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		 }
    
	public MyLogger() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * when ejb timeouts
	 * !! this method must return an object
	 */
    @AroundTimeout()
    public Object aroundTimeouts (InvocationContext ic) throws Exception
    {
    	logger.log(Level.INFO,"aroundTimeouts: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());    
        return ic.proceed();   
    }
    

	/**
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	/*
	 * idea is that I replace my logging with this one
	 * hit into: WELD-000069 An interceptor must have at least one binding, but myInterceptor.MyLogger has none
	 */
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		logger.log(Level.INFO,"aroundInvoke: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		return ic.proceed();
   }

}
