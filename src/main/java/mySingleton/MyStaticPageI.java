/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
package mySingleton;

import javax.ejb.Schedule;

public interface MyStaticPageI {

	/*
	 * every midnight this should run
	 */
	public abstract void loadsomeContent();

}