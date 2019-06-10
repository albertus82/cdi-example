package com.example.cdi.foreign;

import javax.annotation.PreDestroy;

public class ForeignClass2 {

	public void sayHello() {
		System.out.println("Hello from " + getClass());
	}

	@PreDestroy
	void destroy() {
		throw new IllegalStateException("Unexpected @PreDestroy for " + getClass());
	}

}
