package com.test;

import com.test.beans.Apple;
import com.test.beans.Banana;
import com.test.beans.Mango;
import com.test.beans.CustomPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// 指定类创建
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Apple.class, Banana.class, CustomPostProcessor.class);
		System.out.println(context1.getBean(Apple.class));

		// 扫描包创建
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext("com.test.beans");
		System.out.println(context2.getBean(Mango.class));
	}

}
