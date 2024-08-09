package com.SecondLevel_Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ProductDTO;

public class Second_level_cache {
	public static void main(String args[]) throws InterruptedException {

		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();


		Session session1 = sessionFactory.openSession();
		ProductDTO productDTO =  (ProductDTO) session1.load(ProductDTO.class, 1);
		System.out.println(productDTO);
	    session1.close();
		
		//Stop a Program......
		//Thread.sleep(20000);
		
		
		Session session2 = sessionFactory.openSession();
		ProductDTO productDTO1 =(ProductDTO) session2.load(ProductDTO.class, 1);
		System.out.println(productDTO1);
	    session2.close();
	}
}
