package Many_to_Many_Remove;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Logic {  //not remove but save

    public static void main(String[] args) {
    	 AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Many_to_Many_Remove/Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Answer an1 = new Answer();
            an1.setAnswername("Java is a programming language");
            an1.setPostedBy("Ravi Malik");

            Answer an2 = new Answer();
            an2.setAnswername("Java is a platform");
            an2.setPostedBy("Sudhir Kumar");

            Question q1 = new Question();
            q1.setQname("What is Java?");
            ArrayList<Answer> l1 = new ArrayList<Answer>();
            l1.add(an1);
            l1.add(an2);
            q1.setAnswers(l1);

            Answer ans3 = new Answer();
            ans3.setAnswername("Servlet is an Interface");
            ans3.setPostedBy("Jai Kumar");

            Answer ans4 = new Answer();
            ans4.setAnswername("Servlet is an API");
            ans4.setPostedBy("Arun");

            Question q2 = new Question();
            q2.setQname("What is Servlet?");
            ArrayList<Answer> l2 = new ArrayList<Answer>();
            l2.add(ans3);
            l2.add(ans4);
            q2.setAnswers(l2);

            session.persist(q1);
            session.persist(q2);

            transaction.commit();
            System.out.println("Data saved successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            System.out.println("Error occurred. Rolling back transaction...");
        } finally {
            session.close();
            factory.close(); // Closing SessionFactory
        }
    }
}
