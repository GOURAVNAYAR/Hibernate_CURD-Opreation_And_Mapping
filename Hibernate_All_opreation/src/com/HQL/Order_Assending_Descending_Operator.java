package com.HQL;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;


public class Order_Assending_Descending_Operator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Query q = session.createQuery("from ProductDTO order by name");
				//Query q = session.createQuery("from ProductDTO order by name desc ");
				//Query q = session.createQuery("from ProductDTO WHERE name = 'car' ORDER BY name  ");
				
		
		

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
