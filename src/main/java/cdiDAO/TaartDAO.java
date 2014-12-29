/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package cdiDAO;

import java.util.logging.Logger;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import myentities.Soort;
import myentities.Taart;

/*
 * not implemented yet
 */

@Named("ItemDAO")
public class TaartDAO {
	
private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@PersistenceContext
	private EntityManager em;
	
	public TaartDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addTaart (Taart taart)
	{
		logger.log(java.util.logging.Level.INFO, "addTaar");
		em.persist(taart);
	}

	public void deleteTaart (Taart taart)
	{
		logger.log(java.util.logging.Level.INFO, "deleteTaart");
		em.remove(taart);
	}	
	
	public void updateTaart (Taart taart)
	{
		logger.log(java.util.logging.Level.INFO, "updateTaart");
		em.merge(taart);
	}	
	
	public Taart getTaart(int id)
	{
		logger.log(java.util.logging.Level.INFO, "findTaart");
		return em.find(Taart.class, id);
	}

	

}
