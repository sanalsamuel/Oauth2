package com.ss.oauth.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class ApiInterceptor extends HandlerInterceptorAdapter {
	
	
	
	
	public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
      
	  		System.out.println("Api Interceptor " +request.getRequestURL() );
	  		
	  		System.out.println("Api Interceptor Session " +request.getSession().getId() );
	  		if(request.getSession().getAttribute("user")!=null){
	  			return true;
	  		}else{
	  			System.out.println("New User");
	  			return true;
	  		}
	  			

      	    
      	

    }
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
		Object handler, ModelAndView modelAndView) throws Exception
	{
		

		response.setHeader("X-Powered-By", "");
		 response.setHeader("cache-control", "no-store,no-cache");
		 response.setHeader("pragma", "no-cache");
		
	
	}
	
	


}
