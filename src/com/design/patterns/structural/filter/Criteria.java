package com.design.patterns.structural.filter;

import java.util.List;

/**
 * Paso 2.
 * Interfaz para los criterios
 * 
 * @author jesus
 *
 */
public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);
}
