package om_visual_update;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_Delete.Book;
import om_Delete.Page;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_visual_update/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Mobile Mobile = new Mobile();

		Mobile.setMobileId(50008924);
		Mobile.setMobileName("lava");
		

		// creating 3 child objects
		Modal modal = new Modal();
		modal.setModalId(101);
		modal.setModalName("3g 32");
		
		Modal modal1 = new Modal();
		modal1.setModalId(102);
		modal1.setModalName("4g 128");

		Modal modal2 = new Modal();
		modal2.setModalId(103);
		modal2.setModalName("5g 264");


		

		// adding child objects to set, as we taken 3rd property set in parent
		Set set = new HashSet();

		set.add(modal);
		set.add(modal1);
		set.add(modal2);
	

		Mobile.setChildren(set);
		session.save(Mobile);
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();
	}

}
