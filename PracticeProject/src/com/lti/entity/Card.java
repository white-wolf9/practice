package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lti.enums.CardTypes;

@Entity
@Table(name = "TBL_PROJ_CARD")
public class Card {
	
	@Id
	@GeneratedValue
	@Column(name = "card_id")
	private long card_id;
	private String name;
	private long card_no;
	private int month;
	private int year;
	private CardTypes type;
	

	@OneToOne
	@JoinColumn(name = "U_ID")
	private User user;
}
