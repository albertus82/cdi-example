package com.example;

import javax.enterprise.inject.Produces;

public class ForeignClassProducer {

	@Produces
	public ForeignClass1 foreignClass1Producer() {
		return new ForeignClass1();
	}

	@Produces
	public ForeignClass2 foreignClass2Producer() {
		return new ForeignClass2();
	}

}
