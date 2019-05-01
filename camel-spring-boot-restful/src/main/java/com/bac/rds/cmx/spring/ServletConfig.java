package com.bac.rds.cmx.spring;

import javax.ws.rs.HttpMethod;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class ServletConfig {
	@Bean
	public EmbeddedServletContainerCustomizer containerPort() {
		return (container -> {
			container.setPort(8090);
		});
	}

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				if (container.getClass().isAssignableFrom(TomcatEmbeddedServletContainerFactory.class)) {
					TomcatEmbeddedServletContainerFactory tomcatContainer = (TomcatEmbeddedServletContainerFactory) container;
					tomcatContainer.addContextCustomizers(new ContextSecurityCustomizer());
				}
			}
		};
	}

	private static class ContextSecurityCustomizer implements TomcatContextCustomizer {
		@Override
		public void customize(Context context) {
			SecurityConstraint constraint = new SecurityConstraint();
			SecurityCollection securityCollection = new SecurityCollection();
			securityCollection.setName("restricted_methods");
			securityCollection.addPattern("/*");
			securityCollection.addMethod(HttpMethod.DELETE.toString());
			constraint.addCollection(securityCollection);
			context.addConstraint(constraint);
		}
	}
}