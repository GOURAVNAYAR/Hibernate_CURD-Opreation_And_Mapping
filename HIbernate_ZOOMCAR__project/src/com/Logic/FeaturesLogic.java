package com.Logic;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Car_Detals;
import com.Dto.Features;

public class FeaturesLogic {

    public static void main(String[] args) {
        // Load configuration and build session factory
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Create session and transaction
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create instances of Car_Detals and Features
        Car_Detals car1 = new Car_Detals();
        car1.setCardetals("Sedan");

        Features feature1 = new Features();
        feature1.setCarFeatures("Sunroof");

        // Establish relationship
        car1.setFeatures(new HashSet<>());
        car1.getFeatures().add(feature1);

        feature1.setCardetals(new HashSet<>());
        feature1.getCardetals().add(car1);

        // Save objects to database
        session.save(car1);
        session.save(feature1);

        // Commit transaction
        transaction.commit();

        // Close session
        session.close();
        factory.close();
    }
}
