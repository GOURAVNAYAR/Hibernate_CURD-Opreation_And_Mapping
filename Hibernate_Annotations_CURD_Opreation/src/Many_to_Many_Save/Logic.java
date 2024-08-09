package Many_to_Many_Save;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Logic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Many_to_Many_Save/Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        // Creating artists
        Artist artist = new Artist();
        artist.setArtistId(500);
        artist.setArtistName("Alice");

        Artist artist1 = new Artist(); // Corrected variable name
        artist1.setArtistId(501); // Corrected variable name
        artist1.setArtistName("Bob"); // Corrected variable name

        // Creating songs
        Song song = new Song();
        song.setSongId(100);
        song.setSongName("tum mile");

        Song song1 = new Song();
        song1.setSongId(101);
        song1.setSongName("sb kuch tum");

        Set<Song> set = new HashSet<Song>();
        set.add(song);
        set.add(song1);

        // Set songs for artists
        artist.setSongs(set);
        artist1.setSongs(set);

        session.save(artist);
        session.save(artist1);

        transaction.commit();
        session.close();
    }
}
