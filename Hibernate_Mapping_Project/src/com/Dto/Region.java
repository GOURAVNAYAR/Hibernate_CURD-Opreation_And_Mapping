package com.Dto;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Region_22022")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "regionId")
	private int regionId;

	@Column(name = "regionName")
	private String regionName;

	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
	private Set<Circle> circles;

	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
	private Set<Division> divisions;

	@OneToMany(mappedBy = "region", cascade = CascadeType.ALL)
	private Set<Sub_Division> sub_Division;

	public int getRegionId() {
		return regionId;
	}

	public Set<Sub_Division> getSub_Division() {
		return sub_Division;
	}

	public void setSub_Division(Set<Sub_Division> sub_Division) {
		this.sub_Division = sub_Division;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public void setSubDivisions(Set<Sub_Division> of) {
		// TODO Auto-generated method stub
		
	}

}
