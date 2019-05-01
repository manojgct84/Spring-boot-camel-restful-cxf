package com.bac.rds.cmx.spring;

import org.apache.camel.LoggingLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRouteBuilder extends AbstractRouteBuilder {
	private static Logger LOGGER = LogManager.getLogger(MyRouteBuilder.class);
	@Override
	public void configureRoutes() {
		// Access us using http://localhost:8080/camel/hello
		/*from("servlet:///hello").transform().constant("Hello from Camel!").process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				throw new ArrayIndexOutOfBoundsException();
				
			}
		});
*/
		// Trigger run right after startup. No Servlet request required.
		from("timer://foo?fixedRate=true&period=10s").log(LoggingLevel.DEBUG,"camelAppender","Camel timer triggered.");
	}
}