package Many_to_One_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Logic {

    public static void main(String[] args) {
        // Load Hibernate configuration
    	  AnnotationConfiguration cfg = new AnnotationConfiguration();
          cfg.configure("Many_to_One_Get/Hibernate.cfg.xml");
          SessionFactory factory = cfg.buildSessionFactory();
          Session session = factory.openSession();

        Transaction transaction = null;

        try {
            // Begin transaction
            transaction = session.beginTransaction();

            // Retrieve Bank entity by its ID
            Integer bankId = 1; // Assuming the ID of the bank you want to retrieve is 1
            Bank bank = (Bank) session.get(Bank.class, bankId);

            // Print retrieved bank details
            if (bank != null) {
                System.out.println("Bank ID: " + bank.getBankId());
                // Print other bank details as needed
            } else {
                System.out.println("Bank not found!");
            }

            // Commit transaction
            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction if there's an error
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session and session factory
            session.close();
        }
    }
}

/*
     Bank bank = new Bank();
        bank.setBankName("Example Bank");

        Customer customer1 = new Customer();
        customer1.setCustomerName("John Doe");
        customer1.setBank(bank);

        Customer customer2 = new Customer();
        customer2.setCustomerName("Jane Smith");
        customer2.setBank(bank);

        bank.getCustomers().add(customer1);
        bank.getCustomers().add(customer2);

        session.save(bank);
        session.save(customer1);
        session.save(customer2);

        transaction.commit();
        session.close();
    }
 */
