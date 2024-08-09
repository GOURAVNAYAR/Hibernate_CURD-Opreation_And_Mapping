package com.Dto;

import javax.persistence.*;

@Entity
@Table(name = "HelpAndSupport")
public class HelpAndSupport {

    @Id
    @Column(name = "HelpAndSupportId")
    private int helpAndSupportId;

    @Column(name = "HelpAndSupportQ")
    private String helpAndSupportQ;

    @ManyToOne
    @JoinColumn(name = "myaccountId", nullable = false)
    private My_Account myAccount;

    // Getters and Setters

    public int getHelpAndSupportId() {
        return helpAndSupportId;
    }

    public void setHelpAndSupportId(int helpAndSupportId) {
        this.helpAndSupportId = helpAndSupportId;
    }

    public String getHelpAndSupportQ() {
        return helpAndSupportQ;
    }

    public void setHelpAndSupportQ(String helpAndSupportQ) {
        this.helpAndSupportQ = helpAndSupportQ;
    }

    public My_Account getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(My_Account myAccount) {
        this.myAccount = myAccount;
    }
}
