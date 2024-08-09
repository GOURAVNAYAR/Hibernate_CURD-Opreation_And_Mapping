package OO_visual_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic { // ******************All Done******************

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_visual_Get/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		/*
		 * Student student = new Student(); // student user student.setName("John Doe");
		 * 
		 * College college = new College(); // College college.setName("123 Main St");
		 * college.setCity("Springfield"); college.setZipCode("12345");
		 * 
		 * student.setCollege(college);
		 * 
		 * session.save(student);
		 */
		// Get operation

		Student retrievedUser = (Student) session.get(Student.class, 1); // Provide the user ID
		System.out.println(retrievedUser);

		tx.commit();
		session.close();

	}
}
