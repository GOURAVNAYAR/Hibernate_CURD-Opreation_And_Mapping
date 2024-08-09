package om_crud_Opration;

import java.util.Set;

import org.hibernate.Session;			//NO.......................
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import om_zHomework_update.Children;

public class Logic {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("om_crud_Opration/Hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();

		//***********************************************************************************GET**********************************
	/*	  Playground playground = (Playground) session.get(Playground.class, 1);

	        // Display retrieved Playground information
	        System.out.println("Retrieved Playground:");
	        System.out.println("ID: " + playground.getPlaygroundId());
	        System.out.println("Name: " + playground.getPlaygroundName());

	        // Commit transaction and close resources
	        transaction.commit();
	        session.close();
	        sessionFactory.close();*/
		
	//***************************************************************************************SAVE OPRATION****************************
	
		 // Creating a Playground object
    /*    Playground playground = new Playground();
        playground.setPlaygroundName("ground");

        // Creating a Games object
        Games games = new Games();
        games.setGamesName("Football");
        games.setGamesTotalplayer(22);
        games.setParentObjects(playground); // Setting the parent Playground object

        // Saving the Games object
        session.save(games);
		
		session.getTransaction().commit();
		session.close();*/
		 
		 
		//****************************************************************************************Update OPRATION****************************
		 
/*		 Object playground = session.get(Playground.class, 1);
		   // Update the Playground object
		    ((Playground) playground).setPlaygroundName("LKG");

		    // Save the updated object
		    session.update(playground);
		    transaction.commit();
		    System.out.println("Playground updated successfully!");   */
		
		//****************************************************************************************remove OPRATION****************************
		 
/*		 Object playground = session.get(Playground.class, 1);

	      // Delete the Playground object
	         session.delete(playground);

	           
	         System.out.println("Playground removed successfully!");
	         
	        transaction.commit();
	        session.close();
	        sessionFactory.close();			*/
		 
	}
}

/*

*/