package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "bank_details_id")
	private long bank_details_id;
	private String bank_name;
	private long acc_no;
	private String ifsc_code;

}
