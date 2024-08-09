package OO_visual_save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {   		// n

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_visual_save/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		/* *********save opration*********** */
	
		User user = new User();
		user.setUsername("John Doe");

		Mobile mobile = new Mobile();
		mobile.setBrand("Samsung");
		mobile.setUser(user);
		
		session.save(user);

		/*
		 * *************update*************
		 * 
		 * Object userToRemove = session.get(User.class, 1);
		 * System.out.println(userToRemove);
		 * 
		 */

		tx.commit();
		session.close();

	}
}
