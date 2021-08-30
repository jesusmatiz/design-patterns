package com.design.patterns.creational.builder;

/**
 * Paso 1: Crear la interface que representara los Items
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Aug 29, 2021 8:04:40 PM
 */
public interface Item {

	String name();
	Packing packing();
	float price();
}
