package mo_delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("mo_delete/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// child object........ one
		Student Student1 = new Student();

		Student1.setStudentId(50024);
		Student1.setStudentName("Gourav");

		// creating 3 Parent objects............many
		Project project = new Project();
		project.setProjectId(101);
		project.setProjectName("Web_Appliction");
		project.setParentObjects(Student1);

		Project project1 = new Project();
		project1.setProjectId(102);
		project1.setProjectName("Mobile_Appliction");
		project1.setParentObjects(Student1);

		Project project2 = new Project();
		project2.setProjectId(103);
		project2.setProjectName("desktop_Appliction");
		project2.setParentObjects(Student1);

	 session.beginTransaction();
		
		session.save(project);
		session.save(project1);
		session.save(project2);
		// close opreation.......
		 session.getTransaction().commit();
		session.close();

	}

}
