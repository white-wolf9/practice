package com.lti.interfaces;

import java.util.List;

import com.lti.entity.Author;
import com.lti.entity.Book;

public interface BookManager {

	public void addNewBook(Book book);
	public void addNewAuthor(Author author);
	public List<Book> getAvailableBooks();
}
