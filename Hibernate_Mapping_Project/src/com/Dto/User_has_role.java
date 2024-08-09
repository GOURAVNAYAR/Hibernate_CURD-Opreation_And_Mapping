package com.Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "User_has_role")
public class User_has_role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_has_roleId")
    private int user_has_roleId;

    @Column(name = "UserName")
    private String userName;

    @OneToMany(mappedBy = "userHasRole", cascade = CascadeType.ALL)
    private Set<Role> roles;

    // Getters and setters

    public int getUser_has_roleId() {
        return user_has_roleId;
    }

    public void setUser_has_roleId(int user_has_roleId) {
        this.user_has_roleId = user_has_roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
