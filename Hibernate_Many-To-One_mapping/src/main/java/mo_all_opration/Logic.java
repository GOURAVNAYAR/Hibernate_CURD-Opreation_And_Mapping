package mo_all_opration;

import org.hibernate.Session; //No..............

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("mo_all_opration/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Library lib = new Library();
		lib.setLibraryId(101);
		lib.setLibraryName("Data Structure");

		Student st1 = new Student();
		st1.setStudentId(1);
		st1.setStudentName("Vipul");
		st1.setParentObjects(lib);

		Student st2 = new Student();
		st2.setStudentId(2);
		st2.setStudentName("gourav");
		st2.setParentObjects(lib);

		Student st3 = new Student();
		st3.setStudentId(3);
		st3.setStudentName("Anurag");
		st3.setParentObjects(lib);

		session.save(st1);
		session.save(st2);
		session.save(st3);

		transaction.commit();
		session.close();

	}

}
