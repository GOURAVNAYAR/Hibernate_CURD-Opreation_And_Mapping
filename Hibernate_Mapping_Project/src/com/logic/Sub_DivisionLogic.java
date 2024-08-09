package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Region;
import com.Dto.Sub_Division;

public class Sub_DivisionLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create and save a Region
        Region region = new Region();
        region.setRegionName("Sample Region");

        // Create Sub_Divisions and set the Region for each Sub_Division
        Sub_Division subDivision1 = new Sub_Division();
        subDivision1.setSub_divisionName("Sub Division One");
        subDivision1.setSub_divisionAddress("Address One");
        subDivision1.setRegion(region);

        Sub_Division subDivision2 = new Sub_Division();
        subDivision2.setSub_divisionName("Sub Division Two");
        subDivision2.setSub_divisionAddress("Address Two");
        subDivision2.setRegion(region);

        // Save the Region and Sub_Divisions
        session.save(region); // This will also save the Sub_Divisions because of CascadeType.ALL

        transaction.commit();
        session.close();
    }
}
