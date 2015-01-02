/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package cdiDAO;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
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
	
	// this does not work for some reason it states pu bakkerij not found 
	/*@PersistenceContext(unitName="bakkerij")
	private EntityManager em;*/
	 
	/*
	 * JBAS011440: Can't find a persistence unit named null in deployment "ROOT.war"
	 */
	//@PersistenceContext
	//private EntityManager em;
	
	// this is what is in the kitchensink example
	// basically they are using a Resources class and then inject the 
	@Inject
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
		System.out.println("in add soort - DAO part");
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
