package CURD_opration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.Iterator;

public class Logic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("CURD_opration/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		boolean exit = false;

		while (!exit) {
			System.out.println(
					"press 1 will be saved  \n press 2 will be get \n press 3 will be update \n press 4 will be remove ");
			Scanner scanner = new Scanner(System.in);
			int key = scanner.nextInt();

			switch (key) {
			case 1: {

				// save

				Product product = new Product();
				System.out.println("Enter Id:");
				product.setProductId(scanner.nextInt());
				scanner.nextLine(); // consume newline

				System.out.println("Enter Manufacturing:");
				product.setProductManufacturing(scanner.nextLine());

				System.out.println("Enter Name:");
				product.setProductName(scanner.nextLine());

				System.out.println("Enter Price:");
				product.setProductPrice(scanner.nextInt());

				session.save(product);
				System.out.println("Product saved successfully.");

				transaction.commit(); // Commit the transaction
				break;
			}
			case 2: {
				// get
				System.out.println("Enter a Id....");
				Object product = session.get(Product.class, scanner.nextInt());
			//	Product product = (Product) session.get(Product.class,2);
				System.out.println(product);
				transaction.commit();

				break;
			}
			case 3: {
				// update
				System.out.println("Please confirm which column you want to operation on ");
				Product product = (Product) session.get(Product.class, scanner.nextInt());
				System.out.println("User_Get..............");
				System.out.println(product);

				// Update user name
				// String newName = "gourav";

				System.out.println(
						"Please inform me....... \n Are you sure you want to update So \n press 1 Update Your name \n press 2 Update Your productManufacturing \n press 3 Update Your productPrice");
				scanner.nextLine();
				int digite = scanner.nextInt();

				if (digite == 1) {

					System.out.println("Please enter your name for Updation.....");
					scanner.nextLine();
					String newName = scanner.nextLine();
					product.setProductName(newName);
					System.out.println("User_Update............");
					System.out.println(product);
					session.update(product);
					transaction.commit();
				}
				if (digite == 2) {
					System.out.println("Please enter your productManufacturing for Updation.....");
					scanner.nextLine();
					String newName = scanner.nextLine();
					product.setProductManufacturing(newName);
					System.out.println("User_Update............");
					System.out.println(product);
					session.update(product);
					transaction.commit();
				}
				if (digite == 3) {
					System.out.println("Please enter your productPrice for Updation.....");
					scanner.nextLine();
					int newName = scanner.nextInt();
					product.setProductPrice(newName);
					System.out.println("User_Update............");
					System.out.println(product);
					session.update(product);
					transaction.commit();
				}
				break;
			}
			case 4: {
				// Remove
				System.out.println("Please confirm which column you want to operation on ");
				Product product = (Product) session.get(Product.class, scanner.nextInt());

				System.out.println("User_Get..............");
				System.out.println(product);

				System.out.println(
						"Please inform me....... \n Press 1 your Colume are remove....\n press 2 Particular Remove the Function....");
				int digite = scanner.nextInt();

				if (digite == 1) {
					// remove tha Object..........Use delete method to remove the user
					session.delete(product);

					System.out.println("Product removed successfully.");
					transaction.commit();

				} else if (digite == 2) {
					// Particular Remove the name

					System.out.println(
							"Please inform me....... \n Are you sure you want to Remove So \n press 1 Remove Your name \n press 2 Remove Your productManufacturing \n press 3 Remove Your productPrice");
					scanner.nextLine();
					int Digite = scanner.nextInt();

					if (Digite == 1) {
						product.setProductName(null);
						session.update(product);
						System.out.println("Name removed successfully.");
						System.out.println(product);
						transaction.commit();
					}
					if (Digite == 2) {
						product.setProductManufacturing(null);
						session.update(product);
						System.out.println("Name removed successfully.");
						System.out.println(product);
						transaction.commit();
					}
					if (Digite == 3) {
						product.setProductPrice(0);
						session.update(product);
						System.out.println("Name removed successfully.");
						System.out.println(product);
						transaction.commit();
					}
					break;
				}
			}

			}
			session.close();

		}
	}

}
