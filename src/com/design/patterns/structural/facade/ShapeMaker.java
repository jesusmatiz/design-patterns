package com.design.patterns.structural.facade;

/**
 * Paso 3: Creamos la clase facade
 * @author jesus
 *
 */
public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}

}
