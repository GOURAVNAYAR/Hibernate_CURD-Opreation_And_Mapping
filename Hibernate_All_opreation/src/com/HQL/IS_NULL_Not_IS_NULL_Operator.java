package com.HQL;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class IS_NULL_Not_IS_NULL_Operator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		

		// Using a HQL query, IS NULL & not IS NULL operator....................
		//Query q = session.createQuery("from ProductDTO where name IS NULL");
		Query q = session.createQuery("from ProductDTO where name IS NOT NULL");
		
		

		List l = q.list();
		Iterator it = l.iterator();

		ProductDTO dto;
		while (it.hasNext()) {
			dto = (ProductDTO) it.next();
			System.out.println(dto.getId());
			System.out.println(dto.getName());
		}

		session.close();
	}


}
