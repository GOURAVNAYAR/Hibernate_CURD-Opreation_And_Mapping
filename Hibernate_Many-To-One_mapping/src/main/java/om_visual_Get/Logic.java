package om_visual_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_update.Boss;
import om_visual_update.Employee;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_visual_Get/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Mobile mobile= new Mobile();

		mobile.setMobileId(83008924);
		mobile.setMobileName("OPPO");
		
		// creating 3 child objects
		Person ps = new Person();
		ps.setPersonId(101);
		ps.setPersonName("Gourav");
		ps.setParentObjects(mobile);

		
		Person ps1 = new Person();
		ps1.setPersonId(102);
		ps1.setPersonName("Rajveer");
		ps1.setParentObjects(mobile);

		
		Person ps2 = new Person();
		ps2.setPersonId(103);
		ps2.setPersonName("Pavan");
		ps2.setParentObjects(mobile);

		session.save(mobile);
		session.save(ps);
		session.save(ps1);
		session.save(ps2);
		transaction.commit();
		session.close();
	}
}
