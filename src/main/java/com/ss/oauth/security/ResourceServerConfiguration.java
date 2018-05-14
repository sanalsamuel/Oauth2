package com.ss.oauth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER).and()

				.authorizeRequests()

				.antMatchers("/allowed/**").permitAll()

				.anyRequest().authenticated().and()

				.requestMatchers().antMatchers("/api/**")

				.and().authorizeRequests().and().exceptionHandling()

				.accessDeniedHandler(new OAuth2AccessDeniedHandler());

	}

}