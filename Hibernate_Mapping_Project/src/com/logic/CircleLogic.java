package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Circle;
import com.Dto.Region;

public class CircleLogic {

    public static void main(String[] args) {

   	   AnnotationConfiguration cfg = new AnnotationConfiguration();
       cfg.configure("Hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction = session.beginTransaction();

        // Create and save a Region
        Region region = new Region();
        region.setRegionName("Sample Region");

        // Create Circles and set the Region for each Circle
        Circle circle = new Circle();
        circle.setCircleName("circle one");
        circle.setCircleAddress("inside of the Memory");
        circle.setRegion(region);

        Circle circle1 = new Circle();
        circle1.setCircleName("circle two");
        circle1.setCircleAddress("outside of the Memory");
        circle1.setRegion(region);

        // Save the Region and Circles
        session.save(region);
        session.save(circle);
        session.save(circle1);

        transaction.commit();
        session.close();
    }
}
