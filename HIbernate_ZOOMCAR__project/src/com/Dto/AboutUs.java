package com.Dto;

import javax.persistence.*;

@Entity
@Table(name = "AboutUs")
public class AboutUs {

    @Id
    @Column(name = "AboutUsId")
    private int AboutUsId;

    @Column(name = "AboutZoomcar")
    private String AboutZoomcar_About;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account MyAccount;

    // Getters and Setters
    public int getAboutUsId() {
        return AboutUsId;
    }

    public void setAboutUsId(int aboutUsId) {
        AboutUsId = aboutUsId;
    }

    public String getAboutZoomcar_About() {
        return AboutZoomcar_About;
    }

    public void setAboutZoomcar_About(String aboutZoomcar_About) {
        AboutZoomcar_About = aboutZoomcar_About;
    }

    public My_Account getMyAccount() {
        return MyAccount;
    }

    public void setMyAccount(My_Account myAccount) {
        MyAccount = myAccount;
    }
}
