package com.design.patterns.structural.facade;

/**
 * Paso 2: Creamos la segunda clase que implementa 
 * la interface Shape
 * @author jesus
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
