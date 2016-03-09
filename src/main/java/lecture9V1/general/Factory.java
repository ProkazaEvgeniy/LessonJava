package lecture9V1.general;

import lecture9V1.dao.BooksDao;
import lecture9V1.dao.impl.BooksDaoIpml;

/**
 * Created by admin on 08.03.2016.
 */
public class Factory {
    public static Factory instance = new Factory();
    public BooksDao booksDao;

    private Factory() {}

    public static Factory getInstance() {
        return Factory.instance;
    }

    public BooksDao getBooksDao() {
        if (booksDao == null) {
            booksDao = new BooksDaoIpml();
        }
        return booksDao;
    }
}
