package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest_getMethod {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		ProductDTO productDTO = (ProductDTO) session.get(ProductDTO.class, 4); // productsssss
		System.out.println(productDTO);

		session.close();

	}
}
