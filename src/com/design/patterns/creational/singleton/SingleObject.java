package com.design.patterns.creational.singleton;

import java.util.Date;
import java.util.Objects;

public class SingleObject {
	
	private static SingleObject instance;
	private static Date now;
	
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		
		if (Objects.isNull(instance)) {
			now = new Date();
			instance = new SingleObject();
		}
		
		return instance;
	}
	
	public void showMessage() {
		
		System.out.println(now);
	}

}
