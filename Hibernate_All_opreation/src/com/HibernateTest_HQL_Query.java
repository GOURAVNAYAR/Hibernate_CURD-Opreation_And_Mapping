
package com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest_HQL_Query {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("com/Product.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		// show a all list.......
	//	 Query q = session.createQuery("from ProductDTO");

	

		// Using a HQL query,comparison operators.........
		// Query q = session.createQuery("from ProductDTO where name != 'pan'");
		// Query q = session.createQuery("from ProductDTO where name = 'Pan'");
		// Query q = session.createQuery("from ProductDTO where id <=2");
		 Query q = session.createSQLQuery("SELECT * FROM productsssss WHERE P_ID = 1");
		// Query q = session.createQuery("from ProductDTO where id >=2");
		
		

		// Using a HQL query,And & Or operator..............
		//Query q = session.createQuery("from ProductDTO where id >=3 AND id <=5");
	    //Query q = session.createQuery("from ProductDTO where id =3   OR id=5");
		
		
		
		//Using HQL query, IN operator..................
		//Query q = session.createQuery("from ProductDTO where id IN (2,5,7)");
		
		
		
		//Using a HQL query, between and Not between operator..............
	    //Query q = session.createQuery("from ProductDTO where id BETWEEN 1 AND 5 ");
	    //Query q = session.createQuery("from ProductDTO where id NOT BETWEEN 3 AND 5");
	    //Query q = session.createQuery("from ProductDTO where name  BETWEEN 'c' AND 'k'");
		
		
		
		
		//Using a HQL query, Like & NOT Like operator..............
		//Query q = session.createQuery("from ProductDTO where name not like 'c%' ");
		//Query q = session.createQuery("from ProductDTO where name     like 'c%' ");
		//Query q = session.createQuery("from ProductDTO where name like '%r' ");
		//Query q = session.createQuery("from ProductDTO where name like '%a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '_a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '__a%' ");
		//Query q = session.createQuery("from ProductDTO where name like '_ar%' ");
		
		
		
		//Using a HQL query, REGULAR EXPRESSION....................
		//Query q = session.createQuery("from ProductDTO where name regexp '^ar' ");
		//Query q = session.createQuery("from ProductDTO where name ");
		
		
		
		// Using a HQL query, Order assending & descending operator....................
		//Query q = session.createQuery("from ProductDTO order by name");
		//Query q = session.createQuery("from ProductDTO order by name desc ");
		//Query q = session.createQuery("from ProductDTO WHERE name = 'car' ORDER BY name  ");
		
		
		
		// Using a HQL query, IS NULL & not IS NULL operator....................
		//Query q = session.createQuery("from ProductDTO where name IS NULL");
		//Query q = session.createQuery("from ProductDTO where name IS NOT NULL");
		
		
	 //*********************Using a HQL,LIMIT & OFFSET operator...................*****************
		//Query q = session.createQuery("from ProductDTO LIMIT 5 ");
		
		
		
		
		List l = q.list();
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
