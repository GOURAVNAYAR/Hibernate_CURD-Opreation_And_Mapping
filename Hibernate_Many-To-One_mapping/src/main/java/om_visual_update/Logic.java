package om_visual_update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_save.Children;
import om_visual_save.Mother;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_visual_update/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Boss boss = new Boss();

		boss.setBossId(83008924);
		boss.setBossName("nidhi");
		boss.setBossAge(18);

		// creating 3 child objects
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Gourav");
		employee.setParentObjects(boss);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(102);
		employee1.setEmployeeName("Paven");
		employee1.setParentObjects(boss);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(103);
		employee2.setEmployeeName("Preeti");
		employee2.setParentObjects(boss);
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(104);
		employee3.setEmployeeName("Pooja");
		employee3.setParentObjects(boss);
		
		session.save(boss);
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		transaction.commit();
		session.close();
	}

}
