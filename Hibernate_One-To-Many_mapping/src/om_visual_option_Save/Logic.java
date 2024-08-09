package om_visual_option_Save;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Logic {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("om_visual_option_Save/Hivernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Post post = new Post();
		post.setPostId(4845631);
		post.setPostName("save Cow");

		Comment comment1 = new Comment();
		comment1.setCommentId(100);
		comment1.setCommentName("Yes,This is important");
		comment1.setCommentDate("20/22/10");

		Comment comment2 = new Comment();
		comment2.setCommentId(101);
		comment2.setCommentName("I know that sir");
		comment2.setCommentDate("26/22/10");

		Comment comment3 = new Comment();
		comment3.setCommentId(102);
		comment3.setCommentName("there are IMP");
		comment3.setCommentDate("15/22/10");

		Set<Comment> comment = new HashSet<Comment>();
		comment.add(comment1);
		comment.add(comment2);
		comment.add(comment3);

		post.setChildren(comment);
		//session.save(comment2);
		 session.save(post);
		transaction.commit();
		session.close();
	}

}
