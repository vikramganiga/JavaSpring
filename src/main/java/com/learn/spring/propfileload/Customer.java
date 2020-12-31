package com.learn.spring.propfileload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("AppConfig.properties")
public class Customer {
	
	@Value("${customer.emailid}")
	public String name;
	
	@Value("${customer.name}")
	public String email;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
