package com.lti.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AUTHOR")
public class Author {
	
	@Id
	@GeneratedValue
	@Column(name = "A_ID")
	private int id;
	@Column(name = "F_NAME")
	private String firstName;
	@Column(name = "L_NAME")
	private String lastName;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "author")
	private Set<Book> book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}


}
