package com.annotation.autowire.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Mango implements Fruits{

	@Override
	public void getName() {
		System.out.println("I am Mango");
	}

}
