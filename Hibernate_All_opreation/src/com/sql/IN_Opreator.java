package com.sql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class IN_Opreator {
	public static void main(String[] args) {

			SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			
		//	Query query =session.createSQLQuery("SELEcT * FROM productsssss WHERE P_ID IN (2,5,6)");
			Query query =session.createSQLQuery("SELEcT * FROM productsssss WHERE P_ID NOT IN (2,5,6)");
			List<ProductDTO> pro = query.list();			
			System.out.println(pro);
			
			session.close();
	}
}
