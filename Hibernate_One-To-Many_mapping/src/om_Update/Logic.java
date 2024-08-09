package om_Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {
	public static void main(String args[]) {
		SessionFactory sessionFactory = new Configuration().configure("om_Update/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		

		// parent object
		// Country country = (Country) session.get(Country.class, 91);
		  State state1 = new State();
		  
		  state1.setStateId(100012); 
		  state1.setStateName("Banapura");
		  state1.setStatePincord(46845);
		  state1.setForevenId(91);
		/*
		//To proform a Update Opreation in Parent to child.......
		Country country = (Country) session.get(Country.class, 91);
		country.setCountryId(91);
		country.setCountryName("UK");
		*/
		Transaction tx = session.beginTransaction();
		session.update(state1);
		//session.update(country);
		// close opreation.......
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
