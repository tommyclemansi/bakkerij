/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myStateless;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebService;

import myInterceptor.TomsLog;
import myentities.Soort;
import cdiDAO.SoortDAOI;

/**
 * Session Bean implementation class SoortService
 */

/*
 * I'll expose my SLSB as a WS just as testing purposes
 * I might use this to insert soorten through a WS call
 * https://forums.openshift.com/cannot-obtain-endpoint-creating-webservice
 * 
 */
@WebService
@Stateless
@LocalBean
//@Interceptors(myInterceptor.MyLogger.class)
@TomsLog
public class SoortService {

  	private Logger logger = Logger.getLogger(this.getClass().getName());

  	
  	/*
  	 * SessionContext can be used for example to mark a method for rollback
  	 */
	@Resource
	private SessionContext context;
  	
  	
  	@WebMethod(exclude=true)
  	@PostConstruct
  	public void initialize()
  	{
  		logger.log(Level.INFO, "PostConstruct - initialize invoked");
  	}
  
  	@WebMethod(exclude=true)
	@PreDestroy
  	public void cleanup()
  	{
  		logger.log(Level.INFO, "PreDestroy - cleanup invoked");
  	}
  	
  	/*
  	 * Here I Inject a non managed DAO 
  	 * SoortDAOI is the interface
  	 * 
  	 * there is one SoortDAO implmentation in my project
  	 * named: SoortDAO
  	 */
	 @Inject
	 SoortDAOI soortDAO;
	
	 /**
	     * Default constructor. 
	     */
		

    public SoortService() {
        // TODO Auto-generated constructor stub
    }
    
    
    /*
     * changed to pass a string as soort has PK that is auto generated
     */
	public void addSoort (String soort)
	{ Soort _soort  = new Soort();
	  _soort.setSoort(soort);
		logger.log(java.util.logging.Level.INFO, "addSoort");
		if (soortDAO == null)
			System.out.println("soortDAO is NULL ");
		System.out.println("now going to do soortDAO addSoort..");
   	    soortDAO.addSoort(_soort);
	}
	

	public void deleteSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "deleteSoort");
		soortDAO.deleteSoort(soort);
	}	
	
	public void updateSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "updateSoort");
		soortDAO.updateSoort(soort);
	}	
	
	public Soort getSoort(int id)
	{
		logger.log(java.util.logging.Level.INFO, "findSoort");
		return soortDAO.getSoort(id);
	}


}
