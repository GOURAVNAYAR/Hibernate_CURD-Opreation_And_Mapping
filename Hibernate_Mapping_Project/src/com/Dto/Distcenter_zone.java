package com.Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Division_has_role")
public class Distcenter_zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Division_has_roleId")
    private int distcenter_zoneId;

    @Column(name = "distcenter_zoneName")
    private String distcenter_zoneName; // Corrected column name

    @Column(name = "distcenter_zoneAddress")
    private String distcenter_zoneAddress;

    @OneToMany(mappedBy = "distcenter_zone", fetch = FetchType.LAZY, cascade = CascadeType.ALL) // Corrected mappedBy attribute
    private Set<Distcenter_zone_has_role> distcenterZoneHasRole;

	public int getDistcenter_zoneId() {
		return distcenter_zoneId;
	}

	public void setDistcenter_zoneId(int distcenter_zoneId) {
		this.distcenter_zoneId = distcenter_zoneId;
	}

	public String getDistcenter_zoneName() {
		return distcenter_zoneName;
	}

	public void setDistcenter_zoneName(String distcenter_zoneName) {
		this.distcenter_zoneName = distcenter_zoneName;
	}

	public String getDistcenter_zoneAddress() {
		return distcenter_zoneAddress;
	}

	public void setDistcenter_zoneAddress(String distcenter_zoneAddress) {
		this.distcenter_zoneAddress = distcenter_zoneAddress;
	}

	public Set<Distcenter_zone_has_role> getDistcenterZoneHasRole() {
		return distcenterZoneHasRole;
	}

	public void setDistcenterZoneHasRole(Set<Distcenter_zone_has_role> distcenterZoneHasRole) {
		this.distcenterZoneHasRole = distcenterZoneHasRole;
	}

    // Getters and setters

}
