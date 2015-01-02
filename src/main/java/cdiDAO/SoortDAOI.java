/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package cdiDAO;

import myentities.Soort;

public interface SoortDAOI {

	public abstract void addSoort(Soort soort);

	public abstract void deleteSoort(Soort soort);

	public abstract void updateSoort(Soort soort);

	public abstract Soort getSoort(int id);

}