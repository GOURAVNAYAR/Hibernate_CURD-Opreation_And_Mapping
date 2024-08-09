package com.Dto;

import javax.persistence.*;

@Entity
@Table(name = "dtaMFM")
public class dtaMFM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddtaMFM")
    private int iddtaMFM;

    @Column(name = "vltPhR")
    private int vltPhR;

    @Column(name = "vltPhY")
    private int vltPhY;

    @Column(name = "vltPhB")
    private int vltPhB;

    @Column(name = "CurPhR")
    private int CurPhR;

    @Column(name = "CurPhY")
    private int CurPhY;

    @Column(name = "CurPhB")
    private int CurPhB;

    @Column(name = "CurLnR")
    private int CurLnR;

    @Column(name = "CurLnY")
    private int CurLnY;

    @Column(name = "CurLnB")
    private int CurLnB;

    @Column(name = "PwrAcR")
    private int PwrAcR;

    @Column(name = "PwrAcY")
    private int PwrAcY;

    @Column(name = "PwrAcB")
    private int PwrAcB;

    @Column(name = "PwrAcT")
    private int PwrAcT;

    @Column(name = "PwrReR")
    private int PwrReR;

    @Column(name = "PwrReY")
    private int PwrReY;

    @Column(name = "PwrReB")
    private int PwrReB;

    @Column(name = "PwrReT")
    private int PwrReT;

    @Column(name = "PwrApY")
    private int PwrApY;

    @Column(name = "PwrApB")
    private int PwrApB;

    @Column(name = "PwrApp")
    private int PwrApp;

    @Column(name = "PfAvrg")
    private int PfAvrg;

    @Column(name = "frAvHz")
    private int frAvHz;

    @Column(name = "enKWI")
    private int enKWI;

    @Column(name = "enKWE")
    private int enKWE;

    @Column(name = "dmMDIm")
    private int dmMDIm;

    @Column(name = "dmMdEx")
    private int dmMdEx;

    @ManyToOne
    @JoinColumn(name = "idcbism_substation", nullable = true)
    private cbism_substation_log cbismsubstationlog;

    // Getters and setters

    public int getIddtaMFM() {
        return iddtaMFM;
    }

    public void setIddtaMFM(int iddtaMFM) {
        this.iddtaMFM = iddtaMFM;
    }

    public int getVltPhR() {
        return vltPhR;
    }

    public void setVltPhR(int vltPhR) {
        this.vltPhR = vltPhR;
    }

    public int getVltPhY() {
        return vltPhY;
    }

    public void setVltPhY(int vltPhY) {
        this.vltPhY = vltPhY;
    }

    public int getVltPhB() {
        return vltPhB;
    }

    public void setVltPhB(int vltPhB) {
        this.vltPhB = vltPhB;
    }

    public int getCurPhR() {
        return CurPhR;
    }

    public void setCurPhR(int curPhR) {
        this.CurPhR = curPhR;
    }

    public int getCurPhY() {
        return CurPhY;
    }

    public void setCurPhY(int curPhY) {
        this.CurPhY = curPhY;
    }

    public int getCurPhB() {
        return CurPhB;
    }

    public void setCurPhB(int curPhB) {
        this.CurPhB = curPhB;
    }

    public int getCurLnR() {
        return CurLnR;
    }

    public void setCurLnR(int curLnR) {
        this.CurLnR = curLnR;
    }

    public int getCurLnY() {
        return CurLnY;
    }

    public void setCurLnY(int curLnY) {
        this.CurLnY = curLnY;
    }

    public int getCurLnB() {
        return CurLnB;
    }

    public void setCurLnB(int curLnB) {
        this.CurLnB = curLnB;
    }

    public int getPwrAcR() {
        return PwrAcR;
    }

    public void setPwrAcR(int pwrAcR) {
        this.PwrAcR = pwrAcR;
    }

    public int getPwrAcY() {
        return PwrAcY;
    }

    public void setPwrAcY(int pwrAcY) {
        this.PwrAcY = pwrAcY;
    }

    public int getPwrAcB() {
        return PwrAcB;
    }

    public void setPwrAcB(int pwrAcB) {
        this.PwrAcB = pwrAcB;
    }

    public int getPwrAcT() {
        return PwrAcT;
    }

    public void setPwrAcT(int pwrAcT) {
        this.PwrAcT = pwrAcT;
    }

    public int getPwrReR() {
        return PwrReR;
    }

    public void setPwrReR(int pwrReR) {
        this.PwrReR = pwrReR;
    }

    public int getPwrReY() {
        return PwrReY;
    }

    public void setPwrReY(int pwrReY) {
        this.PwrReY = pwrReY;
    }

    public int getPwrReB() {
        return PwrReB;
    }

    public void setPwrReB(int pwrReB) {
        this.PwrReB = pwrReB;
    }

    public int getPwrReT() {
        return PwrReT;
    }

    public void setPwrReT(int pwrReT) {
        this.PwrReT = pwrReT;
    }

    public int getPwrApY() {
        return PwrApY;
    }

    public void setPwrApY(int pwrApY) {
        this.PwrApY = pwrApY;
    }

    public int getPwrApB() {
        return PwrApB;
    }

    public void setPwrApB(int pwrApB) {
        this.PwrApB = pwrApB;
    }

    public int getPwrApp() {
        return PwrApp;
    }

    public void setPwrApp(int pwrApp) {
        this.PwrApp = pwrApp;
    }

    public int getPfAvrg() {
        return PfAvrg;
    }

    public void setPfAvrg(int pfAvrg) {
        this.PfAvrg = pfAvrg;
    }

    public int getFrAvHz() {
        return frAvHz;
    }

    public void setFrAvHz(int frAvHz) {
        this.frAvHz = frAvHz;
    }

    public int getEnKWI() {
        return enKWI;
    }

    public void setEnKWI(int enKWI) {
        this.enKWI = enKWI;
    }

    public int getEnKWE() {
        return enKWE;
    }

    public void setEnKWE(int enKWE) {
        this.enKWE = enKWE;
    }

    public int getDmMDIm() {
        return dmMDIm;
    }

    public void setDmMDIm(int dmMDIm) {
        this.dmMDIm = dmMDIm;
    }

    public int getDmMdEx() {
        return dmMdEx;
    }

    public void setDmMdEx(int dmMdEx) {
        this.dmMdEx = dmMdEx;
    }

    public cbism_substation_log getCbismsubstationlog() {
        return cbismsubstationlog;
    }

    public void setCbismsubstationlog(cbism_substation_log cbismsubstationlog) {
        this.cbismsubstationlog = cbismsubstationlog;
    }

	public void setIdcbism_substation(int i) {
		// TODO Auto-generated method stub
		
	}
}
