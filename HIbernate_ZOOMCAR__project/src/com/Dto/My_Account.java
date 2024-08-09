package com.Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "My_Account")
public class My_Account {

    @Id
    @Column(name = "myaccountId")
    private int myaccountId;

    @Column(name = "Email")
    private String email;

    @Column(name = "mobileNumber")
    private long mobileNumber;

    @Column(name = "Name")
    private String name;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "currentCity")
    private String currentCity;

    @Column(name = "password")
    private long password;

    @Column(name = "licenseNumber")  // Corrected spelling
    private int licenseNumber;

    @OneToMany(mappedBy = "MyAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book_Car_For_Day> bookCarForDay;

    @OneToMany(mappedBy = "MyAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Book_Car_For_Mounth> bookCarForMounth;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Rent_A_Car> rentACar;

    @OneToMany(mappedBy = "MyAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Popular_place> popularplace;

    @OneToMany(mappedBy = "MyAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<AboutUs> aboutUs;

    @OneToMany(mappedBy = "myAccount", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<HelpAndSupport> helpAndSupport;
    
    // Getters and Setters
    public int getMyaccountId() {
        return myaccountId;
    }

    public void setMyaccountId(int myaccountId) {
        this.myaccountId = myaccountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

	public void setAboutUs(Set<AboutUs> bd) {
		// TODO Auto-generated method stub
		
	}
	
	public void setBookCarForMounth(Set<Book_Car_For_Mounth> bd) {
		// TODO Auto-generated method stub
		
	}

	public void setHelpAndSupport(Set<HelpAndSupport> of) {
		// TODO Auto-generated method stub
		
	}
}
   
