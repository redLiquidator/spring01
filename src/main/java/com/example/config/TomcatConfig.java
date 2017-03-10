package com.example.config;

import org.apache.catalina.Context;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class TomcatConfig extends ServerProperties {
	
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		super.customize(container);
		
		/*
		 * Tomcat 설정
		 */
		TomcatEmbeddedServletContainerFactory tomcat = (TomcatEmbeddedServletContainerFactory) container;
		tomcat.addContextCustomizers(new TomcatContextCustomizer() {
			
			@Override
			public void customize(Context context) {
				context.addWelcomeFile("index.jsp");
			}
		});
		
	}

}
