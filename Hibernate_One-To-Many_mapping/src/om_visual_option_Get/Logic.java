package om_visual_option_Get;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_Get.Car;
import om_visual_Get.Owner;

public class Logic {

	public static void main(String[] args) {

		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_visual_option_Get/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		//****************************Get******************************************
		
		Company company = (Company) session.get(Company.class, 9000457);
		Set<Project> project = company.getChildren();
		System.out.println(project);
		
		
				//**********************save***********************
		
		// parent object
	/*	Company company = new Company();

		company.setCompanyId(9000457);
		company.setCompanyName("TCS");
		

		// creating 3 child objects
		Project project = new Project();

		project.setProjectId(74702);
		project.setProjectName("Online Payment");
		
		
		Project project1 = new Project();
		
		project1.setProjectId(14708);
		project1.setProjectName("online Serves");
		
		
		Project project2 = new Project();
		
		project2.setProjectId(34705);
		project2.setProjectName("Ltd on UK");
		
		

		// adding child objects to set, as we taken 3rd property set in parent
		Set set = new HashSet();

		set.add(project);
		set.add(project1);
		set.add(project2);
		

		company.setChildren(set);
		session.save(company);
		*/
		
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();
}
}
