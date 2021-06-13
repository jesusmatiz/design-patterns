package com.design.patterns.creational.factory;

import java.util.Objects;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		
		Shape shape;
		
		if (Objects.isNull(shapeType)) {
			shape = null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE" )) {
			
			shape = new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE" )) {
			shape = new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE" )) {
			shape = new Square();
		} else {
			shape = null;
		}
		
		return shape;		
	}

}
