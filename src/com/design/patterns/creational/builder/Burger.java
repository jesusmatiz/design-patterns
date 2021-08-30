package com.design.patterns.creational.builder;

/**
 * Paso 3: Creamos las clases abstractas que implementaran la interface
 * Item y las funcionalidades por defecto
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Aug 29, 2021 8:07:13 PM
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
