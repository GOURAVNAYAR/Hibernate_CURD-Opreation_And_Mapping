package OO_CRUD_Opration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {			//Done

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_CRUD_Opration/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println(
				"press 1 will be saved  \n press 2 will be get \n press 3 will be update \n press 4 will be remove ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();

		switch (key) {
		case 1: {

			// save
			User user = new User();
			user.setName("John Doe");

			Address address = new Address();
			address.setStreet("123 Main St");
			address.setCity("Springfield");
			address.setZipCode("12345");

			user.setAddress(address);

			session.save(user);
			break;
		}
		case 2: {
			// get
			Object user = session.get(User.class, 2);
			System.out.println(user);
			break;
		}
		case 3: {
			// update
			User user = (User) session.get(User.class, 2);
			System.out.println("User_Get..............");
			System.out.println(user);

			// Update user name
			// String newName = "gourav";

			System.out.println("Please inform me....... \n Are you sure you want to update");
			scanner.nextLine();
			int digite = scanner.nextInt();

			if (digite == 1) {
				System.out.println("Please enter your name for Updation.....");
				scanner.nextLine();
				String newName = scanner.nextLine();
				user.setName(newName);
				System.out.println("User_Update............");
				System.out.println(user);
				session.update(user);
			}
			break;
		}
		case 4: {
			// Remove

			User user = (User) session.get(User.class, 2);

			System.out.println("User_Get..............");
			System.out.println(user);

			System.out.println("Please inform me....... \n Press 1 your object are remove....\n press 2 Particular Remove the name....");
			int digite = scanner.nextInt();

			if (digite == 1) {
				// remove tha Object..........Use delete method to remove the user
				session.delete(user);
				System.out.println("User removed successfully.");

			} else if (digite == 2) {
				// Particular Remove the name
				user.setName(null);
				session.update(user);
				System.out.println("Name removed successfully.");
				System.out.println(user);
			}
			break;
		}

		default:
			System.out.println("Unexpected value: " + key);
		}
	}

}
