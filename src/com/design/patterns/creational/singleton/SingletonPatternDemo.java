package com.design.patterns.creational.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Constructor ilegal
		//SingleObject object0 = new SingleObject();
		
		SingleObject object1 = SingleObject.getInstance();
		object1.showMessage();
		
		System.out.println("Tiempo de espera de 3 segundos...");
		Thread.sleep(3000);
		
		SingleObject object2 = SingleObject.getInstance();
		object2.showMessage();

	}

}
