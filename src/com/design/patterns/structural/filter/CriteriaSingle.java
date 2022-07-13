package com.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Paso 3. Clase CriteriaSingle concreta que implementa la interfaz Criteria
 * 
 * @author jesus
 *
 */
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}

		return singlePersons;
	}

}
