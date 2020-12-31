package com.java.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AppleO")
public class AppleO {
	
	public void getName() {
		System.out.println("I am Apple ");
	}

}
