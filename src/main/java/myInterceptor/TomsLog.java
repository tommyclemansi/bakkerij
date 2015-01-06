/*******************************************************************************
 * Copyright (c) 2015 Tom Cleymans
 *******************************************************************************/
package myInterceptor;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.interceptor.InterceptorBinding;
/*
 * created this because I couldn't get EJB interceptors to work
 * so using CDI interceptors
 * 
 * This is InterceptorBinding
 * now one can annotate the class or method with TomsLog to facilitate  
 */
@InterceptorBinding
@Target({TYPE,METHOD})
@Retention(RUNTIME)
public @interface TomsLog {

}
