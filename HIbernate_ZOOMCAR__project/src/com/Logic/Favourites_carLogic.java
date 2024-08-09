package com.Logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Favourites_carLogic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		transaction.commit();
		session.close();
	}
}
