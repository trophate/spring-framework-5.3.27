package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// 创建方式a
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(A.class, B.class, ...);
		// 创建方式b
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test");

		// A, B构成循环依赖
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(A.class, B.class);

		// order
//		OrderTest orderTest = context.getBean(OrderTest.class);
//		orderTest.print();

		// aop
//		Planet planet = context.getBean(Planet.class);
//		planet.print();
//		planet.getName();
	}

}
