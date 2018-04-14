package com.olive.divine.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.olive.divine.service.HelloWorldService;
import com.olive.divine.service.impl.HelloWorldServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "com.olive.divine.*",
})
@PropertySource("classpath:config/config.properties")
public class Appconfig extends WebMvcConfigurerAdapter {

	@Value("${mongodb.url}")
	private String mongodbUrl;
	@Value("${mongodb.port}")
	private String port;
	@Value("${mongodb.db}")
	private String db;

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	

	@Bean
	public MongoDatabase getDbConnection() {
		MongoClient mongoClient = new MongoClient(getMongodbUrl(), Integer.parseInt(getPort()));
		MongoDatabase divineDatabase = mongoClient.getDatabase(getDb());
		return divineDatabase;
	}
	
	@Bean
	public HelloWorldService helloWorldService(){
		return new HelloWorldServiceImpl();
	}
	
	public String getMongodbUrl() {
		return mongodbUrl;
	}

	public void setMongodbUrl(String mongodbUrl) {
		this.mongodbUrl = mongodbUrl;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}
	
	

}
