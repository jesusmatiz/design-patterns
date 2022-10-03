package com.design.patterns.structural.decorator;

/**
 * Paso 4.
 * Creamos la clase decorador que extienda de la clase ShapeDecorator
 * 
 * @author jesus
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
