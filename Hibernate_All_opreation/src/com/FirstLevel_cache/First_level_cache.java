package com.FirstLevel_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO; //First level cache is default and cache mean run a program multipal time in same query and print a query only one time

public class First_level_cache {
	public static void main(String[] args) throws InterruptedException {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		ProductDTO productdto = (ProductDTO) session.get(ProductDTO.class, 1);
		System.out.println(productdto);

		System.out.println("First_level_cache........");
		Thread.sleep(20000);

		ProductDTO productdto1 = (ProductDTO) session.get(ProductDTO.class, 1);
		System.out.println(productdto1);
		session.close();
	}
}
