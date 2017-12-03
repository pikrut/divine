package com.olive.divine.config;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.scan("com.olive.divine.*");
		context.register(Appconfig.class);
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		  
		/*ServletRegistration.Dynamic dispatcher2 = servletContext.addServlet("jersey-serlvet", new ServletContainer());
		servletContext.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, context);
		HashMap<String, String> initParameters = new HashMap<String, String>();
		initParameters.put("com.sun.jersey.config.property.packages", "com.olive.divine");
		initParameters.put("ccom.sun.jersey.api.json.POJOMappingFeature", "true");
		
		dispatcher2.setLoadOnStartup(1);
		dispatcher2.addMapping("/rest/*");*/
		
	}

}
