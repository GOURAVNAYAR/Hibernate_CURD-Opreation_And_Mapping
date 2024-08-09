package com_student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Logic {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com_student/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student studnet = new Student();
		studnet.setStudentId(1001);
		studnet.setStudentName("Gourav");
		studnet.setStudentAge(22);
		studnet.setStudentAddress("Word no9");
		
		  session.save(studnet);

	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	}

}
