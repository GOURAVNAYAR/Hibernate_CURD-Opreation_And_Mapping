package com.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Favourites_car")
public class Favourites_car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FavouritescarId")
	private int FavouritescarId;
	
	@Column(name = "FavouritescarName")
	private String FavouritescarName;
}
