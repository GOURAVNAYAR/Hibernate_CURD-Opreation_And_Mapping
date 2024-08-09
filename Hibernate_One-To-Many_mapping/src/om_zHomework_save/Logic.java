package om_zHomework_save;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_visual_update.Mobile;
import om_visual_update.Modal;

public class Logic {

	public static void main(String[] args) {
		// Read Configuration
		SessionFactory sessionFactory = new Configuration().configure("om_zHomework_save/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// parent object
		Class classs = new Class();

		classs.setClassId(50008924);
		classs.setClassName("12th");
		classs.setTotalstudentofthaClass(50);
		

		// creating 3 child objects
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Gourav nayar");
		student.setStudentAge(18);
		student.setStudentRollno("17018M02028");
		
		
		Student student1 = new Student();
		student1.setStudentId(102);
		student1.setStudentName("Paven Kahar");
		student1.setStudentAge(19);
		student1.setStudentRollno("17018M02021");
		
		
		Student student2 = new Student();
		student2.setStudentId(103);
		student2.setStudentName("Rohit Verma");
		student2.setStudentAge(18);
		student2.setStudentRollno("17018M02037");
	

		

		// adding child objects to set, as we taken 3rd property set in parent
		Set set = new HashSet();

		set.add(student);
		set.add(student1);
		set.add(student2);
	

		classs.setChildren(set);
		session.save(classs);
		// session.update(pd);
		// session.delete(pd);
		// close opreation.......
		tx.commit();
		session.close();
	}

}
