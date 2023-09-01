package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tank {

	@Autowired
	private Tyre tyre;

	public void get() {
		System.out.println("你获得一辆坦克.");
	}
}
