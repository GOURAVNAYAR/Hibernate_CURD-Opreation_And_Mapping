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
@Table(name = "Sub_Division")
public class Sub_Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_DivisionId")
    private int sub_divisionId;

    @Column(name = "sub_DivisionName")
    private String sub_divisionName;

    @Column(name = "sub_DivisionAddress")
    private String sub_divisionAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "regionId")
    private Region region;

    public int getSub_divisionId() {
        return sub_divisionId;
    }

    public void setSub_divisionId(int sub_divisionId) {
        this.sub_divisionId = sub_divisionId;
    }

    public String getSub_divisionName() {
        return sub_divisionName;
    }

    public void setSub_divisionName(String sub_divisionName) {
        this.sub_divisionName = sub_divisionName;
    }

    public String getSub_divisionAddress() {
        return sub_divisionAddress;
    }

    public void setSub_divisionAddress(String sub_divisionAddress) {
        this.sub_divisionAddress = sub_divisionAddress;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
