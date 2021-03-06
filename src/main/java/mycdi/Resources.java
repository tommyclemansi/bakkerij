/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package mycdi;

/*
 * https://github.com/openshift/kitchensink-example/blob/master/src/main/java/org/jboss/as/quickstarts/kitchensink/util/Resources.java
 */


import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
* This class uses CDI to alias Java EE resources, such as the persistence context, to CDI beans
*
* <p>
* Example injection on a managed bean field:
* </p>
*
* <pre>
* &#064;Inject
* private EntityManager em;
* </pre>
*/
/*
 * for some reason can't get it to work with a pu name
 */
public class Resources {
// use @SuppressWarnings to tell IDE to ignore warnings about field not being referenced directly
@SuppressWarnings("unused")
@Produces
//@PersistenceContext(unitName = "primary")
@PersistenceContext
private EntityManager em;

@Produces
public Logger produceLog(InjectionPoint injectionPoint) {
return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
}

@Produces
@RequestScoped
public FacesContext produceFacesContext() {
return FacesContext.getCurrentInstance();
}
}
