package com.mahendra.mumbaibank.advices;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	
	private Logger logger = Logger.getGlobal();
	
	
	@AfterReturning("execution(* com.mahendra.mumbaibank.services.impl.*.*(..))")
	public void logIt(JoinPoint pt){
		logger.info("Method invoked : "+ pt.getSignature().getName());
	}
	
}
