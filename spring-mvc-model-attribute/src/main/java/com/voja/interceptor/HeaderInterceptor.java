 package com.voja.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


@Service
public class HeaderInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		request.setAttribute("hey", "have a nice day");
		String location=request.getParameter("locationame");
		
		if(location!=null)
		{
			request.setAttribute("locationName", location);
		}
		return true;
	}
	

}
