package Table_Per_Class_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("Table_Per_Class_Hierarchy/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setId(11);
		student.setName("Gourav");
		student.setRollNumber(17018);
		
		Teacher teacher = new Teacher();
		teacher.setId(12);
		teacher.setName("pavan");
		teacher.setSubject("English");
		
		
		session.save(student);
		session.save(teacher);
		
	System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		
	}
}
