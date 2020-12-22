package com.annotation.autowire.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("apple")
public class Apple implements Fruits {

	@Override
	public void getName() {
		System.out.println("I am Apple");
	}

}
