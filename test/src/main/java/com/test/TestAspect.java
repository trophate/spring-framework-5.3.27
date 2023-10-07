package com.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

	@Pointcut("execution(* print(..))")
	private void pointcut() {
	}

	@Before("pointcut()")
	private void beforeTest() {
		System.out.println("-------- 前置切面 --------");
	}

	@Around("pointcut()")
	private Object aroundTest(ProceedingJoinPoint point) throws Throwable {
		System.out.println("-------- 环绕切面, 前置内容 --------");
		Object proceed = point.proceed();
		System.out.println("-------- 环绕切面, 后置内容 --------");
		return proceed;
	}

	@After("pointcut()")
	private void afterTest() {
		System.out.println("-------- 后置切面 --------");
	}


}
