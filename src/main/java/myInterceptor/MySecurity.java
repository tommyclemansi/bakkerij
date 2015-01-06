/**
 * 
 */
package myInterceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/*
 * switched to CDI interceptor due to WELD Exception
 */
/**
 * @author tcleyman
 *
 */
@Interceptor
public class MySecurity {

	
	/**
	 * Need to implement this Class
	 * this is to add security through interceptors 
	 */
	public MySecurity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		System.out.println("Security interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
	    /*
	     * here to implement security
	     */
		return ic.proceed();
   }

}

