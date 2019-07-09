package com.lti.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.BookAuthorDao;
import com.lti.entity.Author;
import com.lti.entity.Book;
import com.lti.interfaces.BookManager;

@Component("bookManagerImpl")
public class BookManagerImplementation implements BookManager {

	@Autowired
	BookAuthorDao bookAuthorDao;
	
	@Transactional
	public void addNewBook(Book book) {
		bookAuthorDao.addNewBook(book);
	}

	@Transactional
	public void addNewAuthor(Author author) {
		bookAuthorDao.addNewAuthor(author);
	}
	
	
	public List<Book> getAvailableBooks() {
		return null;
	}
}
