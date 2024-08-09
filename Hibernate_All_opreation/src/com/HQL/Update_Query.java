package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Update_Query {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		//	Transaction tx = session.beginTransaction();
		Query query = session.createSQLQuery("UPDATE productsssss SET PRICE = :n WHERE P_ID = :i");
		query.setParameter("n", "1500");
		query.setParameter("i", "1");
		
		int r = query.executeUpdate();
		System.out.println(r);
		/*
		 * List<ProductDTO> pro = query.list(); System.out.println(pro);
		 */
		//tx.commit();
		session.close();
	}
}
