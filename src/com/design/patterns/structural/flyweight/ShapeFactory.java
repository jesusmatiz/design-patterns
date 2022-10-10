package com.design.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * Paso 3: Creamos la clase factory que creara los objetos basado en la
 * informacion dada
 * 
 * @author jesus
 *
 */
public class ShapeFactory {

	// Suprimimos el error para que no presente problemas en la compilacion
	@SuppressWarnings("unchecked")
	private static final HashMap circleMap = new HashMap<>();

	// Suprimimos el error para que no presente problemas en la compilacion
	@SuppressWarnings("unchecked")
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
