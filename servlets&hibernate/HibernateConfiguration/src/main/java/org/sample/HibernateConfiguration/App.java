package org.sample.HibernateConfiguration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student stu=new Student(101,"deepu",22,"female","jpt","4567895431");
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();  
        Transaction tx=session.beginTransaction();
        session.save(stu);
        tx.commit();
        session.close();
        System.out.println("Record saved successfully");
    }
}
