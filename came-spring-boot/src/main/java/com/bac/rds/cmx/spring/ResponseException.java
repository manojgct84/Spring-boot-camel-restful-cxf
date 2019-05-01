package com.bac.rds.cmx.spring;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("responseException")
public class ResponseException implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("An Exception occured");
		
	}

}
