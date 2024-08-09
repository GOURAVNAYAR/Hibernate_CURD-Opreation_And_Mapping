package One_to_one_Get;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import CURD_opration.Product;

public class Logic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("One_to_one_Get/Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Id....");
		Object country = session.get(Country.class, scanner.nextInt());
		System.out.println(country);
       
        /*
        for(int i = 1; i <= 5; i++) {
            Capital capital = new Capital();
            capital.setCapitalName("New Delhi " + i);

            Country country = new Country();
            country.setCountryName("India " + i);

            country.setCapital(capital);
            session.save(country);
        }
*/
        transaction.commit();
        session.close();
    }
}
