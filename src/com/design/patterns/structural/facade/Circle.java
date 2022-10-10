package com.design.patterns.structural.facade;

/**
 * Paso 2: Creamos la tercera clase que implementa 
 * la interface Shape
 * @author jesus
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
