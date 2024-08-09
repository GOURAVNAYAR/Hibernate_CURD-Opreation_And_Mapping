package OO_visualGet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import OO_Save.Address;
import OO_Save.Student;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("OO_visualGet/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
	/*	
		Object question = session.get(Question.class, 1);
		System.out.println(question);
		*/
		
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
