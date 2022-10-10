package com.design.patterns.structural.facade;

/**
 * Paso 2: Creamos la primera clase que implementa 
 * la interface Shape
 * @author jesus
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
