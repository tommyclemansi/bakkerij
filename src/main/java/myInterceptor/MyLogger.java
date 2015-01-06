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

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**
	 *  I might add the lifecycles methods also here for logging purposes
	 */
	
	// this is an implementation:
	@PostConstruct()
    @PostActivate()
    public void initialize(InvocationContext ic) throws Exception
    {
    logger.log(Level.INFO,"initialize called (PostConstruct,PostActivate)");	
    }
    
    
    @PreDestroy()
    @PrePassivate()
    public void cleanup(InvocationContext ic) throws Exception
    {
    logger.log(Level.INFO, "cleanup called (PreDestroy or PrePassivate)");	
    }
	public MyLogger() {
		// TODO Auto-generated constructor stub
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
		System.out.println("myLogging interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		logger.log(Level.INFO,"myLogging interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		return ic.proceed();
   }

}
