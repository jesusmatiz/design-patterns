package com.design.patterns.structural.decorator;

/**
 * Paso 2.
 * Creamos la clase concreta que implementa la misma interfaz
 * 
 * @author jesus
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}

}
