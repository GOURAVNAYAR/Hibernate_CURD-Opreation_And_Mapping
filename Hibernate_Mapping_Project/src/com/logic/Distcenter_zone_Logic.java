package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Distcenter_zone;
import com.Dto.Distcenter_zone_has_role;

public class Distcenter_zone_Logic {

    public static void main(String[] args) {
        // Configure Hibernate
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Create a new Distcenter_zone entity
            Distcenter_zone distcenterZone = new Distcenter_zone();
            distcenterZone.setDistcenter_zoneName("Sample Zone");
            distcenterZone.setDistcenter_zoneAddress("Sample Address");

            // Save the Distcenter_zone entity
            session.save(distcenterZone);

            // Commit the transaction
            transaction.commit();
            System.out.println("Distcenter_zone entity saved successfully.");
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }
    }
}
