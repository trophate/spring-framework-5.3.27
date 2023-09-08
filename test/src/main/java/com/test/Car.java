package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Tyre tyre;

	public void get() {
		System.out.println("你获得一辆汽车.");
	}
}
