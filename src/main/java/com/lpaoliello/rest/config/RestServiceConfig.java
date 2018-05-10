package com.lpaoliello.rest.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class RestServiceConfig {
	
	@Bean
	public DispatcherServlet dispatcherServletRest() {
		return new DispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatchServletRegistrationRest() {

		ServletRegistrationBean registrationRest = new ServletRegistrationBean(
				dispatcherServletRest(), "/rest/*");

		registrationRest
				.setName("rest");

		return registrationRest;

	}

}
