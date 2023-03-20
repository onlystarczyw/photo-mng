package com.hfsf.photo.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class BaseFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		HttpServletResponse resp = (HttpServletResponse) response;  
        resp.setHeader("Access-Control-Allow-Origin", "*");  
        resp.setHeader("Access-Control-Allow-Methods", "*");  
        resp.setHeader("Access-Control-Max-Age", "3600");  
        resp.setHeader("Access-Control-Allow-Headers", "*");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, response);  
		
	}

}
