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
@Table(name = "circle")
public class Circle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "circleId")
    private int circleId;

    @Column(name = "circleName")
    private String circleName;

    @Column(name = "circleAddress")
    private String circleAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "regionId")
    private Region region;

    public int getCircleId() {
        return circleId;
    }

    public void setCircleId(int circleId) {
        this.circleId = circleId;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public String getCircleAddress() {
        return circleAddress;
    }

    public void setCircleAddress(String circleAddress) {
        this.circleAddress = circleAddress;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
