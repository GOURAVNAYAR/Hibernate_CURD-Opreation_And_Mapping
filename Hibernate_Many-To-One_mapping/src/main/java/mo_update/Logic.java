package mo_update;

import org.hibernate.Session; //NO.............
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mo_save.Student;
import mo_save.Subject;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("mo_update/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// ek st kai sari class hai isliye dusari class le raha hai
		College college = new College();
		college.setCollegeId(100);
		college.setCollegeName("Hindi");

		Student student = new Student();
		student.setStudentId(17264);
		student.setStudentName("Gourav");
		student.setStudentAge(22);
	//	student.setParentObjects(college);

		Student student1 = new Student();
		student1.setStudentId(17265);
		student1.setStudentName("Paven");
		student1.setStudentAge(24);
	//	student1.setParentObjects(college);

		Student student3 = new Student();
		student3.setStudentId(17266);
		student3.setStudentName("Rohit");
		student3.setStudentAge(28);
	//	student3.setParentObjects(college);

		session.save(student1);
		session.save(student3);

		// session.delete(student2);
		transaction.commit();
		session.close();
	}

}
