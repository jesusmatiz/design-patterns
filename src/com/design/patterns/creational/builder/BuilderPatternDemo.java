package com.design.patterns.creational.builder;

/**
 * Paso 7: Creamos la clase Main para hacer la demostracion
 * del patron Builder
 * @author Jesus Matiz <jesusmatiz35@gmail.com>
 *
 * @date Aug 29, 2021 8:10:33 PM
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
