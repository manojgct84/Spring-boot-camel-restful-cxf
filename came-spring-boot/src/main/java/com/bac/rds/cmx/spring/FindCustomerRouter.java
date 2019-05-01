package com.bac.rds.cmx.spring;

import org.apache.camel.LoggingLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 class FindCustomerRouter extends AbstractRouteBuilder {
	 private static Logger LOGGER = LogManager.getLogger(FindCustomerRouter.class);
	@Override
	public void configureRoutes() {
		// Access us using http://localhost:8080/camel/hello
		//from("servlet:///custmerlst").transform().constant("Camel found ");
		from("cxfrs:bean:rsServer?bindingStyle=SimpleConsumer").transform().constant("camel found");

		// Trigger run right after startup. No Servlet request required.
		from("timer://foo?fixedRate=true&period=10s").log(LoggingLevel.DEBUG,"camelAppender","Camel timer triggered.");
	}
}