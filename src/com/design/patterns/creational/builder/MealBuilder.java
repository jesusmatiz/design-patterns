package com.design.patterns.creational.builder;

/**
 * Paso 6: Creamos la clase MealBuilder, la cual tendra la responsabilidad de crear 
 * los objetos del Meal
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Aug 29, 2021 8:09:40 PM
 */
public class MealBuilder {
	
	public Meal prepareVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
