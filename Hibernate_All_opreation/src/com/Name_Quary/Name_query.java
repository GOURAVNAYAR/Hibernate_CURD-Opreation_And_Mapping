package com.Name_Quary;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Name_query {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		// Using Named Query
		Query query = session.getNamedQuery("allpart");
//		query4.setString(1, "black");
		List list = query.list();
		System.out.println(list);
		session.close();
	}

}