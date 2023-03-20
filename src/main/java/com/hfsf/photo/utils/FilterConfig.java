package com.hfsf.photo.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.DispatcherType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class FilterConfig {

	 @Value("${session.filter.exclude:}")
	 private String urlExcludes;

	 @Value("${server.servlet.context-path:}")
	 private String contextPath;

	@SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public FilterRegistrationBean xssFilterRegistration()    {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setFilter(new BaseFilter());
        registration.addUrlPatterns("/*");
        registration.setName("baseFilter");
        registration.setOrder(Integer.MAX_VALUE);
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("\"excludes\"", urlExcludes);
        registration.setInitParameters(initParameters);
        return registration;
    }

}

