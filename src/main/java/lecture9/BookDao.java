package lecture9;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// CRUD
public class BookDao {

    public boolean create(Book book) {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            return false;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return true;
    }

    public List readAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createCriteria(Book.class).list();
        } catch (Exception e) {
            return null;
        } finally {
            tx.commit();
            session.close();
        }
    }

    public long add(final Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(book);
            return book.getBookId();
        } finally {
            tx.commit();
            session.close();
        }

    }


}
