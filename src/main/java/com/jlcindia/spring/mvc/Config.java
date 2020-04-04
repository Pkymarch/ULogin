package com.jlcindia.spring.mvc;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.jlcindia.spring.mvc" })
public class Config {

	@Bean
	public InternalResourceViewResolver viewReSolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}
    @Bean
    public MessageSource messageSource(){
    ReloadableResourceBundleMessageSource rs=new ReloadableResourceBundleMessageSource();
      rs.setBasename("classpath:messages");
      rs.setDefaultEncoding("UTF-8");
	return rs;
    }
}
