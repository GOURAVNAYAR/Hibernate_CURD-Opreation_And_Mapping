package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.ProductDTO;

public class Get_partiqular_colume {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(ProductDTO.class);
		ProjectionList pro = Projections.projectionList();
		pro.add(Projections.property("id"));
nhi ho rha hai
		List l = criteria.list();
		Iterator it = l.iterator();
		System.out.println(l.get(0));
		/*
		 * ProductDTO dto; while (it.hasNext()) { dto = (ProductDTO) it.next();
		 * System.out.println(dto.getId()); System.out.println(dto.getName()); }
		 */

		session.close();
	}
}
