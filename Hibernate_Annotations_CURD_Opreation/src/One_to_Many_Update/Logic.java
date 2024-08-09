package One_to_Many_Update;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import One_to_Many_Save.Student;
import One_to_Many_Save.Subject;

public class Logic {		//**************NO************

	public static void main(String[] args) {
		// Read Configuration

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("One_to_Many_Update/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Customer customer = new Customer();

		customer.setCustomerId(111054);
		customer.setCustomerName("Pavan");

		// creating 3 child objects
		Bank bank = new Bank();
		bank.setBankId(101);
		bank.setBankName("BOI Bank");

		
		
		Bank bank1 = new Bank();
		bank1.setBankId(102);
		bank1.setBankName("Central Bank");
		
		
		Bank bank2 = new Bank();
		bank2.setBankId(103);
		bank2.setBankName("Punjab Bank");
		
		Bank bank3 = new Bank();
		bank3.setBankId(104);
		bank3.setBankName("SBI Bank");
		
		

		Set<Bank> s = new HashSet<Bank>();

		s.add(bank);
		s.add(bank1);
		s.add(bank2);
		s.add(bank3);

		customer.setChildren(s);

		session.save(customer);

		// close opreation.......
		tx.commit();

		session.close();
	}
}
