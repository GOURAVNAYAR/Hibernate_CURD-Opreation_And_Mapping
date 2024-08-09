package OO_Save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {				//All done

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_Save/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();


		Student studnet = new Student();
		studnet.setStudentId(1001);
		studnet.setStudentName("Gourav");
		studnet.setStudentAge(22);

		Address address = new Address();
		address.setAddressId(2001);
		address.setAddressName("Word no.9");
		address.setS(studnet);
		
		session.save(address);
		tx.commit();
		session.close();
	}
}
