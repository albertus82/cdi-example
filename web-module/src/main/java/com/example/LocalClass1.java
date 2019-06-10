package com.example;

import javax.annotation.PreDestroy;

public class LocalClass1 {

	public void sayHello() {
		System.out.println("Hello from " + getClass());
	}

	@PreDestroy
	void destroy() {
		System.out.println("@PreDestroy " + getClass());
	}

}
