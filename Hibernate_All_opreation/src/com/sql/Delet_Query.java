package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Delet_Query {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createSQLQuery("DELETE FROM productsssss WHERE P_ID = :i ");

		query.setParameter("i", "6");
		int r = query.executeUpdate();
		System.out.println(r);
		
		Query query1 = session.createSQLQuery("SELECT * FROM productsssss;");
		
		List<Object[]> list = query1.list();
		for(Object[]  object : list) {
			int id =(int)object[0];
			System.out.print(object[0] +"\t");
			System.out.print(object[1] +"\t");
			System.out.print(object[2]);
			System.out.println();
		}
		session.close();
		}
}

/*

for (Object[] object : list) {              // there are second way to input in the console

	int id = (int) object[0];
	String P_NAME = (String) object[1];
	Integer P_ID = (Integer) object[0];
	String PRICE = (String) object[2];

	System.out.print(P_ID + "\t");
	System.out.print(P_NAME + "\t");
	System.out.print(PRICE + "\t");
	System.out.println();
}

*/


