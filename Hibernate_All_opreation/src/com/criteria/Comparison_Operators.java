package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ProductDTO;

public class Comparison_Operators {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);
		// criteria.add(Restrictions.gt("id", 2)); //Greater Than (gt):
		// criteria.add(Restrictions.lt("id", 5)); //Less Than (lt):
		// criteria.add(Restrictions.ge("id", 6)); // Greater Than or Equal To (ge):
		//criteria.add(Restrictions.le("id", 2)); // less Than or Equal To (le):

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
