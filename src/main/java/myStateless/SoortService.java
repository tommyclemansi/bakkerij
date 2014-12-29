/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateless;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import myentities.Soort;
import cdiDAO.SoortDAOI;

/**
 * Session Bean implementation class SoortService
 */
@Stateless
@LocalBean
public class SoortService {

  	private Logger logger = Logger.getLogger(this.getClass().getName());

	
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
