package com.tic.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class DispatcherServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		ApplicationContext rootApplicationContext = null;
		ApplicationContext webmvcApplicationContext = null;

		rootApplicationContext = new XmlWebApplicationContext();
		webmvcApplicationContext = new XmlWebApplicationContext();
	}
}