package One_to_Many_Remove;

import java.util.HashSet;					//*****NO****
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import One_to_Many_Get.Book;
import One_to_Many_Get.Topic;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("One_to_Many_Remove/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
			Mobile mobile = new Mobile();

			mobile.setMobileId(100);
			mobile.setMobileName("Oppo");
			mobile.setMobileModal("A_71");
			
			Mobile mobile1 = new Mobile();
			
			mobile1.setMobileId(101);
			mobile1.setMobileName("Realme");
			mobile1.setMobileModal("MG_50");
			
			Mobile mobile2 = new Mobile();
			
			mobile2.setMobileId(102);
			mobile2.setMobileName("norzo");
			mobile2.setMobileModal("60S");
			
			Mobile mobile3 = new Mobile();
			
			mobile3.setMobileId(103);
			mobile3.setMobileName("mi");
			mobile3.setMobileModal("52_j");

			// creating 3 child objects
			Messege messege = new Messege();

			messege.setMessegeId(100);
			messege.setMessegeName("Hello Boss");
			messege.setMessegeTime("Monday 10:23pm");
		
			
			Set<Mobile> s = new HashSet<Mobile>();

			s.add(mobile);
			s.add(mobile1);
			s.add(mobile2);
			s.add(mobile3);
					

			messege.setChildren(s);

			session.save(messege);

			// close opreation.......
			tx.commit();

			session.close();
			

	

	}
	
}
