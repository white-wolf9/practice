package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.lti.enums.CardTypes;

@Entity
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
}
