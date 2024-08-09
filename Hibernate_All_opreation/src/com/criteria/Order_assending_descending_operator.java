package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ProductDTO;

public class Order_assending_descending_operator {


	

	SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();

	Criteria criteria = session.createCriteria(ProductDTO.class);
	//criteria.add(Restrictions.isNull("name"));
	
	criteria.add(Restrictions.isNotNull("name"));


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
