package OO_Save1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OO_CRUD_Opration.User;
import OO_Save.Address;
import OO_Save.Student;

public class Logic {			//All Done

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_Save1/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		 /*  ****************save Opration*********** */
		Question question = new Question();
		question.setQuestionName("what is java");


		Answer answer = new Answer();
		answer.setAnswerName("Indepanden");
		answer.setQ(question);
	    session.save(answer);

		
	
		tx.commit();
		session.close();      
	}
}
