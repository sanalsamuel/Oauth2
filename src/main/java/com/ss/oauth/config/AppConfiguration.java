package com.ss.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ss.oauth.interceptor.ApiInterceptor;
import com.ss.oauth.interceptor.SessionCreatedListener;
import com.ss.oauth.interceptor.SessionDestroyedListener;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ss.oauth")
public class AppConfiguration extends WebMvcConfigurerAdapter  {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	     registry.addInterceptor(new ApiInterceptor()).addPathPatterns("/**");
	}
	
	private static final SessionRegistry SESSION_REGISTRY = new SessionRegistryImpl();
	
	
	@Bean
	public SessionCreatedListener sessionCreatedListener() {
	    return new SessionCreatedListener();
	}
	
	@Bean SessionDestroyedListener sessionDestroyedListener(){
		return new SessionDestroyedListener();
	}
	
	@Bean
	public SessionRegistry sessionRegistry() {
	    return SESSION_REGISTRY;
	}

}