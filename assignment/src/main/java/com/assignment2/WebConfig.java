package com.assignment2;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

	    @Bean
	    ServletRegistrationBean h2ServletRegistration(){
	        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
	        registrationBean.addUrlMappings("/console/*");
	        return registrationBean;
	    }
	}
