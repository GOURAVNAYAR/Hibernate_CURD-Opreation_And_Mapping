package OO_Remove;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {      // Null

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("OO_Remove/Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Object number = session.get(Number.class, 1); // Assuming the ID of the Number object is 1
        System.out.println(number);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
