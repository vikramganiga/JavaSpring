package com.annotation.autowire.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependedClass {

	InjectedClass injectedClass;
	MethodLevelInjectedClass methodLevelInjectedClass;
	
	@Autowired
	public DependedClass(InjectedClass injectedClass) {
		this.injectedClass = injectedClass;
	}
	
	public void getWiredMessage() {
		System.out.println("setter level " +injectedClass.getWired());
	}
	
	@Autowired
	public void getWiredMessage(MethodLevelInjectedClass methodLevelInjectedClass) {
		System.out.println("method level "+ injectedClass.getWired());
	}
	
	public void getMessage() {
		getWiredMessage();
	}
}
