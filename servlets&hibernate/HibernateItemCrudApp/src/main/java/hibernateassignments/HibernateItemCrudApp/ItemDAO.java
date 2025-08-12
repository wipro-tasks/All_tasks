package hibernateassignments.HibernateItemCrudApp;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class ItemDAO {
    private SessionFactory factory;

    public ItemDAO() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public void addItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();
        session.close();
    }

    public List<Item> getAllItems() {
        Session session = factory.openSession();
        List<Item> list = session.createQuery("from Item", Item.class).list();
        session.close();
        return list;
    }

    public void updateItem(Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(item);
        tx.commit();
        session.close();
    }

    public void deleteItem(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Item item = session.get(Item.class, id);
        if (item != null) {
            session.delete(item);
        }
        tx.commit();
        session.close();
    }

    public Item getItemById(int id) {
        Session session = factory.openSession();
        Item item = session.get(Item.class, id);
        session.close();
        return item;
    }

    public void close() {
        factory.close();
    }
}
