package om_visual_delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_Get.Mobile;
import om_visual_Get.Person;

public class Logic {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("om_visual_delete/Hiberante.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Whatapp whatapp= new Whatapp();

		whatapp.setWhatappId(83008924);
		whatapp.setWhatappName("GB Whatapp");

		// creating 3 child objects
		Message ms = new Message();
		ms.setMessageId(101);
		ms.setMessageName("Hyy");
		ms.setMessageTime("20.20");
		ms.setParentObjects(whatapp);
		
		
		Message ms1 = new Message();
		ms1.setMessageId(102);
		ms1.setMessageName("Hello");
		ms1.setMessageTime("18.50");
		ms1.setParentObjects(whatapp);
		
		Message ms2 = new Message();
		ms2.setMessageId(103);
		ms2.setMessageName("hii");
		ms2.setMessageTime("02.50");
		ms2.setParentObjects(whatapp);
		
		Message ms3 = new Message();
		ms3.setMessageId(104);
		ms3.setMessageName("kese ho");
		ms3.setMessageTime("08.00");
		ms3.setParentObjects(whatapp);
		
		Message ms4 = new Message();
		ms4.setMessageId(105);
		ms4.setMessageName("kha ho");
		ms4.setMessageTime("03.20");
		ms4.setParentObjects(whatapp);
		

		session.save(ms);
		session.save(ms1);
		session.save(ms2);
		session.save(ms3);
		session.save(ms4);
		
		transaction.commit();
		session.close();
	}
}
