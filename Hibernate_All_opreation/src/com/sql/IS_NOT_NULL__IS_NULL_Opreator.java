package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class IS_NOT_NULL__IS_NULL_Opreator {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

		//Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID IS NULL");
		Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID IS NOT NULL");
		List<ProductDTO> pro = query.list();
		System.out.println(pro);
		session.close();
	}
}