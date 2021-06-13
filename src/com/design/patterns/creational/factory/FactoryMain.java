package com.design.patterns.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

	}

}
