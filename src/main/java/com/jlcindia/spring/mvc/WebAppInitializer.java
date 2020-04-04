package com.jlcindia.spring.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class[]{Config.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{Config.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.jlc" };
	}
}

