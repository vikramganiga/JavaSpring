package com.annotation.autowire.config;

import org.springframework.stereotype.Component;

@Component
public class MethodLevelInjectedClass {

	public String getWired() {
		return "I am wired";
	}
}
