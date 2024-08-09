package mm_visual_delete;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Logic {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            try {
                // Create students
                mm_visual_delete.Student student1 = new mm_visual_delete.Student();
                student1.setStudentName("Alice");
                student1.setStudentAddress("123 Main St");

                mm_visual_delete.Student student2 = new mm_visual_delete.Student();
                student2.setStudentName("Bob");
                student2.setStudentAddress("456 Elm St");

                // Create games
                Games game1 = new Games();
                game1.setGamesName("Football");

                Games game2 = new Games();
                game2.setGamesName("Basketball");

                // Associate students with games
                student1.getGames().add(game1);
                student1.getGames().add(game2);
                student2.getGames().add(game1);

                // Save entities
                session.save(student1);
                session.save(student2);

                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    }
}
