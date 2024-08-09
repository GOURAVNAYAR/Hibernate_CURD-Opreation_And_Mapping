package om_visual_delete;

import java.util.HashSet;		//NO.............
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_save.Customer;
import om_save.Vendor;

public class Logic {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("om_visual_delete/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		Order order = new Order();
		order.getOrderId();
		order.getOrderName("");
		System.out.println(order);*/

		// parent object
		Customer customer3 = new Customer();
		customer3.setCustomerId(111054);
		customer3.setCustomerName("Pavan");

		// creating 3 child objects
		Order order = new Order();
		order.setOrderId(101);
		order.setOrderName("Pan");
		order.setOrderquantity(5);
		order.setOrderDate("22/03/2025");

		Order order1 = new Order();
		order1.setOrderId(102);
		order1.setOrderName("colour");
		order1.setOrderquantity(2);
		order1.setOrderDate("02/03/2025");

		Order order2 = new Order();
		order2.setOrderId(103);
		order2.setOrderName("Pencile");
		order2.setOrderquantity(9);
		order2.setOrderDate("24/03/2025");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(order);
		s.add(order1);
		s.add(order2);

		customer3.setChildren(s);

		session.save(customer3);
		// session.update(pd);
		session.delete(order);
		// close opreation.......
		tx.commit();

		session.close();

	}

}
