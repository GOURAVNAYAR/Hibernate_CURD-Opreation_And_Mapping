package com.logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Division_has_role;
import com.Dto.Role;

//****************DONE****************
public class Division_has_roleLogic {

    public static void main(String[] args) {
        // Configure Hibernate
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create a new Division_has_role entity
        Division_has_role divisionHasRole = new Division_has_role();
        divisionHasRole.setDivisionHasRoleName("IT Division");

        // Create a new Role entity and associate it with the Division_has_role
        Role role1 = new Role();
        role1.setRoleCreate("24-10-2020");
        role1.setRoleUpdate("02-04-2022");
        role1.setRoleRead("09-09-2022");
        role1.setRoleDelete("11-12-2023");
        role1.setDivisionHasRole(divisionHasRole);

        // Add the Role to the Division_has_role's roles set
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        divisionHasRole.setRoles(roles);

        // Save the Division_has_role (which will cascade and save the Role as well)
        session.save(divisionHasRole);

        // Commit the transaction
        transaction.commit();
        session.close();
    }
}
