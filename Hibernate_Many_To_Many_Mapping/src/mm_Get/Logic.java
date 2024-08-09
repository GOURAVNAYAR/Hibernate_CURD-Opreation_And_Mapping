package mm_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mm_Delete.Brother;
import mm_Delete.Sister;

public class Logic {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("mm_Get/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// child object........ one
		Product product = new Product();

		product.setProductId(50024);
		product.setProductName("Pooja");

		// creating 3 Parent objects............many
		Order order = new Order();
		order.setOrderId(101);
		order.setOrderName("Web_Appliction");

		session.beginTransaction();

		session.save(product);
		session.save(order);

		// close opreation.......
		session.getTransaction().commit();
		session.close();
	}
}
