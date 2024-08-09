package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Between_Not_Between_Opreator {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		// Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID
		// BETWEEN 2 AND 5 ");
		Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID NOT BETWEEN 2 AND 5");
		List<ProductDTO> pro = query.list();
		System.out.println(pro);
		session.close();
	}
}
