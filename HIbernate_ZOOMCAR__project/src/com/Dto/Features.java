package com.Dto;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Features")
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "featuresId")
    private int featuresId;

    @Column(name = "carFeatures")
    private String carFeatures;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "CAR_FEATURES",
        joinColumns = @JoinColumn(name = "featuresId"),
        inverseJoinColumns = @JoinColumn(name = "cardetalsId")
    )
    private Set<Car_Detals> cardetals;

    public int getFeaturesId() {
        return featuresId;
    }

    public void setFeaturesId(int featuresId) {
        this.featuresId = featuresId;
    }

    public String getCarFeatures() {
        return carFeatures;
    }

    public void setCarFeatures(String carFeatures) {
        this.carFeatures = carFeatures;
    }

    public Set<Car_Detals> getCardetals() {
        return cardetals;
    }

    public void setCardetals(Set<Car_Detals> cardetals) {
        this.cardetals = cardetals;
    }
}
