package om_zHomework_update;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_save.Engine;
import om_visual_save.Part;

public class Logicc {

	public static void main(String[] args) {

		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_zHomework_update/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Mother mother = new Mother();

		mother.setMotherId(83008924);
		mother.setMotherName("Radikha");

		// creating 3 child objects
		Children children1 = new Children();
		children1.setChildrenId(101);
		children1.setChildrenName("Gourav");
		children1.setChildrenAge(18);
		children1.setChildrenClass("10");

		Children children2 = new Children();
		children2.setChildrenId(102);
		children2.setChildrenName("Rohit");
		children2.setChildrenAge(10);
		children2.setChildrenClass("6");
		
		Children children3 = new Children();
		children3.setChildrenId(103);
		children3.setChildrenName("Karan");
		children3.setChildrenAge(22);
		children3.setChildrenClass("2 year,B.tec");
		

		// adding child objects to set, as we taken 3rd property set in parent
		Set set = new HashSet();

		set.add(children1);
		set.add(children2);
		set.add(children3);

		mother.setChildren(set);
		session.save(mother);
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();

	}
}
