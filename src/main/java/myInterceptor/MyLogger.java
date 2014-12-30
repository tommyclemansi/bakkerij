/**
 * 
 */
package myInterceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
/**
 * @author tcleyman
 *
 */
public class MyLogger {

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
	 */
	@AroundInvoke
	public Object aroundInvoke(InvocationContext ic) throws Exception {
		System.out.println("myLogging interceptor: " + "class: " + ic.getClass().getName() +" method: " + ic.getMethod().getName() + " target: " + ic.getTarget().getClass().getName());
		return ic.proceed();
   }

}
