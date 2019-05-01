package com.bac.rds.cmx.spring;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
//@ComponentScan
@ImportResource(value ={"classpath:camel-contex.xml","classpath:endpoint.xml"})
public class Application {
	
    private static final String CAMEL_URL_MAPPING = "/camel/*";
   // private static final String CAMEL_SERVLET_NAME = "CamelServlet";

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
        ServletRegistrationBean registration = new ServletRegistrationBean(new CXFServlet(), CAMEL_URL_MAPPING);
        registration.setLoadOnStartup(1);
        return registration;
    }
}


