package om_visual_Get;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_Delete.Book;
import om_Delete.Page;

public class Logic {

	public static void main(String[] args) {

		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_visual_Get/Hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Owner owner = (Owner) session.get(Owner.class, 9800894);	
		Set<Car>car = owner.getChildren();
		Iterator<Car> iterator = car.iterator();
		while (iterator.hasNext()) {
			Car cust = iterator.next();
			System.out.println("Customer ID     : " + cust.getCarId());
			System.out.println("Customer Name   : " + cust.getCarName());
			System.out.println("Customer Model   : " + cust.getCarmodels());
			System.out.println("Customer forevenId   : " + cust.getForevenId());
			System.out.println("---------------------------------------");
		}
		
		
		//**************************save Opration************************
		// parent object
/*		Owner owner = new Owner();

		owner.setOwnerId(9800894);
		owner.setOwnerName("Gourav");

		// creating 3 child objects
		Car Car = new Car();

		Car.setCarId(4702);
		Car.setCarName("XUV");
		Car.setCarmodels("245GH");

		Car Car1 = new Car();

		Car1.setCarId(700892);
		Car1.setCarName("ALTO");
		Car1.setCarmodels("800");

		Car Car2 = new Car();

		Car2.setCarId(5600089);
		Car2.setCarName("Nexon");
		Car2.setCarmodels("566JJ");

		// adding child objects to set, as we taken 3rd property set in parent
		Set set = new HashSet();

		set.add(Car);
		set.add(Car1);
		set.add(Car2);

		owner.setChildren(set);
		session.save(owner);	*/
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();

	}

	
}
