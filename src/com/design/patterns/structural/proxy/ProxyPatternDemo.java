package com.design.patterns.structural.proxy;

/**
 * Paso 3: Creamos la clase que usara el ProxyImage cuando la clase lo requiera
 * 
 * @author jesus
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}

}
