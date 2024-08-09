package com.sql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class AND_OR_Opretor {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		// show a all list.......
		//Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID > 2 AND P_ID < 5 ");

		Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID > 2 OR P_ID < 5 ");
		List<ProductDTO> pro = query.list();
		System.out.println(pro.get(1));

		session.close();
	}
}
