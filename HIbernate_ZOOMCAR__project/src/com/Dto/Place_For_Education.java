package com.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Place_For_Education")
public class Place_For_Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PlaceForEducationId")
	private int PlaceForEducationId;
	
	@Column(name = "Place_For_EducationAbout")
	private String Place_For_EducationAbout;
}
