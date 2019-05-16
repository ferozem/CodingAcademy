package com.jpm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransactionAspect {
	
	@Around("execution(* com.jpm.aop.CustomerServiceImpl.withdraw(..))")
	public void transaction(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("******** Transaction around advice before.." +proceedingJoinPoint.getSignature().getName());
		proceedingJoinPoint.proceed(); // it will delegate to the jointpoint execution and then again execute the advice
		System.out.println("******** Transaction around advice after..." +proceedingJoinPoint.getSignature().getName());
	}

}
