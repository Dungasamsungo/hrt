package com.projeto.hrt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/pacient-list").setViewName("pacient-list");
		registry.addViewController("/manager").setViewName("manager");
		registry.addViewController("/").setViewName("manager");
		registry.addViewController("/login").setViewName("login");
		// registry.addViewController("/manager").setViewName("manager");
		// registry.addViewController("/list").setViewName("list");

		/*
		 * registry.addViewController("/home").setViewName("home");manager
		 * registry.addViewController("/").setViewName("home");
		 * registry.addViewController("/hello").setViewName("hello");
		 * registry.addViewController("/login").setViewName("login");
		 * registry.addViewController("/manager").setViewName("manager");
		 */
	}

}