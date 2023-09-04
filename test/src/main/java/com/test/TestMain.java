package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Tyre.class, Tank.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test");
	}
}
