package com.design.patterns.structural.facade;

/**
 * Paso 4: Usamos la clase facade para dibujar varios tipos de figuras
 * @author jesus
 *
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
