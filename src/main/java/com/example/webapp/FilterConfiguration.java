package com.example.webapp;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.resource.ResourceUrlEncodingFilter;

@Configuration
public class FilterConfiguration {
	
	@Bean
	public FilterRegistrationBean resourceUrlEncodingFilter()
	{
		FilterRegistrationBean bean = new FilterRegistrationBean(new ResourceUrlEncodingFilter());
		bean.setUrlPatterns(Arrays.asList("/*"));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}

}
