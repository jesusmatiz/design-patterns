package com.design.patterns.structural.filter;

import java.util.List;

/**
 * Paso 3. Clase AndCriteria concreta que implementa la interfaz Criteria
 * 
 * @author jesus
 *
 */
public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;	
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
