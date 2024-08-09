package com.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Between_And_Not_Between_Operator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from ProductDTO where id BETWEEN 1 AND 5 ");
		// Query q = session.createQuery("from ProductDTO where id NOT BETWEEN 3 AND
		// 5");
		// Query q = session.createQuery("from ProductDTO where name BETWEEN 'c' AND
		// 'k'");

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
