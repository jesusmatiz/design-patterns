package com.design.patterns.structural.proxy;

/**
 * Paso 2: Creamos la clase que implementa la interface Image
 * 
 * @author jesus
 *
 */
public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
