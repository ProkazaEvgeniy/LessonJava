package lecture9V1.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by admin on 08.03.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {}

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
