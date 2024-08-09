package mo_get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("mo_get/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	
		
			Markect dr = (Markect) session.get(Markect.class, args);
			Transaction transaction1 = session.beginTransaction();
			
			System.out.println(dr);

		
		session.close();
	

}
}
