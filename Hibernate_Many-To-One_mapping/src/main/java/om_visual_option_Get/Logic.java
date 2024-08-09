package om_visual_option_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_save.Children;
import om_visual_save.Mother;
import om_visual_update.Employee;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_visual_option_Get/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
 

		
		
		//copy past ke karan vo dusari class ko le raha hai
		Task task2 = new Task();
		task2.setTaskId(83008924);
		task2.setTaskName("Web project");

		// creating 3 child objects
		Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setEmployeeName("Gourav");
	//	employee.setParentObjects(task2);
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId(102);
		employee1.setEmployeeName("Paven");
	//	employee.setParentObjects(task2);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId(103);
		employee2.setEmployeeName("Preeti");
	//	employee.setParentObjects(task2);
		
		Employee employee3 = new Employee();
		employee3.setEmployeeId(104);
		employee3.setEmployeeName("Pooja");
	//	employee.setParentObjects(task2);
		
		session.save(task2);
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		transaction.commit();
		session.close();
	}

}
