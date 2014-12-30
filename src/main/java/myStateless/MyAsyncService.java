/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateless;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import myInterceptor.TomsLog;

/**
 * Session Bean implementation class MyAsyncService
 */
@Stateless
@LocalBean
//@Interceptors(myInterceptor.MyLogger.class)
@TomsLog
public class MyAsyncService {

	
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Resource
	SessionContext context;
	
    /**
     * Default constructor. 
     */
    public MyAsyncService() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * this is just an attempt for async, but not sure if supported in Web Profile
     * need to check
     */
    
    
    /*
     * note here errors are not returned
     * With all Asynchronous, the transaction context is NOT propagated
     * Security Context is
     */
    @Asynchronous
    public void sendMail()
    {
    	logger.log(Level.INFO, "sendMail - Fire And Forget invoked ");
       /*
        * here need to code sending a mail, coding in helper class
        */
    }

    /*
     * errors are wrapped when invoking get
     */
    @Asynchronous
    public Future<String> betaaldeLUC()
    {
    	logger.log(Level.INFO, "betaaldeLUC - returnFuture invoked ");
    	if(context.wasCancelCalled()) 
    		{logger.log(Level.INFO, "sorry Luc, alles is gecancelled ");
    		 return null;
    		}
    		
    	return new AsyncResult<String>("betaaldeLUC succeeded");
    }

}
