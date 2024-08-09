package Table_Per_Concrete_Class_Hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {


	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("Table_Per_Concrete_Class_Hierarchy/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Company company = new Company();
		company
		
		
		Color color = new Color();
		
		
		Model model = new Model();
		
		
		
		
		session.save(company);
		session.save(color);
		session.save(model);
		
	System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		
	}
}
