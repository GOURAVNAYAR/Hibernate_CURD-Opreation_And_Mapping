package om_visual_save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mo_save.Student;
import mo_update.College;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_visual_save/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Mother mother = new Mother();

		mother.setMotherId(83008924);
		mother.setMotherName("nidhi");
		mother.setMotherId(45);

		// creating 3 child objects
		Children children1 = new Children();
		children1.setChildrenId(101);
		children1.setChildrenName("Gourav");
		children1.setChildrenAge(18);
		children1.setParentObjects(mother);

		Children children2 = new Children();
		children2.setChildrenId(102);
		children2.setChildrenName("Rohit");
		children2.setChildrenAge(10);
		children2.setParentObjects(mother);

		Children children3 = new Children();
		children3.setChildrenId(103);
		children3.setChildrenName("Karan");
		children3.setChildrenAge(22);
		children3.setParentObjects(mother);

		session.save(mother);
		session.save(children1);
		session.save(children2);
		session.save(children3);
		transaction.commit();
		session.close();
	}
}
