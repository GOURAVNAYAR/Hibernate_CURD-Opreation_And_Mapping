package One_to_Many_Get;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("One_to_Many_Get/Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("please confirm me that what do you want to do.... \n press 1 to save Data \n press 2 get Data");
		
		int key = scanner.nextInt();

		switch (key) {
		case 1: {
			// parent object
			Book book = new Book();

			book.setBookId(111054);
			book.setBookName("English");
			book.setBookWritername("Gourav");

			// creating 3 child objects
			Topic topic = new Topic();

			topic.setTopicId(101);
			topic.setTopicName("save tree");
			topic.setIMPtopicName("Grow a Tree");

			Topic topic1 = new Topic();

			topic1.setTopicId(102);
			topic1.setTopicName("save Money");
			topic1.setIMPtopicName("How");

			Topic topic2 = new Topic();

			topic2.setTopicId(103);
			topic2.setTopicName("save girl");
			topic2.setIMPtopicName("Stop Raping");

			Set<Topic> s = new HashSet<Topic>();

			s.add(topic);
			s.add(topic1);
			s.add(topic2);

			book.setChildren(s);

			session.save(book);

			// close opreation.......
			tx.commit();

			session.close();
			
			break;

		}
		case 2: {
			System.out.println("Please confirm which Book data you want to see: ");
			int bookId = scanner.nextInt();

			Book book = (Book) session.get(Book.class, bookId);
			if (book != null) {
			    System.out.println("Book Details:");
			    System.out.println("Book Id: " + book.getBookId());
			    System.out.println("Book Name: " + book.getBookName());
			    System.out.println("Book Writer Name: " + book.getBookWritername());

			    System.out.println("Associated Topics:");
			    for (Topic topic : book.getChildren()) {
			        System.out.println("Topic Id: " + topic.getTopicId());
			        System.out.println("Topic Name: " + topic.getTopicName());
			        System.out.println("Important Topic Name: " + topic.getIMPtopicName());
			    }
			} else {
			    System.out.println("No book found with id: " + bookId);
			}

			
			break;

		}

		}

	}
}
