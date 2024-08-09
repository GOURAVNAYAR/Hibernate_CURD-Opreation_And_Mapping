package com.Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleId")
    private int roleId;

    @Column(name = "roleCreate")
    private String roleCreate;

    @Column(name = "roleUpdate")
    private String roleUpdate;

    @Column(name = "roleRead")
    private String roleRead;

    @Column(name = "roleDelete")
    private String roleDelete;

    @ManyToOne
    @JoinColumn(name = "User_has_roleId")
    private User_has_role userHasRole;

    @ManyToOne
    @JoinColumn(name = "Company_has_roleId")
    private Company_has_role companyHasRole;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Distcenter_zone_has_role> distcenterZoneHasRole;

    @ManyToOne
    @JoinColumn(name = "divisionHasRoleId", nullable = true)
    private Division_has_role divisionHasRole; // This property should match the mappedBy attribute in Division_has_role

    @ManyToOne
    @JoinColumn(name = "Circle_has_roleId", nullable = true)
    private Circle_has_role Circle_has_role; // This property should match the mappedBy attribute in Division_has_role
    
    public Region_has_role getRegionhasrole() {
		return regionhasrole;
	}

	public void setRegionhasrole(Region_has_role regionhasrole) {
		this.regionhasrole = regionhasrole;
	}

	public Circle_has_role getCircle_has_role() {
		return Circle_has_role;
	}

	@ManyToOne
    @JoinColumn(name = "Region_has_roleId", nullable = true)
    private Region_has_role regionhasrole; // This property should match the mappedBy attribute in Division_has_role
    

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleCreate() {
        return roleCreate;
    }

    public void setRoleCreate(String roleCreate) {
        this.roleCreate = roleCreate;
    }

    public String getRoleUpdate() {
        return roleUpdate;
    }

    public void setRoleUpdate(String roleUpdate) {
        this.roleUpdate = roleUpdate;
    }

    public String getRoleRead() {
        return roleRead;
    }

    public void setRoleRead(String roleRead) {
        this.roleRead = roleRead;
    }

    public String getRoleDelete() {
        return roleDelete;
    }

    public void setRoleDelete(String roleDelete) {
        this.roleDelete = roleDelete;
    }

    public User_has_role getUserHasRole() {
        return userHasRole;
    }

    public void setUserHasRole(User_has_role userHasRole) {
        this.userHasRole = userHasRole;
    }

    public Company_has_role getCompanyHasRole() {
        return companyHasRole;
    }

    public void setCompanyHasRole(Company_has_role companyHasRole) {
        this.companyHasRole = companyHasRole;
    }

    public Set<Distcenter_zone_has_role> getDistcenterZoneHasRole() {
        return distcenterZoneHasRole;
    }

    public void setDistcenterZoneHasRole(Set<Distcenter_zone_has_role> distcenterZoneHasRole) {
        this.distcenterZoneHasRole = distcenterZoneHasRole;
    }

    public Division_has_role getDivisionHasRole() {
        return divisionHasRole;
    }

    public void setDivisionHasRole(Division_has_role divisionHasRole) {
        this.divisionHasRole = divisionHasRole;
    }

	public void setCircle_has_role(com.Dto.Circle_has_role circleHasRole) {
		// TODO Auto-generated method stub
		
	}
}
