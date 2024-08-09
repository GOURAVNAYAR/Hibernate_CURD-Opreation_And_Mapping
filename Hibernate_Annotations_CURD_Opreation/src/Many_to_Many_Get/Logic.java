package Many_to_Many_Get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class Logic {

    public static void main(String[] args) {
        // Create configuration
    	 AnnotationConfiguration cfg = new AnnotationConfiguration();
         cfg.configure("Many_to_Many_Get/Hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         Session session = factory.openSession();

      
        try {
            // Start transaction
            Transaction transaction = session.beginTransaction();

            // Perform get operation to retrieve a Course entity by its ID
            int courseId = 1; // Specify the ID of the course you want to retrieve
            Course course = (Course) session.get(Course.class, courseId);

            if (course != null) {
                System.out.println("Course Name: " + course.getName());
                System.out.println("Associated Students:");
                for (Student student : course.getStudents()) {
                    System.out.println("- " + student.getName());
                }
            } else {
                System.out.println("Course not found!");
            }

            // Commit transaction
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred. Rolling back transaction...");
            // Rollback transaction in case of error
            session.getTransaction().rollback();
        } finally {
            // Close session and session factory
            session.close();
            factory.close();
        }
    }
}
