package com.annotation.autowire.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JuiceCenter {
	
	@Autowired
	@Qualifier("apple")
	private Fruits fruits;
	
	public void getJuice() {
		System.out.print("Adding water to ");
		fruits.getName();
	}

}
