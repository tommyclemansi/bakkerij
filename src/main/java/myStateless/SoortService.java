/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateless;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

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
public class SoortService {

  	private Logger logger = Logger.getLogger(this.getClass().getName());

	
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
    
	public void addSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "addSoort");
		if (soortDAO == null)
			System.out.println("soortDAO is null sorry.. ");
   	    soortDAO.addSoort(soort);
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
