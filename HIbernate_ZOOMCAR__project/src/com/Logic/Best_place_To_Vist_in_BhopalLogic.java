package com.Logic;

import com.Dto.Best_place_To_Vist_in_Bhopal;
import com.Dto.Popular_place;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.HashSet;
import java.util.Set;

public class Best_place_To_Vist_in_BhopalLogic {

    public static void main(String[] args) {

        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Popular_place pp = new Popular_place();
        pp.setPopular_placeId(1);

        Best_place_To_Vist_in_Bhopal bb1 = new Best_place_To_Vist_in_Bhopal();
        bb1.setBestplaceToVistinBhopalId(11);
        bb1.setBestplaceToVistinBhopalLocation("Upper Lake");

        Best_place_To_Vist_in_Bhopal bb2 = new Best_place_To_Vist_in_Bhopal();
        bb2.setBestplaceToVistinBhopalId(22);
        bb2.setBestplaceToVistinBhopalLocation("Van Vihar National Park");

        Best_place_To_Vist_in_Bhopal bb3 = new Best_place_To_Vist_in_Bhopal();
        bb3.setBestplaceToVistinBhopalId(33);
        bb3.setBestplaceToVistinBhopalLocation("Bhojpur Temple");

        Best_place_To_Vist_in_Bhopal bb4 = new Best_place_To_Vist_in_Bhopal();
        bb4.setBestplaceToVistinBhopalId(44);
        bb4.setBestplaceToVistinBhopalLocation("Taj UL Masjid");

        Best_place_To_Vist_in_Bhopal bb5 = new Best_place_To_Vist_in_Bhopal();
        bb5.setBestplaceToVistinBhopalId(55);
        bb5.setBestplaceToVistinBhopalLocation("Sadar Manzil");

        Best_place_To_Vist_in_Bhopal bb6 = new Best_place_To_Vist_in_Bhopal();
        bb6.setBestplaceToVistinBhopalId(66);
        bb6.setBestplaceToVistinBhopalLocation("State Museum of MP");

        Set<Best_place_To_Vist_in_Bhopal> bd = new HashSet<>();
        bd.add(bb1);
        bd.add(bb2);
        bd.add(bb3);
        bd.add(bb4);
        bd.add(bb5);
        bd.add(bb6);

        pp.setBestplacetovistinbhopal(bd);

        session.save(pp);

        transaction.commit();
        session.close();
    }
}
