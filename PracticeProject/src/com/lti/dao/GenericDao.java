package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class GenericDao {

	@PersistenceContext
	protected EntityManager entityManager;
	
	public void addNewObject(Object object) {
		entityManager.merge(object);
	}
	
	public Object fetchObjectById(Class classname, int primaryKey) {
		return entityManager.find(classname, primaryKey);
	}
}
