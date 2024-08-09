package com.Logic;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.My_Account;
import com.Dto.HelpAndSupport;

public class HelpAndSupportLogic {

    public static void main(String[] args) {
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create My_Account instance
        My_Account account = new My_Account();
        account.setMyaccountId(1);
        account.setEmail("test@example.com");
        account.setMobileNumber(1234567890L);
        account.setName("John Doe");
        account.setGender("Male");
        account.setCurrentCity("New York");
        account.setPassword(12345L);
        account.setLicenseNumber(987654);

        // Create HelpAndSupport instances
        HelpAndSupport support1 = new HelpAndSupport();
        support1.setHelpAndSupportQ("How to rent a car?");
        support1.setMyAccount(account);

        HelpAndSupport support2 = new HelpAndSupport();
        support2.setHelpAndSupportQ("What are the rental charges?");
        support2.setMyAccount(account);

        // Add HelpAndSupport to account
        account.setHelpAndSupport(Set.of(support1, support2));

        // Save account (which will cascade and save HelpAndSupport)
        session.save(account);

        transaction.commit();
        session.close();
    }
}
