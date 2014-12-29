/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package myStateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import cdiDAO.TaartDAO;

/**
 * Session Bean implementation class Taartjesservice
 * 
 * This is a no interface bean
 * All public methods are Business Methods 
 */
@Stateless
@LocalBean
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
	TaartDAO taartDAO;
	
    public TaartService() {
        // TODO Auto-generated constructor stub
    }
    
    public void addTaart(String naam)
    {
    System.out.println("addTaartje invoked");	
    }
    
}
