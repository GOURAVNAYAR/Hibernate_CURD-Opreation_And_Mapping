package mm_save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mm_Delete.Brother;
import mm_Delete.Sister;

public class Logic {
	
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("mo_delete/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// child object........ one
		Book book = new Book();

		book.setBookId(50024);
		book.setBookName("Pooja");

		// creating 3 Parent objects............many
		Page page = new Page();
		page.setPageId(101);
		page.setPageName("Web_Appliction");

		session.beginTransaction();

		session.save(book);
		session.save(page);
		
		// close opreation.......
		session.getTransaction().commit();
		session.close();
	}
}
