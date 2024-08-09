package com.Dto;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cbism_substation_log")
public class cbism_substation_log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcbism_substation")
    private int idcbism_substation;

    @Column(name = "DevID")
    private int DevID;

    @Column(name = "Password")
    private String Password;

    @Column(name = "rtDate")
    private String rtDate;

    @Column(name = "VolDC1")
    private int VolDC1;

    @Column(name = "tem_pC1")
    private int tem_pC1;

    @Column(name = "cbism_substation_logcol")
    private int cbism_substation_logcol;

    @OneToMany(mappedBy = "cbismsubstationlog", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<dtaMFM> dtaMFMSet;

    // Getters and setters

    public int getIdcbism_substation() {
        return idcbism_substation;
    }

    public void setIdcbism_substation(int idcbism_substation) {
        this.idcbism_substation = idcbism_substation;
    }

    public int getDevID() {
        return DevID;
    }

    public void setDevID(int devID) {
        DevID = devID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRtDate() {
        return rtDate;
    }

    public void setRtDate(String rtDate) {
        this.rtDate = rtDate;
    }

    public int getVolDC1() {
        return VolDC1;
    }

    public void setVolDC1(int volDC1) {
        VolDC1 = volDC1;
    }

    public int getTem_pC1() {
        return tem_pC1;
    }

    public void setTem_pC1(int tem_pC1) {
        this.tem_pC1 = tem_pC1;
    }

    public int getCbism_substation_logcol() {
        return cbism_substation_logcol;
    }

    public void setCbism_substation_logcol(int cbism_substation_logcol) {
        this.cbism_substation_logcol = cbism_substation_logcol;
    }

    public Set<dtaMFM> getDtaMFMSet() {
        return dtaMFMSet;
    }

    public void setDtaMFMSet(Set<dtaMFM> dtaMFMSet) {
        this.dtaMFMSet = dtaMFMSet;
    }
}
