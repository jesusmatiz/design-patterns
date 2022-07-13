package com.design.patterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Paso 3.
 * Clase CriteriaMale concreta que implementa la interfaz Criteria
 * 
 * @author jesus
 *
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> malePersons = new ArrayList<Person>();
		
		for (Person person: persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		
		return malePersons;
	}

}
