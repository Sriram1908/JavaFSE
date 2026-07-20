package org.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();

        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();


        Country country = new Country("USA", "Americaa");
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(country);
            tx.commit();
            System.out.println("SuccessfullY Commited...");
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        factory.close();
    }

}