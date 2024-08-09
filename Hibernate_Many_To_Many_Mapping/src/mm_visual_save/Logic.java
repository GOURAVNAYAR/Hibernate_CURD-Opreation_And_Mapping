package mm_visual_save;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String args[]) {

		Configuration configuration = new Configuration().configure("mm_visual_save/Hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Job job = new Job();
		job.setJobId(101);
		job.setJobName("patwari");

		Job job1 = new Job();
		job1.setJobId(102);
		job1.setJobName("police");

		Job job2 = new Job();
		job2.setJobId(103);
		job2.setJobName("ssc");
//-----------------------------------------------------------------
		People people1 = new People();
		people1.setPeopleId(1);
		people1.setPeopleName("Gourav");
		people1.setPeopleAge("24");
		people1.setPeopleQulifiction("B.tec");

		People people2 = new People();
		people2.setPeopleId(2);
		people2.setPeopleName("Raghav");
		people2.setPeopleAge("25");
		people2.setPeopleQulifiction("B.com");

		People people3 = new People();
		people3.setPeopleId(3);
		people3.setPeopleName("Durgesh");
		people3.setPeopleAge("29");
		people3.setPeopleQulifiction("B.ca");
//----------------------------------------------------------------------
		Set<People> set = new HashSet<People>();
		set.add(people1);
		set.add(people2);
		set.add(people3);
//--------------------------------------------------------------------
		//st.add(c3);

		job.setPeoples(set);
		job1.setPeoples(set);
		job2.setPeoples(set);
//-------------------------------------------------------------------		
		
		Transaction transaction = session.beginTransaction();

		session.save(job);
		session.save(job1);
		session.save(job2);
//---------------------------------------------------------------------		
		// delete query
		// session.delete(student2); 
		transaction.commit();
		// session.close();

	}
}
