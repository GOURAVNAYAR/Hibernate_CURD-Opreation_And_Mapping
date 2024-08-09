package om_Get;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import om_zHomework_update.Children;

public class Logic {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_get/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Bank bank = (Bank) session.get(Bank.class, 1415);
		Set<Customer> customer = bank.getChildren();
		System.out.println(customer);
		session.close();
		sessionFactory.close();

		/*
		 * // parent objectz Bank bank2 = new Bank();
		 * 
		 * bank2.setBankId(430000815); bank2.setBankName("SBI");
		 * 
		 * // creating 3 child objects Customer customer1 = new Customer();
		 * customer1.setCustomerId(101); customer1.setCustomerName("Gourav Nayar");
		 * customer1.setCustomerNumber(991548261);
		 * customer1.setCustomerAccountType("Saving");
		 * customer1.setCustomerAccountnumber(891004578);
		 * 
		 * Customer customer2 = new Customer(); customer2.setCustomerId(102);
		 * customer2.setCustomerName("Ankit verma");
		 * customer2.setCustomerNumber(884548261);
		 * customer2.setCustomerAccountType("Saving");
		 * customer2.setCustomerAccountnumber(811100457);
		 * 
		 * Customer customer3 = new Customer(); customer3.setCustomerId(103);
		 * customer3.setCustomerName("Gourav Kahar");
		 * customer3.setCustomerNumber(779005482);
		 * customer3.setCustomerAccountType("Saving");
		 * customer3.setCustomerAccountnumber(1110045781);
		 * 
		 * Customer customer4 = new Customer(); customer4.setCustomerId(104);
		 * customer4.setCustomerName("Ankur Kewat");
		 * customer4.setCustomerNumber(771548269);
		 * customer4.setCustomerAccountType("Saving");
		 * customer4.setCustomerAccountnumber(1004578176);
		 * 
		 * Customer customer5 = new Customer(); customer5.setCustomerId(105);
		 * customer5.setCustomerName("Gourav Nayar");
		 * customer5.setCustomerNumber(998848261);
		 * customer5.setCustomerAccountType("Saving");
		 * customer5.setCustomerAccountnumber(910045781);
		 * 
		 * Customer customer6 = new Customer(); customer6.setCustomerId(106);
		 * customer6.setCustomerName("Sunil Agrwal");
		 * customer6.setCustomerNumber(991348268);
		 * customer6.setCustomerAccountType("Saving");
		 * customer6.setCustomerAccountnumber(904578178);
		 * 
		 * Customer customer7 = new Customer(); customer7.setCustomerId(107);
		 * customer7.setCustomerName("Pavan ji");
		 * customer7.setCustomerNumber(771548297);
		 * customer7.setCustomerAccountType("Saving");
		 * customer7.setCustomerAccountnumber(1110045744);
		 * 
		 * Customer customer8 = new Customer(); customer8.setCustomerId(108);
		 * customer8.setCustomerName("Piyush pandit");
		 * customer8.setCustomerNumber(749548278);
		 * customer8.setCustomerAccountType("Saving");
		 * customer8.setCustomerAccountnumber(988845781);
		 * 
		 * Customer customer11 = (Customer) session.get(Customer.class,430000815);
		 * System.out.println("id: "+customer11.getCustomerId());
		 * System.out.println("name: "+customer11.getCustomerName());
		 * 
		 * 
		 */

	}

}
