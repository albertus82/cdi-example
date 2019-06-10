package com.example.cdi;

import javax.enterprise.inject.Produces;

import com.example.cdi.foreign.ForeignClass1;
import com.example.cdi.foreign.ForeignClass2;

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
