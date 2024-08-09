package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Circle_has_role;
import com.Dto.Role;

public class Circle_has_roleLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Create a new Role entity
            Role role1 = new Role();
            role1.setRoleCreate("24-10-2020");
            role1.setRoleUpdate("02-04-2022");
            role1.setRoleRead("09-09-2022");
            role1.setRoleDelete("11-12-2023");
            
            // Create a new Circle_has_role entity
            Circle_has_role circleHasRole = new Circle_has_role();
            circleHasRole.setCircle_has_roleId(111);

            // Associate the Role entity with the Circle_has_role entity
            role1.setCircle_has_role(circleHasRole);

            // Save the entities
            session.save(role1);
            session.save(circleHasRole);

            // Commit the transaction
            transaction.commit();
            System.out.println("Entities saved successfully.");
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
