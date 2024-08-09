package hibernate_class;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Text {

	public static void main(String args[]) {
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		Session s = sessionfactory.openSession();
		Transaction tx = s.beginTransaction();
		
		UserDTO userdto = new UserDTO();

		userdto.setId(1);
		userdto.setUserId("0001");
		userdto.setAddress("WORD no.5");
		userdto.setFirstName("Gourav");
		userdto.setLastName("Nayar");
		userdto.setPassword("1234");

		s.save(userdto);

		tx.commit();
		s.close();
}
}
