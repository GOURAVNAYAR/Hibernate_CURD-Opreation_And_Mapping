package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ProductDTO;

public class Between_Operator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);
		// criteria.add(Restrictions.between("id", 2 ,5));   //between opretor
		//criteria.add(Restrictions.not(Restrictions.between("id", "a", "g")));  //not between opretar 
		criteria.add(Restrictions.not(Restrictions.between("id", 2, 5)));  //not between opretar 

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
