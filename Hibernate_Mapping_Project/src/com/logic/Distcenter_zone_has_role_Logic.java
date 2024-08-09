package com.logic;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.Dto.Distcenter_zone_has_role;
import com.Dto.Role;

public class Distcenter_zone_has_role_Logic {

    public static void main(String[] args) {
        
    	 AnnotationConfiguration cfg = new AnnotationConfiguration();
         cfg.configure("Hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();
         Transaction transaction = session.beginTransaction();
       
         Role role1 = new Role();
        role1.setRoleCreate("24-10-2020");
        role1.setRoleUpdate("02-04-2022");
        role1.setRoleRead("09-09-2022");
        role1.setRoleDelete("11-12-23");

        Distcenter_zone_has_role distcenterzonehasrole = new Distcenter_zone_has_role();
        distcenterzonehasrole.setDistcenterId(101);
        distcenterzonehasrole.setRole(role1);

        Set<Distcenter_zone_has_role> DZ = new HashSet<>();
        DZ.add(distcenterzonehasrole);

        role1.setDistcenterZoneHasRole(DZ);

        session.save(role1);
        session.save(distcenterzonehasrole);
        transaction.commit();
        session.close();
        factory.close();
    }
}
