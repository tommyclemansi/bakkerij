/*******************************************************************************
 * Copyright (c) 2014 Tom Cleymans
 *******************************************************************************/
/**
 * 
 */
package mybeans;

/**
 * @author tcleyman
 *
 */
/*
 * this is a managed bean (made it SessionScoped)
 * this for the mainPage
 */
public class mainPage {
	public mainPage() {
	}
	
	private String name="Tom Cleymans";
	private int id=0;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public String pageNavigator(String to)
	{System.out.println("pageNavigator invoked " + to);
	 return to;
		
	}
	
}
