package com.bac.rds.cmx.spring;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("classpath:endpoint.xml")
public class Application {
	private static Logger LOGGER = LogManager.getLogger(Application.class);
    private static final String CAMEL_URL_MAPPING = "/camel/*";
    private static final String CAMEL_SERVLET_NAME = "CamelServlet";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
     }

 /*   @Bean
    public ServletRegistrationBean servletRegistrationBean() {
    	LOGGER.debug("################################3servletRegistrationBean");
        ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), CAMEL_URL_MAPPING);
        registration.setName(CAMEL_SERVLET_NAME);
        return registration;
    }
*/
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
    	LOGGER.debug("################################3servletRegistrationBean");
        ServletRegistrationBean registration = new ServletRegistrationBean(new CXFServlet(), CAMEL_URL_MAPPING);
        registration.setName(CAMEL_SERVLET_NAME);
        registration.setLoadOnStartup(1);
        return registration;
    }
    
    @Bean
    public SpringCamelContext camelContext(ApplicationContext applicationContext) throws Exception {
        SpringCamelContext camelContext = new SpringCamelContext(applicationContext);
        camelContext.addRoutes(routeBuilderFind());
//        camelContext.addRoutes(routeBuilder());       
        camelContext.setUseBreadcrumb(true);
        return camelContext;
    }

    /*@Bean
    public RouteBuilder routeBuilder() {
    	LOGGER.debug("##########################routeBuilder");
        return new MyRouteBuilder();
    }
*/    
    @Bean
    public RouteBuilder routeBuilderFind() {
        return new FindCustomerRouter();
    }
}


