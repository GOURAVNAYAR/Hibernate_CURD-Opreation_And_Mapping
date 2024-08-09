package mm_crud_Opration;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mm_visual_save.People;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("mm_crud_Opration/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Creating students
		Student student1 = new Student();
		student1.setName("Alice");

		Student student2 = new Student();
		student2.setName("Bob");
 
		// Creating courses
		Course course1 = new Course();
		course1.setName("Math");

		Course course2 = new Course();
		course2.setName("Physics");

		Set<Course> set = new HashSet<Course>();
		set.add(course1);
		set.add(course2);

		// set
		student1.setCourses(set);
		student2.setCourses(set);

		session.save(student1);
		session.save(student2);

		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
