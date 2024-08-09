package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;
public class Order_Assending_Descnding {

	public static void main(String[] args) {


		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	//	Query query = session.createSQLQuery("SELECT * FROM productsssss ORDER BY P_NAME DESC");
		//Query query = session.createSQLQuery("SELECT * FROM productsssss ORDER BY P_NAME ");
		Query query = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID >= 5 ORDER BY P_NAME ");
		List<ProductDTO> pro = query.list();
		System.out.println(pro);
		session.close();
}
}