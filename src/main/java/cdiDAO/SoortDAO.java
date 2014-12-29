/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package cdiDAO;

import java.util.logging.Logger;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import myentities.Soort;

/*
 * this class will be used to to persistence with Soort Objects
 */

@Named("SoortDAO")
@Dependent
public class SoortDAO {

	/*
	 * private Logger for SoortDAO
	 */
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@PersistenceContext
	private EntityManager em;
	
	public SoortDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "addSoort");
		em.persist(soort);
	}

	public void deleteSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "deleteSoort");
		em.remove(soort);
	}	
	
	public void updateSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "updateSoort");
		em.merge(soort);
	}	
	
	public Soort getSoort(int id)
	{
		logger.log(java.util.logging.Level.INFO, "findSoort");
		return em.find(Soort.class, id);
	}

	

}
