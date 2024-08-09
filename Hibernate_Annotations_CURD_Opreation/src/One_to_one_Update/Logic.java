package One_to_one_Update;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("One_to_one_Update/Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID of the person to update:");
        int personId = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        Person person = (Person) session.get(Person.class, personId);
      
            System.out.println("Current details: " + person);

            System.out.println("Enter the new name:");
            String personNewName = scanner.nextLine();
            person.setPersonName(personNewName);
            System.out.println("Updated details: " + person);
       
        transaction.commit();
        session.close();
    }
}


/*
 * for (int i = 1; i <= 5; i++) {
 * 
 * Passport passport = new Passport(); passport.setPassportName("International"
 * + i);
 * 
 * Person person = new Person(); person.setPersonName("Gourav" + i);
 * 
 * person.setPassport(passport);
 * 
 * session.save(person); }
 */
