package com.jpm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//aspect
@Aspect
public class LoggingAspect {
	
	// advice // pointcut - expression to the plug in advice at the jointpoint
	@Before("execution(* com.jpm.aop.CustomerServiceImpl.withdraw(..))")
	public void logBefore(JoinPoint joinPoint){
		System.out.println("Logging before the method..." +joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.jpm.aop.CustomerServiceImpl.logout(..))")
	public void clearLog(JoinPoint joinPoint){
		System.out.println("Clearlog after the method..." +joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut ="execution(* com.jpm.aop.CustomerServiceImpl.checkBalance(..))", returning ="result")
	public void logAfterRetruning(JoinPoint joinPoint, Object result){
		System.out.println("********logAfterRetruning " +joinPoint.getSignature().getName() +" method  retruned value is: " +result);
	}
	
	@AfterThrowing(pointcut ="execution(* com.jpm.aop.CustomerServiceImpl.login(..))", throwing ="error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error){
		System.out.println("********logAfterThrowing() is running " +joinPoint.getSignature().getName() +" method  throwing error is: " +error);
		
	}


}
