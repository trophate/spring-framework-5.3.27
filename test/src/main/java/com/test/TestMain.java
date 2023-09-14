package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// A, B构成循环依赖
//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(A.class, B.class, Planet.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test");
//		OrderTest orderTest = context.getBean(OrderTest.class);
//		orderTest.print();
	}
}
