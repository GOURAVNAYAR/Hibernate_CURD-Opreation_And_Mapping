package Filters_Xml_Based;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Logic {

 	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("Filters_Xml_Based/hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        // enabling the studentName filter
        session.enableFilter("studentName"); 
        Query query = session.createQuery("from Student s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println("Student Names which starting with 'c'.......... : " + student.getStudentName());

        }
        session.close();
        factory.close();
    }
}

/*
 	public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("Filters_Xml_Based/hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        // enabling the studentName filter
        session.enableFilter("studentName"); 
        Query query = session.createQuery("from Student s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println("Student Names which starting with 'c' : " + student.getStudentName());

        }
        session.close();
        factory.close();
    }
}
 * 
 */

