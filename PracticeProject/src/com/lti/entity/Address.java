package com.lti.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private long address_id;
	private String city;
	private long pincode;
	private String street;
	private String doorNo;
	
}
