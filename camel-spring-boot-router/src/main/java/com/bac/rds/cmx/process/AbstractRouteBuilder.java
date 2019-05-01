package com.bac.rds.cmx.process;

import org.apache.camel.builder.RouteBuilder;

public abstract class AbstractRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
    	getContext().setUseMDCLogging(true);
		getContext().setUseBreadcrumb(true);
		exceptionRoute();
		configureRoutes();
	}
	
	public abstract void configureRoutes();

	private void exceptionRoute() {
		onException(Exception.class).handled(true).beanRef("responseException");
	}
}
