package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ProductDTO;

public class And_Or_operator {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ProductDTO.class);
		
		//criteria.add(Restrictions.like("name", "c%"));  //   \\
		//criteria.add(Restrictions.between("id", 2, 4)); //   // AND opretor.........
		
		
		
		Criteria condition1 = (Criteria) Restrictions.eq("name",5);
		Criteria condition2 = (Criteria) Restrictions.gt("name",2);
		
		criteria.add(Restrictions.or(condition1, condition2));

		List l = criteria.list();
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