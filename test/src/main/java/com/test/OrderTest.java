package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderTest {

	@Autowired
	private List<ObjTemplate> objs;

	public void print() {
		for (ObjTemplate o : objs) {
			o.print();
		}
	}
}

interface ObjTemplate {

	void print();
}

@Component
@Order(2)
class ObjA implements ObjTemplate {

	public ObjA() {
		System.out.println("创建ObjA实例");
	}

	@Override
	public void print() {
		System.out.println("ObjA");
	}
}

@Component
@Order(1)
class ObjB implements ObjTemplate {

	private ObjB() {
		System.out.println("创建ObjB实例");
	}

	public void print() {
		System.out.println("ObjB");
	}
}
