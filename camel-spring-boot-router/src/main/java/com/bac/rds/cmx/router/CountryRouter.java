package com.bac.rds.cmx.router;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.dataformat.JacksonXMLDataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import com.bac.rds.cmx.process.AbstractRouteBuilder;
import com.bac.rds.cmx.vo.Country;
@Component
public class CountryRouter extends AbstractRouteBuilder {
	
	@Override
	public void configureRoutes() {
		from("cxfrs:bean:rsCountry?bindingStyle=SimpleConsumer").process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				System.out.println("Exchange:" + exchange.getIn().getBody().toString());
				System.out.println("Header:" + exchange.getIn().getHeaders());
				Country country =  (Country) exchange.getIn().getBody();
				if (country.getId() !=null){
					System.out.println("############# Country Id " + country.getId() );
				}
				 exchange.getIn().setBody(country);
				 
				 
			}
		});
		
	}
}