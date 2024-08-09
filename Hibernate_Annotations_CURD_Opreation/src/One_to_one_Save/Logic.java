package One_to_one_Save;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class Logic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("One_to_one_Save/Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Address address = new Address();
        address.setCity("Timarni");
        
        Student student = new Student();
        student.setStudentName("Raghav");
        
        address.setStudent(student);
        student.setAddress(address);
        
        session.save(student);
        transaction.commit();
        session.close();        
    }
}
