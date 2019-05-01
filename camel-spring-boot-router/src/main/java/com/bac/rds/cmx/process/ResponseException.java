package com.bac.rds.cmx.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("responseException")
public class ResponseException implements Processor {

	
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("An Exception occured");
		
	}

}
