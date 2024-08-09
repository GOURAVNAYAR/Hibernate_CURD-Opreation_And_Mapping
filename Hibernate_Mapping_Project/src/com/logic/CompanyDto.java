package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Address;
import com.Dto.Company;


public class CompanyDto {

    public static void main(String[] args) {

    	   AnnotationConfiguration cfg = new AnnotationConfiguration();
           cfg.configure("Hibernate.cfg.xml");
           SessionFactory factory = cfg.buildSessionFactory();
           Session session = factory.openSession();
           Transaction transaction = session.beginTransaction();

        Company company = new Company();
        company.setCompany_Contact(88267814);
        company.setCompany_Email("company11@gmail.com");
        company.setCompany_Name("Gourav Nayar");
        company.setCompany_initials("Gourav");
       

        Company company1 = new Company();
        company1.setCompany_Contact(88267815);
        company1.setCompany_Email("company22@gmail.com");
        company1.setCompany_Name("Ankur Nayar");
        company1.setCompany_initials("Ankur");

        Address address = new Address();
        address.setAddress_Permanent("LIG Square");
        address.setAddress_Temporary("LIG Square");
        address.setCountry("India");
        address.setDistrict("Indore");
        address.setPin(451447);
        address.setState("Indore");

        Address address1 = new Address();
        address1.setAddress_Permanent("Vijay Square");
        address1.setAddress_Temporary("Vijay Square");
        address1.setCountry("India");
        address1.setDistrict("Indore");
        address1.setPin(451447);
        address1.setState("Indore");

        address.setCompany(company);
        address1.setCompany(company1);

        session.save(company);
        session.save(company1);
        session.save(address);
        session.save(address1);

        transaction.commit();
        session.close();
    }
}