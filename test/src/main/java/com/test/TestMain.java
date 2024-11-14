package com.test;

import com.test.beans.*;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// 通过传入的类型信息注册bean
//		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Apple.class, Banana.class);
//		System.out.println(context1.getBean(Apple.class));

		// 扫描路径注册bean
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext("com.test.beans");
//		System.out.println(context2.getBean(Mango.class));

		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext("com.test.beans");
		context3.getBean(Car.class).get();
	}

}
