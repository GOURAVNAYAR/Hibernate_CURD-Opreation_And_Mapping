package com.Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Company_has_role")
public class Company_has_role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Company_has_role_Id")
    private int companyHasRoleId;

    @Column(name = "CompanyHasRole_Name")
    private String companyHasRoleName;

    @OneToMany(mappedBy = "companyHasRole", cascade = CascadeType.ALL)
    private Set<Role> roles;

    // Getters and setters

    public int getCompanyHasRoleId() {
        return companyHasRoleId;
    }

    public void setCompanyHasRoleId(int companyHasRoleId) {
        this.companyHasRoleId = companyHasRoleId;
    }

    public String getCompanyHasRoleName() {
        return companyHasRoleName;
    }

    public void setCompanyHasRoleName(String companyHasRoleName) {
        this.companyHasRoleName = companyHasRoleName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
