package com.lti.entity;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;

public class Product {

	private String name;
	private String description;
	private int id;
	private InputStream image;
	/* private Image image; */
	
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
	public InputStream getImage() {
		return image;
	}
	public void setImage(InputStream image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
