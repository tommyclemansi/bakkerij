/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

import myInterceptor.TomsLog;
import cdiDAO.TaartDAOI;

/**
 * Session Bean implementation class Taartjesservice
 * 
 * This is a no interface bean
 * All public methods are Business Methods 
 */
@Stateless
@LocalBean
//@Interceptors(myInterceptor.MyLogger.class)
@TomsLog
public class TaartService {

    /**
     * Default constructor. 
     */
	
	/*
	 * To do insert a taartje DAO that will insert een Taartje 
	 * @Inject
	 * TaartjeDAO
	 */
	
	@Inject
	TaartDAOI taartDAO;
	
    public TaartService() {
        // TODO Auto-generated constructor stub
    }
    
    public void addTaart(String naam)
    {
    System.out.println("addTaartje invoked");	
    }
    
}
