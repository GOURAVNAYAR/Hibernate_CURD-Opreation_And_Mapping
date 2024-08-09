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
@Table(name = "Region_has_role")
public class Region_has_role {

	@Id
	@Column(name = "Region_has_roleId")
	private int Region_has_roleId;

	@OneToMany(mappedBy = "regionhasrole", cascade = CascadeType.ALL)
    private Set<Role> roles;
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public int getRegion_has_roleId() {
		return Region_has_roleId;
	}

	public void setRegion_has_roleId(int region_has_roleId) {
		Region_has_roleId = region_has_roleId;
	}

}
