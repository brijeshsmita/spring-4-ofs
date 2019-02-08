package com.mahendra.mumbaibank.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MonitorAdvice {

	@Around("execution (* com.mahendra.mumbaibank.services.impl.*.*(..)) ||"
			+ "execution (* com.mahendra.mumbaibank.dao.collections.*.*(..))")
	public Object calcTime(ProceedingJoinPoint pt)throws Throwable{
		long before = System.nanoTime();
		Object obj = pt.proceed(); //Go and Call target method
		long after = System.nanoTime();
		long time = after - before;
		System.out.println(pt.getSignature().getDeclaringTypeName() + " Time taken: "+time+" nano seconds");
		return obj;
	}
}
