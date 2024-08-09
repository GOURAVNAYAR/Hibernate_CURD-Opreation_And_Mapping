package com.logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Role;
import com.Dto.User_has_role;

public class User_has_roleLogic {

    public static void main(String[] args) {

    	   AnnotationConfiguration cfg = new AnnotationConfiguration();
           cfg.configure("Hibernate.cfg.xml");
           SessionFactory factory = cfg.buildSessionFactory();
           Session session = factory.openSession();
           Transaction transaction = session.beginTransaction();

        User_has_role userHasRole = new User_has_role();
        userHasRole.setUserName("John Doe");

        // Create Roles and set the User_has_role
        Role role1 = new Role();
        role1.setRoleCreate("1");
        role1.setRoleUpdate("1");
        role1.setRoleRead("1");
        role1.setRoleDelete("1");
        role1.setUserHasRole(userHasRole);

        Role role2 = new Role();
        role2.setRoleCreate("0");
        role2.setRoleUpdate("1");
        role2.setRoleRead("1");
        role2.setRoleDelete("0");
        role2.setUserHasRole(userHasRole);

        // Add roles to the User_has_role
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        userHasRole.setRoles(roles);

        // Save the User_has_role (which will cascade and save the roles)
        session.save(userHasRole);

        transaction.commit();
        session.close();
    }
}
