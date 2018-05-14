package com.ss.oauth.interceptor;

import org.springframework.context.ApplicationListener;
import org.springframework.security.web.session.HttpSessionCreatedEvent;



public class SessionCreatedListener implements ApplicationListener<HttpSessionCreatedEvent> {

	@Override
	public void onApplicationEvent(HttpSessionCreatedEvent event) {
		
		event.getSession().setMaxInactiveInterval(1 * 60);
	}
}