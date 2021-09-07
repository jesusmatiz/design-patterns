package com.design.patterns.creational.prototype;

/**
 * Paso 2: Creacion de las clases que extenderan de la clase Shape
 * 
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Sep 6, 2021 7:25:55 PM
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
