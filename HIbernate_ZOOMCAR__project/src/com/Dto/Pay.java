package com.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pay")
public class Pay {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payId")
	private int payId;
	
	@Column(name = "creditAtmcard")
	private String creditAtmcard;
	
	@Column(name = "Mobile")
	private String Mobile;
	
	@Column(name = "NetBanking")
	private String NetBanking; 
	
	
}
