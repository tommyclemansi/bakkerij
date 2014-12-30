/**
 * 
 */
package myInterceptor;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
/**
 * @author tcleyman
 *
 */
public class MyLogger {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	/**
	 * 
	 */
	public MyLogger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	/*
	 * idea is that I replace my logging with this one
	 * hit into: WELD-000069 An interceptor must have at least one binding, but myInterceptor.MyLogger has none
	 */
	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		System.out.println("myLogging interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		logger.log(Level.INFO,"myLogging interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		return ic.proceed();
   }

}
