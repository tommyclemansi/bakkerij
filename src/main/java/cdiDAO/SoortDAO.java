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

public class SoortDAO implements SoortDAOI {

	/*
	 * private Logger for SoortDAO
	 */
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@PersistenceContext
	private EntityManager em;
	
	public SoortDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see cdiDAO.SoortDAOI#addSoort(myentities.Soort)
	 */
	@Override
	public void addSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "addSoort");
		em.persist(soort);
	}

	/* (non-Javadoc)
	 * @see cdiDAO.SoortDAOI#deleteSoort(myentities.Soort)
	 */
	@Override
	public void deleteSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "deleteSoort");
		em.remove(soort);
	}	
	
	/* (non-Javadoc)
	 * @see cdiDAO.SoortDAOI#updateSoort(myentities.Soort)
	 */
	@Override
	public void updateSoort (Soort soort)
	{
		logger.log(java.util.logging.Level.INFO, "updateSoort");
		em.merge(soort);
	}	
	
	/* (non-Javadoc)
	 * @see cdiDAO.SoortDAOI#getSoort(int)
	 */
	@Override
	public Soort getSoort(int id)
	{
		logger.log(java.util.logging.Level.INFO, "findSoort");
		return em.find(Soort.class, id);
	}

	

}
