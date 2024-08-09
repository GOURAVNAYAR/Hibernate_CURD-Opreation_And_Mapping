package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class LIMIT_OFFSET_Opretor {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();

	//	Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_NAME LIKE 'c%' LIMIT 2 ");
		Query query = session.createSQLQuery("SELECT * FROM productsssss  LIMIT 5 ,2 ");
		
		List<ProductDTO> pro = query.list();
		System.out.println(pro);
		session.close();
	}
}