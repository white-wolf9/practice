package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.lti.entity.Author;
import com.lti.entity.Book;

@Component
public class BookAuthorDao extends GenericDao{
	
	public void addNewBook(Book book) {
		entityManager.persist(book);
	}
	
	public void addNewAuthor(Author author) {
		entityManager.persist(author);
	}

}
