package com.annotation.autowire.config;

import org.springframework.stereotype.Component;

@Component
public class InjectedClass {
	
	public String getWired() {
		return ("I am wired");
	}

}
