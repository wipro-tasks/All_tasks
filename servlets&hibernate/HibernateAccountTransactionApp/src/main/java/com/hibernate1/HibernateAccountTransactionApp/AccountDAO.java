package com.hibernate1.HibernateAccountTransactionApp;
import com.hibernate1.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountDAO {
    private SessionFactory factory;

    public AccountDAO() {
        factory = new Configuration().configure().buildSessionFactory();
    }

    public void addAccount(Account acc) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(acc);
        session.getTransaction().commit();
        session.close();
    }

    public void close() {
        factory.close();
    }
}
