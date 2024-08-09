package om_zHomeWork_get;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_zHomeWork_get/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Person person = (Person) session.get(Person.class, 83008924);
		
		Set<Card> card = person.getChildren();
		System.out.println(card);
		
		
/*
		// parent object
		Person person = new Person();

		person.setPersonId(83008924);
		person.setPersonName("Radikha");

		// creating 3 child objects
		Card card = new Card();
		card.setCardId(101);
		card.setCardName("Debit card");
		card.setCardType("SBI Bank");

		Card card1 = new Card();
		card1.setCardId(102);
		card1.setCardName("Atm Card");
		card1.setCardType("SBI Bank");

		Card card2 = new Card();
		card2.setCardId(103);
		card2.setCardName("Credit cards");
		card2.setCardType("SBI bank");

		Card card3 = new Card();
		card3.setCardId(104);
		card3.setCardName("Credit card");
		card3.setCardType("SBI Bank");

		Card card4 = new Card();
		card4.setCardId(105);
		card4.setCardName("Prepaid cards");
		card4.setCardType("SBI Bank");

		Card card5 = new Card();
		card5.setCardId(106);
		card5.setCardName("Mastercard");
		card5.setCardType("SBI bank");

		// adding child objects to set, as we taken 3rd property set in parent
		Set<Card> set = new HashSet<Card>();

		set.add(card1);
		set.add(card2);
		set.add(card3);
		set.add(card4);
		set.add(card5);
	
		person.setChildren(set);
		session.save(person);	*/
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();

	}
}
