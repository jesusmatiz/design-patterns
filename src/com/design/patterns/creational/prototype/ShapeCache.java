package com.design.patterns.creational.prototype;

import java.util.Hashtable;

/**
 * Paso 3: Creamos la clase que obtendra los datos de la base de datos
 * y almacenara en unas Hashtable
 * 
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Sep 6, 2021 7:31:30 PM
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}

}
