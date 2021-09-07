package com.design.patterns.creational.prototype;

/**
 * Paso 5: Verificamos el funcionamiento del patrón prototype
 * 
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Sep 6, 2021 7:32:22 PM
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

	}

}
