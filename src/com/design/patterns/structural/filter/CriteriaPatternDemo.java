package com.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Parte 4.
 * Clase main para ejecutar los ejemplos
 * 
 * @author jesus
 *
 */
public class CriteriaPatternDemo {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleOrFemale = new OrCriteria(single, female);
		Criteria singleAndMale = new AndCriteria(single, male);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
		
		System.out.println("\nSingle And Males: ");
		printPersons(singleAndMale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}
