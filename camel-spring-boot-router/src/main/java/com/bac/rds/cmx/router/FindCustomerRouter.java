package com.bac.rds.cmx.router;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.bac.rds.cmx.process.AbstractRouteBuilder;
@Component
public class FindCustomerRouter extends AbstractRouteBuilder {
	@Override
	public void configureRoutes() {
		// Access us using http://localhost:8080/camel/hello
		//from("servlet:///custmerlst").transform().constant("Camel found ");
		from("cxfrs:bean:rsServer?bindingStyle=SimpleConsumer").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				System.out.println("Exchange:" + exchange.getIn().getBody());
				System.out.println("Header:" + exchange.getIn().getHeaders());
				
			}
		}).transform().constant("camel found");

		// Trigger run right after startup. No Servlet request required.
		from("timer://foo?fixedRate=true&period=10s").log(LoggingLevel.DEBUG,"camelAppender","Camel timer triggered.");
	}
}