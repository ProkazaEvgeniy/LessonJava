package lecture9V1.dao.impl;

import lecture9V1.dao.BooksDao;
import lecture9V1.table.Books;
import lecture9V1.util.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 08.03.2016.
 */
public class BooksDaoIpml implements BooksDao {
    @Override
    public void addBooks(Books books) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(books);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void deleteBooks(Books books) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(books);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public Books getBooks(int id) throws SQLException {
        Books result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.load(Books.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public List<Books> getBooks() throws SQLException {
        List<Books> books = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Books.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return books;
    }
}
