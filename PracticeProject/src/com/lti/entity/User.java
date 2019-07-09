package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	private String name;
	private String email;
	private long phone_no;
	
	@OneToOne
	@JoinColumn(name = "card_id")
	private Card card;
	
	@OneToOne
	@JoinColumn(name = "bank_details_id")
	private BankDetails bank;
	
	@OneToOne
	@JoinColumn(name = "credential_id")
	private Credential credential;
	
	@OneToOne
	@JoinColumn(name= "address_id")
	private Address address;

}
