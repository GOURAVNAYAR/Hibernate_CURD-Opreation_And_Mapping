package One_to_Many_Save;

import java.util.HashSet; // ye save opreation hai jo run ho gaya hai
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration

		  AnnotationConfiguration cfg = new AnnotationConfiguration();
	        cfg.configure("One_to_Many_Save/Hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Subject subject = new Subject();

		subject.setSubjectId(111054);
		subject.setSubjectName("English");

		// creating 3 child objects
		Student student = new Student();

		student.setId(101);
		student.setName("Gourav");

		Student student1 = new Student();

		student1.setId(102);
		student1.setName("pavan");

		Student student2 = new Student();

		student2.setId(103);
		student2.setName("Ritika");

		Set<Student> s = new HashSet<Student>();

		s.add(student);
		s.add(student1);
		s.add(student2);

		subject.setChildren(s);

		session.save(subject);

		// close opreation.......
		tx.commit();

		session.close();
	}
}
