package com.design.patterns.creational.prototype;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 * 
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Sep 6, 2021 7:27:10 PM
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
