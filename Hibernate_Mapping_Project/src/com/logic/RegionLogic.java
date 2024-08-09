package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Company;
import com.Dto.Region;

public class RegionLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create and save a Region
        Region region = new Region();
        region.setRegionName("Sample Region");

        // Create and save Companies
        Company company1 = new Company();
        company1.setCompany_Contact(88267814);
        company1.setCompany_Email("company11@gmail.com");
        company1.setCompany_Name("Gourav Nayar");
        company1.setCompany_initials("Gourav");
       company1.setRegion(region); // Associate with the region

        Company company2 = new Company();
        company2.setCompany_Contact(88267815);
        company2.setCompany_Email("company22@gmail.com");
        company2.setCompany_Name("Ankur Nayar");
        company2.setCompany_initials("Ankur");
      company2.setRegion(region); // Associate with the region

        session.save(company1);
        session.save(company2);

        transaction.commit();
        session.close();
    }
}
