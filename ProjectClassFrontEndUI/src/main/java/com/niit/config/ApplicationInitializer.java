package com.niit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println(" inside root context");
		return new Class[]{ResolverHandlerConfiguration.class,MvcConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return null;
	}
	@Override
	protected String[] getServletMappings() {
		System.out.println(" inside mapping");
		return  new String[]{"/"};
	}
}


