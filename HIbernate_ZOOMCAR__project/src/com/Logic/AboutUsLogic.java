package com.Logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.AboutUs;
import com.Dto.My_Account;

public class AboutUsLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        My_Account mya = new My_Account();
        mya.setMyaccountId(1055);
        mya.setEmail("nayar@gmail.com");  // Corrected email format
        mya.setGender("Male");
        mya.setLicenseNumber(204578);  // Corrected spelling
        mya.setMobileNumber(992689046);
        mya.setName("Gourav Nayar");
        mya.setPassword(12279);
        mya.setCurrentCity("Timarni");

        AboutUs aboutUs = new AboutUs();
        aboutUs.setAboutUsId(11);
        aboutUs.setAboutZoomcar_About("Zoomcar.");
        aboutUs.setMyAccount(mya);

        Set<AboutUs> bd = new HashSet<>();
        bd.add(aboutUs);

        mya.setAboutUs(bd);
        session.save(mya);

        transaction.commit();
        session.close();
    }
}
