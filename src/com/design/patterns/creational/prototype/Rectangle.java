package com.design.patterns.creational.prototype;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 * 
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Sep 6, 2021 7:24:18 PM
 */
public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}

}
