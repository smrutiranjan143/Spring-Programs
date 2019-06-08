package com.boot.web;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.boot.web.servlet.PingServlet;

@SpringBootApplication
public class BasicBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicBootWebApplication.class, args);
	}

	/*
	 * @Bean public ServletRegistrationBean<PingServlet> pingServlet() {
	 * ServletRegistrationBean<PingServlet> servletRegistrationBean = null;
	 * PingServlet pingServlet = null;
	 * 
	 * servletRegistrationBean = new ServletRegistrationBean<>(); pingServlet = new
	 * PingServlet(); servletRegistrationBean.setServlet(pingServlet);
	 * servletRegistrationBean.setUrlMappings(Arrays.asList(new String[] { "/ping"
	 * })); servletRegistrationBean.setEnabled(true);
	 * servletRegistrationBean.setLoadOnStartup(1); return servletRegistrationBean;
	 * }
	 */

}
