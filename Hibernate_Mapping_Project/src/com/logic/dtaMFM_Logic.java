package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.cbism_substation_log;
import com.Dto.dtaMFM;

public class dtaMFM_Logic {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            factory = cfg.buildSessionFactory();
            session = factory.openSession();
            transaction = session.beginTransaction();
            
            // Create and save entities
            cbism_substation_log substationLog = new cbism_substation_log();
            substationLog.setDevID(123);
            substationLog.setPassword("password");
            substationLog.setVolDC1(10);
            substationLog.setCbism_substation_logcol(1);
            substationLog.setRtDate("2024-05-26");
            substationLog.setTem_pC1(30);
            session.save(substationLog);
            
            dtaMFM mfm = new dtaMFM();
            mfm.setCurLnB(10);
            mfm.setCurLnR(20);
            mfm.setCurLnY(30);
            mfm.setCurPhB(40);
            mfm.setCurPhR(50);
            mfm.setCurPhY(60);
            mfm.setPfAvrg(70);
            mfm.setPwrAcB(80);
            mfm.setPwrAcR(90);
            mfm.setPwrAcT(100);
            mfm.setPwrAcY(110);
            mfm.setPwrApB(120);
            mfm.setPwrApY(130);
            mfm.setPwrApp(140);
            mfm.setPwrReB(150);
            mfm.setPwrReR(160);
            mfm.setPwrReT(170);
            mfm.setPwrReY(180);
            mfm.setIdcbism_substation(1); // Assume substation id
            mfm.setDmMDIm(190);
            mfm.setDmMdEx(200);
            mfm.setEnKWE(210);
            mfm.setEnKWI(220);
            mfm.setFrAvHz(230);
            mfm.setVltPhB(240);
            mfm.setVltPhR(250);
            mfm.setVltPhY(260);
            mfm.setCbismsubstationlog(substationLog); // Link the substation log
            session.save(mfm);
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
            if (factory != null) factory.close();
        }
    }
}
