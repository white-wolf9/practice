package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDao {
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	public Object findAnything(Class classname, int id) {
		return entityManager.find(classname, id);
	}

}
