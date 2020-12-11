package com.xml.config;

import org.springframework.beans.factory.DisposableBean;

public class PrototypeBean implements DisposableBean{

	public void getType()
	{
		System.out.println("I am prototype bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am destorying myself ");

	}
}
