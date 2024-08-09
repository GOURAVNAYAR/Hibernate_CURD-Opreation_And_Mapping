package om_visual_save;

import java.util.HashSet;
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
				SessionFactory sessionFactory = new Configuration().configure("om_visual_save/Hibernate.cfg.xml")
						.buildSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();

				// parent object
				Engine Engine = new Engine();

				Engine.setEngineId(83008924);
				Engine.setEngineName("XUV_500");
				

				// creating 3 child objects
				Part part1 = new Part();
				part1.setPartId(101);
				part1.setPartName("gear");
				part1.setPartoftheCar("Function");
				
				Part part2 = new Part();
				part2.setPartId(102);
				part2.setPartName("Gear_Box");
				part2.setPartoftheCar("Functions");

				Part part3 = new Part();
				part3.setPartId(103);
				part3.setPartName("Fornt view");
				part3.setPartoftheCar("Functionss");

		

				// adding child objects to set, as we taken 3rd property set in parent
				Set set = new HashSet();

				set.add(part1);
				set.add(part2);
				set.add(part3);

				Engine.setChildren(set);
				session.save(Engine);
				// session.update(pd);
				// session.delete(pd);
				// close opreation.......
				tx.commit();
				session.close();

	}

}
