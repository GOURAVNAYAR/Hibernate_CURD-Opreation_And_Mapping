package om_save;

import java.util.HashSet;       // ye save opreation hai jo run ho gaya hai
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_save/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Vendor vender = new Vendor();

		vender.setVendorId(111054);
		vender.setVenderName("JIO");

		// creating 3 child objects
		Customer c1 = new Customer();

		c1.setCustomerId(101);
		c1.setCustomerName("Gourav");

		Customer c2 = new Customer();

		c2.setCustomerId(102);
		c2.setCustomerName("Ankur");

		Customer c3 = new Customer();

		c3.setCustomerId(103);
		c3.setCustomerName("Ankit");

		// creating 3 child objects
		Customer c4 = new Customer();

		c4.setCustomerId(104);
		c4.setCustomerName("Preeti");

		Customer c5 = new Customer();

		c5.setCustomerId(105);
		c5.setCustomerName("Nidhi");

		Customer c6 = new Customer();

		c6.setCustomerId(106);
		c6.setCustomerName("Raghav");
		Customer c7 = new Customer();

		c7.setCustomerId(107);
		c7.setCustomerName("pavan");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		s.add(c5);
		s.add(c6);
		s.add(c7);

		vender.setChildren(s);

		session.save(vender);
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();

		session.close();

	}
}
