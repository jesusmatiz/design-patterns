package com.design.patterns.structural.decorator;

/**
 * Creamos la clase abstracta decorador que implementa la interfaz Shape
 * 
 * @author jesus
 *
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		
		decoratedShape.draw();
	}

}
