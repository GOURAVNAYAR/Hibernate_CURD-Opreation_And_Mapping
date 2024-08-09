package mo_save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("mo_save/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student();
		student.setStudentId(58);
		student.setStudentName("Gourav na");
		student.setStudentAge(22);

		Subject subject = new Subject();
		subject.setSubjectId(100);
		subject.setSubjectName("Hindi");
		subject.setParentObjects(student);

		Subject subject1 = new Subject();
		subject1.setSubjectId(101);
		subject1.setSubjectName("English");
		subject1.setParentObjects(student);
		
		Subject subject2 = new Subject();
		subject2.setSubjectId(102);
		subject2.setSubjectName("c");
		subject2.setParentObjects(student);
		
		Subject subject3 = new Subject();
		subject3.setSubjectId(103);
		subject3.setSubjectName("c++");
		subject3.setParentObjects(student);
		
		Subject subject4 = new Subject();
		subject4.setSubjectId(104);
		subject4.setSubjectName("java");
		subject4.setParentObjects(student);
		
		session.save(subject1);
		session.save(subject2);
		session.save(subject3);
		session.save(subject4);
		// delete query
		// session.delete(student2);
		transaction.commit();
		session.close();
	}

}
