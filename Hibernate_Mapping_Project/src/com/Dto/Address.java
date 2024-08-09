package com.Dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Address_11011")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_Id")
	private int address_Id;

	@Column(name = "address_Permanent")
	private String address_Permanent;

	@Column(name = "address_Temporary")
	private String address_Temporary;

	@Column(name = "State")
	private String State;

	@Column(name = "Country")
	private String Country;

	@Column(name = "Pin")
	private int Pin;

	@Column(name = "District")
	private String District;
	
	@ManyToMany(mappedBy = "address", cascade = CascadeType.ALL)
	private Set<Company> company;


	public Set<Company> getCompany() {
	    return company;
	}

	public void setCompany(Set<Company> company) {
	    this.company = company;
	}

	public int getAddress_Id() {
		return address_Id;
	}

	public void setAddress_Id(int address_Id) {
		this.address_Id = address_Id;
	}

	public String getAddress_Permanent() {
		return address_Permanent;
	}

	public void setAddress_Permanent(String address_Permanent) {
		this.address_Permanent = address_Permanent;
	}

	public String getAddress_Temporary() {
		return address_Temporary;
	}

	public void setAddress_Temporary(String address_Temporary) {
		this.address_Temporary = address_Temporary;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getPin() {
		return Pin;
	}

	public void setPin(int pin) {
		Pin = pin;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public void setCompany(Company company2) {
		// TODO Auto-generated method stub
		
	}

	
}
