package OO_Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OO_Save.Address;
import OO_Save.Student;

public class Logic {			//N

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_Update/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Person person = new Person();
		person.setPersonId(254);
		person.setPersonName("Gourav n");

		Mobile mobile = new Mobile();
		mobile.setMobileId(201);
		mobile.setMobileName("Oppo ");
		mobile.setP(person);
		
		session.save(mobile);
		tx.commit();
		session.close();
	}
}
