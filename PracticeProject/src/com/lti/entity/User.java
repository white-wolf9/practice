package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROJ_USER")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "U_ID")
	private long u_id;
	private String name;
	private String email;
	private long phone_no;
	
	@OneToOne(mappedBy = "user",fetch =FetchType.EAGER,  cascade = CascadeType.ALL)
	private Card card;
	
	@OneToOne(mappedBy = "user",fetch =FetchType.EAGER,  cascade = CascadeType.ALL)
	private BankDetails bank;
	
	@OneToOne(mappedBy = "user",fetch =FetchType.EAGER,  cascade = CascadeType.ALL)
	private Credential credential;
	
	@OneToOne(mappedBy = "user",fetch =FetchType.EAGER,  cascade = CascadeType.ALL)
	private Address address;

}
