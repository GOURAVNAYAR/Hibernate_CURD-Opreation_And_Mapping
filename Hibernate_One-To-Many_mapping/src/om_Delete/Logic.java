package om_Delete;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_Delete/Hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Page page = new Page();

		page.setPageId(102);
		page.setPageName("Ecourse_java");
		page.setPageTopic("Oprater");
		// adding child objects to set, as we taken 3rd property set in parent Set
		session.delete(page);
		// close opreation.......
		tx.commit();
		session.close();

	}
}
