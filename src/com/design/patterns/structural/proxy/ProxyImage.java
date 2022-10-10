package com.design.patterns.structural.proxy;

/**
 * Paso 2: Creamos la clase que nos servira como proxy
 * @author jesus
 *
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
