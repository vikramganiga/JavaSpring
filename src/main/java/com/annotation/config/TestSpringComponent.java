package com.annotation.config;

import org.springframework.stereotype.Component;

@Component("testSpringComponent")
public class TestSpringComponent {

	public void getMessage() {
		System.out.println("I am spring bean component");
	}
}
