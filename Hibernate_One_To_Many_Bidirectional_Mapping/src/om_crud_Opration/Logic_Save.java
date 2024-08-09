package om_crud_Opration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic_Save {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_crud_Opration/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		// parent object
		Vendor vendor = new Vendor();
		vendor.setVendorId(430000815);
		vendor.setVendorName("SBI");

		// creating 4 child objects
		Customer customer1 = new Customer();
		customer1.setCustomerId(101);
		customer1.setCustomerName("Gourav Nayar");
		customer1.setParentObjets(vendor);
		customer1.setForevenId(vendor.getVendorId()); // Set forevenId to link with parent Vendor

		Customer customer2 = new Customer();
		customer2.setCustomerId(102);
		customer2.setCustomerName("Ankit verma");
		customer2.setParentObjets(vendor);
		customer2.setForevenId(vendor.getVendorId()); // Set forevenId to link with parent Vendor

		Customer customer3 = new Customer();
		customer3.setCustomerId(103);
		customer3.setCustomerName("Gourav Kahar");
		customer3.setParentObjets(vendor);
		customer3.setForevenId(vendor.getVendorId()); // Set forevenId to link with parent Vendor

		Customer customer4 = new Customer();
		customer4.setCustomerId(104);
		customer4.setCustomerName("Ankur Kewat");
		customer4.setParentObjets(vendor);
		customer4.setForevenId(vendor.getVendorId()); // Set forevenId to link with parent Vendor

		// one to many...........save Opration
		
		  Set<Customer> customers = new HashSet<>();
		  customers.add(customer1);
		  customers.add(customer2);
		  customers.add(customer3);
		  customers.add(customer4);
		  
		  vendor.setChildren(customers);
		   session.save(vendor);
		  
		 

		// many-to-one...........save Opration
/*
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		session.save(customer4);
*/
		// close operation.......
		tx.commit();
		session.close(); // customer1.setParentObjets(vendor); ye likha hai but abi run nhi kiya hai 

	}
}
