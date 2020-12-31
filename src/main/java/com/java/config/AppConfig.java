package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("com.java.config")
public class AppConfig {

	@Bean
	public PineApple getPineApple() {
		return new PineApple();
	}
	
}
