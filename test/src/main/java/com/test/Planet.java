package com.test;

import org.springframework.stereotype.Component;

@Component
public class Planet {

	public void print() {
		System.out.println("planet");
	}

	public void getName() {
		System.out.println("地球");
	}
}
