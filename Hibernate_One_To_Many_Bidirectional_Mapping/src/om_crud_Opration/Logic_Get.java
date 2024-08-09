package om_crud_Opration;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic_Get {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_crud_Opration/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// **********************GET Opreation*****************
		Vendor vender = (Vendor) session.get(Vendor.class, 430000815);

		Set<Customer> customer = vender.getChildren();

		Iterator<Customer> iterator = customer.iterator();
		while (iterator.hasNext()) {
			Customer cust = iterator.next();
			System.out.println("Customer ID     : " + cust.getCustomerId());
			System.out.println("Customer Name   : " + cust.getCustomerName());
			System.out.println("Parent Vendor ID: " + cust.getForevenId());
			System.out.println("---------------------------------------");
		}

		tx.commit();
		session.close();

	}
}
