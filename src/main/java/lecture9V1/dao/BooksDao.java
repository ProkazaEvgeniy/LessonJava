package lecture9V1.dao;

import lecture9V1.table.Books;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 08.03.2016.
 */
public interface BooksDao {
    public void addBooks(Books books) throws SQLException;

    public void deleteBooks(Books books) throws SQLException;

    public Books getBooks(int id) throws SQLException;

    public List<Books> getBooks() throws SQLException;
}
