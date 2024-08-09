package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ProductDTO;

public class Like_opreation {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);

		// criteria.add(Restrictions.like("name", "C%"));
		// criteria.add(Restrictions.like("name","%r"));
		// criteria.add(Restrictions.like("name", "_a%"));
		// criteria.add(Restrictions.like("name","%a_"));

		criteria.add(Restrictions.like("name", "_a_%"));

		List<ProductDTO> product = criteria.list();
		for (ProductDTO prod : product) {
			System.out.println(prod);
		}
		session.close();
	}
}
