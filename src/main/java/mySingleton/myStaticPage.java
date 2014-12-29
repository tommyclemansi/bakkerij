package mySingleton;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class myStaticPage
 * 
 * I will load here some static content for my Webpage
 * maybe images..
 * 
 */
@Stateful
@LocalBean
public class myStaticPage {

    /**
     * Default constructor. 
     */
    public myStaticPage() {
        // TODO Auto-generated constructor stub
    }

}
