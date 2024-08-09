package com.Dto;

import javax.persistence.*;

@Entity
@Table(name = "Distcenter_zone_has_role")
public class Distcenter_zone_has_role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DistcenterId")
	private int distcenterId;

	@ManyToOne
	@JoinColumn(name = "roleId", nullable = false)
	private Role role;

	@ManyToOne
	@JoinColumn(name = "distcenter_zoneId", nullable = false)
	private Distcenter_zone distcenter_zone; // Corrected property name

	public int getDistcenterId() {
		return distcenterId;
	}

	public void setDistcenterId(int distcenterId) {
		this.distcenterId = distcenterId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Distcenter_zone getDistcenter_zone() {
		return distcenter_zone;
	}

	public void setDistcenter_zone(Distcenter_zone distcenter_zone) {
		this.distcenter_zone = distcenter_zone;
	}

}
