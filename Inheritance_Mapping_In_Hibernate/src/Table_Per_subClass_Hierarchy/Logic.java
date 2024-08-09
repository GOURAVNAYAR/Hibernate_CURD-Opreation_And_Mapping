package Table_Per_subClass_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Table_Per_Class_Hierarchy.Student;
import Table_Per_Class_Hierarchy.Teacher;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("Table_Per_subClass_Hierarchy/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Lab lab = new Lab();
		lab.setLabId(101);
		lab.setLabName("GURU krapaa");

		Ground ground = new Ground();
		ground.setGroundId(201);
		ground.setGroundName("Pankach");

		session.save(lab);
		session.save(ground);

		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();

	}
}
