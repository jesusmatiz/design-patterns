package com.design.patterns.creational.builder;

/**
 * Paso 4: Creamos las clases que extenderan de Burger y de ColdDrink
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Aug 29, 2021 8:08:07 PM
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
