package mm_update;

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
		Sister sister = new Sister();

		sister.set(50024);
		sister.set("Pooja");

		// creating 3 Parent objects............many
		Brother brother = new Brother();
		brother.set(101);
		brother.set("Web_Appliction");

		session.beginTransaction();

		session.save(Student1);
		session.save(project);
		
		// close opreation.......
		session.getTransaction().commit();
		session.close();
	}
}
