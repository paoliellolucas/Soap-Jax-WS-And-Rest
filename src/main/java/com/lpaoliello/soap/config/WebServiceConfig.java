package com.lpaoliello.soap.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/services/*");
	}
	 
	@Bean(name=Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {    
		SpringBus springBus = new SpringBus();       
		return springBus;
	}
	
}
