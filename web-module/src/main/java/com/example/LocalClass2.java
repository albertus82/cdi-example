package com.example;

import javax.annotation.PostConstruct;

public class LocalClass2 {

	public void sayHello() {
		System.out.println("Hello from " + getClass());
	}

	@PostConstruct
	void init() {
		System.out.println("@PostConstruct " + getClass());
	}

}
