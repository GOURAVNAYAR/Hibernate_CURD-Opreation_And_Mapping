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
@Table(name = "Circle_has_role")
public class Circle_has_role {

	@Id
	@Column(name = "Circle_has_roleId")
	private int Circle_has_roleId;


    @OneToMany(mappedBy = "divisionHasRole", cascade = CascadeType.ALL)
    private Set<Role> roles;

	
	public int getCircle_has_roleId() {
		return Circle_has_roleId;
	}

	public void setCircle_has_roleId(int circle_has_roleId) {
		Circle_has_roleId = circle_has_roleId;
	}

}
