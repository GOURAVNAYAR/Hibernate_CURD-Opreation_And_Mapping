package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Division;
import com.Dto.Region;

public class DivisionLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create and save a Region
        Region region = new Region();
        region.setRegionName("Sample Region");

        // Create Divisions and set the Region for each Division
        Division division1 = new Division();
        division1.setDivisionName("Division One");
        division1.setDivisionAddress("Address One");
        division1.setRegion(region);

        Division division2 = new Division();
        division2.setDivisionName("Division Two");
        division2.setDivisionAddress("Address Two");
        division2.setRegion(region);

        // Save the Region and Divisions
        session.save(region); // This will also save the Divisions because of CascadeType.ALL

        transaction.commit();
        session.close();
    }
}
