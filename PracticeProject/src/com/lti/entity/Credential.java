package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Credential {

	
	@Id
	@GeneratedValue
	@Column(name = "credential_id")
	private long credential_id;
	private String user_name;
	private String password;
}
