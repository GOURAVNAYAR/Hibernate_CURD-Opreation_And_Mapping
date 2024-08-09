package mm_visual_update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mm_Delete.Brother;
import mm_Delete.Project;
import mm_Delete.Sister;
import mm_Delete.Student;

public class Logic {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("mo_delete/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// child object........ one
		Book book = new Book();

		book.set(50024);
		book.set("Pooja");

		// creating 3 Parent objects............many
		Writer writer = new Writer();
		writer.set(101);
		writer.set("Web_Appliction");

		
		// close opreation.......
		session.getTransaction().commit();
		session.close();
	}
}
