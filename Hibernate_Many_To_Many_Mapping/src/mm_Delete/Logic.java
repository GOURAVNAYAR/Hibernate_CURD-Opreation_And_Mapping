package mm_Delete;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("mm_Delete/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			// Creating Brother objects
			Brother brother1 = new Brother();
			brother1.setBrotherId(201);
			brother1.setBrotherName("Ankur");

			Brother brother2 = new Brother();
			brother2.setBrotherId(202);
			brother2.setBrotherName("Gourav");

			// Creating Sister objects
			Sister sister1 = new Sister();
			sister1.setSisterId(101);
			sister1.setSisterName("Pooja");

			Sister sister2 = new Sister();
			sister2.setSisterId(102);
			sister2.setSisterName("Preeti");

			// Creating sets to associate sisters with brothers
			Set<Brother> brothersForSister1 = new HashSet<>();
			brothersForSister1.add(brother1);
			brothersForSister1.add(brother2);

			Set<Brother> brothersForSister2 = new HashSet<>();
			brothersForSister2.add(brother1);

			// Associating sisters with brothers
			sister1.setBrother(brothersForSister1);
			sister2.setBrother(brothersForSister2);

			// Saving sisters
			session.save(sister1);
			session.save(sister2);

			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
