/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
/**
 * 
 */
package mybeans;



import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * @author tcleyman
 *
 */
/*
 * this is THE SAME managed bean (made it SessionScoped)
 * BUT using CDI instead
 * 
 * Note that this is a POJO
 * But is defined in faces-config.xml file as managed-bean
 * otherwise @ManagedBean
 * 
 * Better is to use CDI
 */

/*
 * Named will make the Class available from JSF in EL
 * so #{mainPageCDI.name} for example
 * 
 * for JSF backing beans:
 * use request or conversation scope 
 * conversation is shorter then session - handle multi tab
 * 
 * by default conversation is like request scope
 * but can be extended programatically 
 * 
 * 
 * In JSF never use Dependent scope as this implies 
 * a new bean
 * 
 * must implement Serializable ! 
 */
@Named
@SessionScoped
public class mainPageCDI implements Serializable
{
	/*
	 * static block at mainPageCDI class init.. 
	 */

	private static final long serialVersionUID = 1L;
	
	public mainPageCDI() {
	ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	userAgent = ec.getRequestHeaderMap().get("User-agent");
    logger.log(Level.INFO,"user agent is " + userAgent);
    /*
     * I'm assuming anyone is using firefox, if your not using firefox we'll set that one to false.. 
     */
	if (userAgent.toLowerCase().indexOf("firefox")!=-1)
		ffox=false;
	logger.log(Level.INFO,"is firefox used: " + ffox);
	}
	
	private String name="Tom Cleymans";
	private int id=0;
	private String userAgent;
	private boolean ffox=true;//assume firefox is used
	private static final Logger logger = Logger.getLogger(mainPageCDI.class.getName());
	
	static
	{ 
	    logger.log(Level.INFO,"CDI page initialized for bakkerij");
	}
	
	public String getUserAgent() {
		return userAgent;
	}
	public boolean isFfox() {
		return ffox;
	}
	public void setFfox(boolean ffox) {
		this.ffox = ffox;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
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
