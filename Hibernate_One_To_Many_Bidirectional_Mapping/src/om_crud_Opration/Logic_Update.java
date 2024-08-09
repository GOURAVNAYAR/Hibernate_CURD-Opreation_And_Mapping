package om_crud_Opration;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic_Update {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_crud_Opration/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// **********************UPDATE Opreation*****************
		
		Customer customer1 = (Customer) session.get(Customer.class, 101);
		System.out.println("Customer Name: " + customer1.getCustomerName());
		Customer customer = (Customer) session.get(Customer.class, 101);
		// Update the properties of the State object....................
		customer.setCustomerName("Anurag");
		System.out.println("Customer Name: " + customer.getCustomerName());

		tx.commit();
		session.close();

	}
}
