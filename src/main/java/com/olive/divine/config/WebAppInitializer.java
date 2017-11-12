package com.olive.divine.config;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.sun.jersey.spi.container.servlet.ServletContainer;

public class WebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(Appconfig.class);
		context.setServletContext(servletContext);
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/home/*");
		
		ServletRegistration.Dynamic dispatcher2 = servletContext.addServlet("jersey-serlvet", new ServletContainer());
		HashMap<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("com.sun.jersey.config.property.packages", "com.jersey.service");
		initParameters.put("ccom.sun.jersey.api.json.POJOMappingFeature", "true");
		dispatcher2.setLoadOnStartup(2);
		dispatcher2.addMapping("/rest/*");
	}

}
