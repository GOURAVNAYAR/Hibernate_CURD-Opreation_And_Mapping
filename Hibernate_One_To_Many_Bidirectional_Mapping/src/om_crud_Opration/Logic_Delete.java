package om_crud_Opration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Logic_Delete {

	public static void main(String[] args) {
		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_crud_Opration/Hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Customer customer = new Customer();
		customer.setCustomerId(104);
		customer.setCustomerName("Ankur Kewat");
		// adding child objects to set, as we taken 3rd property set in parent Set
		session.delete(customer);
		// close opreation.......
		tx.commit();
		session.close();
}
}