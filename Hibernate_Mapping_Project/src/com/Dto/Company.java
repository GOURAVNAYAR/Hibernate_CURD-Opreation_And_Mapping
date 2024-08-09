package com.Dto;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Company_11011")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_Id")
    private int company_Id;

    @Column(name = "company_Name")
    private String company_Name;

    @Column(name = "company_Email")
    private String company_Email;

    @Column(name = "company_Contact")
    private int company_Contact;

    @Column(name = "company_initials")
    private String company_initials;

    @ManyToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Address_Company",
        joinColumns = @JoinColumn(name = "company_Id"),
        inverseJoinColumns = @JoinColumn(name = "address_Id")
    )
    private Set<Address> address;

    @ManyToOne(targetEntity = Region.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "regionId")
    private Region region;

    @ManyToOne(targetEntity = Company_has_role.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Company_has_role_Id")
    private Company_has_role companyHasRole;

    // Getters and setters

    public int getCompany_Id() {
        return company_Id;
    }

    public void setCompany_Id(int company_Id) {
        this.company_Id = company_Id;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getCompany_Email() {
        return company_Email;
    }

    public void setCompany_Email(String company_Email) {
        this.company_Email = company_Email;
    }

    public int getCompany_Contact() {
        return company_Contact;
    }

    public void setCompany_Contact(int company_Contact) {
        this.company_Contact = company_Contact;
    }

    public String getCompany_initials() {
        return company_initials;
    }

    public void setCompany_initials(String company_initials) {
        this.company_initials = company_initials;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Company_has_role getCompanyHasRole() {
        return companyHasRole;
    }

    public void setCompanyHasRole(Company_has_role companyHasRole) {
        this.companyHasRole = companyHasRole;
    }
}
