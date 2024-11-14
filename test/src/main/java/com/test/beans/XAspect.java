package com.test.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XAspect {

	@Around("execution(void com.test.beans.Car.get())")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("red");
		point.proceed();
		System.out.println("100,000,000$");
		return null;
	}
}
