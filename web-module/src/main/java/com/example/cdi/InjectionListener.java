package com.example.cdi;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.example.cdi.foreign.ForeignClass1;
import com.example.cdi.foreign.ForeignClass2;
import com.example.cdi.local.LocalClass1;
import com.example.cdi.local.LocalClass2;

@WebListener
public class InjectionListener implements ServletContextListener {

	@Inject
	private LocalClass1 lc1;

	@Inject
	private LocalClass2 lc2;

	@Inject
	private ForeignClass1 fc1;

	@Inject
	private ForeignClass2 fc2;

	@Override
	public void contextInitialized(final ServletContextEvent sce) {
		lc1.sayHello();
		lc2.sayHello();
		fc1.sayHello();
		fc2.sayHello();
	}

	@Override
	public void contextDestroyed(final ServletContextEvent sce) {/* Ignore */}

}
