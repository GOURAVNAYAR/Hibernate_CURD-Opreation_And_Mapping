package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {

		// Create a Object........
		 ProductDTO pd = new ProductDTO();

		// Set a value.......
		
		  pd.setId(8);
		  pd.setName("charger"); 
		  pd.setPrice("260");
		 

		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		 Transaction tx = session.beginTransaction();
			/*
			 * ProductDTO productDTO = (ProductDTO) session.get(ProductDTO.class, 4);       //productsssss
			 * System.out.println(productDTO);
			 */
		// Apply opreation.........

	 session.save(pd);
		// session.update(pd);

		// session.delete(pd);

		// close opreation.......
		 tx.commit();
		session.close();

	}
}
