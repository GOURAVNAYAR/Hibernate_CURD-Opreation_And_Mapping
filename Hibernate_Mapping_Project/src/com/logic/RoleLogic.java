package com.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import com.Dto.Company_has_role;
import com.Dto.Role;

import java.util.HashSet;
import java.util.Set;

public class RoleLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create a Company_has_role
        Company_has_role companyHasRole = new Company_has_role();
        companyHasRole.setCompanyHasRoleName("Admin");

        // Create Roles and set the Company_has_role
        Role role1 = new Role();
        role1.setRoleCreate("24-10-2020");
        role1.setRoleUpdate("02-04-2022");
        role1.setRoleRead("09-09-2022");
        role1.setRoleDelete("11-12-23");
        role1.setCompanyHasRole(companyHasRole);

        Role role2 = new Role();
        role2.setRoleCreate("26-05-2021");
        role2.setRoleUpdate("07-06-2022");
        role2.setRoleRead("09-11-2023");
        role2.setRoleDelete("09-02-2024");
        role2.setCompanyHasRole(companyHasRole);

        // Add roles to the Company_has_role
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        companyHasRole.setRoles(roles);

        // Save the Company_has_role (which will cascade and save the roles)
        session.save(companyHasRole);

        transaction.commit();
        session.close();
    }
}
