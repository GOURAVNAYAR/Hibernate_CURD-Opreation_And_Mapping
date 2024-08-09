package com.Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Division_has_role")
public class Division_has_role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Division_has_roleId")
    private int divisionHasRoleId;

    @Column(name = "DivisionHasRoleName")
    private String divisionHasRoleName;

    @OneToMany(mappedBy = "divisionHasRole", cascade = CascadeType.ALL)
    private Set<Role> roles;

    // Getters and setters

    public int getDivisionHasRoleId() {
        return divisionHasRoleId;
    }

    public void setDivisionHasRoleId(int divisionHasRoleId) {
        this.divisionHasRoleId = divisionHasRoleId;
    }

    public String getDivisionHasRoleName() {
        return divisionHasRoleName;
    }

    public void setDivisionHasRoleName(String divisionHasRoleName) {
        this.divisionHasRoleName = divisionHasRoleName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
