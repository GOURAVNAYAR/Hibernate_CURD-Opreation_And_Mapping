package com.HQL;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Like__NOT_Like_Operator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Query q = session.createQuery("from ProductDTO where name not like 'c%' ");
		//Query q = session.createQuery("from ProductDTO where name     like 'c%' ");
		//Query q = session.createQuery("from ProductDTO where name like '%r' ");
		//Query q = session.createQuery("from ProductDTO where name like '%a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '_a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '__a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '_ar%' ");
		
		

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
