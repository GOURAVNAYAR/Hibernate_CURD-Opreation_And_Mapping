package com.Dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Division")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "divisionId")
    private int divisionId;

    @Column(name = "divisionName")
    private String divisionName;

    @Column(name = "divisionAddress")
    private String divisionAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "regionId")
    private Region region;

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDivisionAddress() {
        return divisionAddress;
    }

    public void setDivisionAddress(String divisionAddress) {
        this.divisionAddress = divisionAddress;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
