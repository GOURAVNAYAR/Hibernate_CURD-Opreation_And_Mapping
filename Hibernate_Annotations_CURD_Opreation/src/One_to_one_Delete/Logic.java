package One_to_one_Delete;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("One_to_one_Delete/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the ID of the phone to delete:");
		int phoneId = scanner.nextInt();

		// Retrieve the phone object by ID
		Phone phone = (Phone) session.get(Phone.class, phoneId);
		System.out.println("Phone to delete: " + phone);

		
		// Delete the phone object
		session.delete(phone);
		System.out.println("Phone deleted successfully.");

		transaction.commit();
		session.close();
	}
}

/*
 * for (int i = 1; i <= 5; i++) { SIM sim = new SIM();
 * sim.setSim_Name("New Delhi " + i);
 * 
 * Phone phone = new Phone(); phone.setPhone_name("India " + i);
 * 
 * phone.setSim(sim); session.save(phone); }
 */
