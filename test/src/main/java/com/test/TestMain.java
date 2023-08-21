package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Tank tank = (Tank)  context.getBean("tank");
		tank.get();
	}
}
