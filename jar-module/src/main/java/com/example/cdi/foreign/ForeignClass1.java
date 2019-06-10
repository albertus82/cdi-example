package com.example.cdi.foreign;

import javax.annotation.PostConstruct;

public class ForeignClass1 {

	public void sayHello() {
		System.out.println("Hello from " + getClass());
	}

	@PostConstruct
	void init() {
		throw new IllegalStateException("Unexpected @PostConstruct for " + getClass());
	}

}
