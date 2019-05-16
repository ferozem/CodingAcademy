package com.jpm.spring.currency;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspect {
	
	// advice // pointcut - expression to the plug in advice at the jointpoint
		@Before("execution(* com.jpm.spring.currency.CurrencyConverterImpl.dollarsToRupees(..))")
		public void logBefore(JoinPoint joinPoint){
			System.out.println("Logging before the method..." +joinPoint.getSignature().getName());
		}
		
		@After("execution(* com.jpm.spring.currency.CurrencyConverterImpl.dollarsToRupees(..))")
		public void clearLog(JoinPoint joinPoint){
			System.out.println("Clearlog after the method..." +joinPoint.getSignature().getName());
		}
		
		@AfterReturning(pointcut ="execution(* com.jpm.spring.currency.CurrencyConverterImpl.dollarsToRupees(..))", returning ="result")
		public void logAfterRetruning(JoinPoint joinPoint, Object result){
			System.out.println("********logAfterRetruning " +joinPoint.getSignature().getName() +" method  retruned value is: " +result);
		}
		
		@Around("execution(* com.jpm.spring.currency.CurrencyConverterImpl.dollarsToRupees(..))")
		public void transaction(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
			System.out.println("******** Transaction around advice before.." +proceedingJoinPoint.getSignature().getName());
			proceedingJoinPoint.proceed(); // it will delegate to the jointpoint execution and then again execute the advice
			System.out.println("******** Transaction around advice after..." +proceedingJoinPoint.getSignature().getName());
		}
		
		
}
