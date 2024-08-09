package com.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Professional_Place")
public class Professional_Place {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProfessionalPlaceId")
	private int ProfessionalPlaceId;
	
	@Column(name = "ProfessionalPlaceAbout")
	private String ProfessionalPlaceAbout;
}
