package Many_to_One_Remove;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Logic {  //NO

    public static void main(String[] args) {
    	  AnnotationConfiguration cfg = new AnnotationConfiguration();
          cfg.configure("Many_to_One_Remove/Hibernate.cfg.xml");
          SessionFactory factory = cfg.buildSessionFactory();
          Session session = factory.openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Number number = new Number();
            number.setValue("1234567890");
            session.save(number);

            Person person = new Person();
            person.setName("John Doe");
            person.setNumber(number);
            session.save(person);

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
        }
    }
}
