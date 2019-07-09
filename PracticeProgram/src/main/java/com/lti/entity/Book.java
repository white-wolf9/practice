package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Generated;

@Entity
@Table(name = "TBL_BOOK")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "B_ID")
	private int id;
	@Column(name = "B_NAME")
	private String name;
	@Column(name = "B_DESC")
	private String description;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "A_ID")
	private Author author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
