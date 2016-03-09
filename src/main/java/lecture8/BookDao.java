package lecture8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// CRUD
public class BookDao {

    public Book readById(int id) {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        Book book = new Book();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book where book_id = " + id);

            while (resultSet.next()) {
                book.setBookId(resultSet.getInt("book_id"));
                book.setTitle(resultSet.getString("name"));
                book.setDescription(resultSet.getString("description"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnManager.close(connection);
        return book;
    }


    public List<Book> createTable(String nameTable, int book_id, String name, String description) {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        List<Book> list = new ArrayList<>();

        try {
            statement = connection.createStatement();
            statement.execute("create table " + nameTable + "(" + book_id + " int, " + name + " varchar(255), " + description + " varchar(255) );");
            Book book = new Book();
            list.add(book);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnManager.close(connection);
        return list;
    }

    public List<Book> saveBook(int id, String nameBook, String description) {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        List<Book> list = new ArrayList<>();

        try {
            statement = connection.createStatement();
            Book book = new Book(id, "'" + nameBook + "'", "'" + description + "'");
            statement.execute("insert into book values(" + book.getBookId() + "," + book.getTitle() + "," + book.getDescription() + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnManager.close(connection);
        return list;
    }

    public List<Book> readAll() {
        Connection connection = DBConnManager.getConnection();
        Statement statement = null;
        List<Book> list = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from book");

            while (resultSet.next()) {
                Book book = new Book();
                book.setBookId(resultSet.getInt("book_id"));
                book.setTitle(resultSet.getString("name"));
                book.setDescription(resultSet.getString("description"));
                list.add(book);
            }

        } catch (SQLException sqle) {
            System.out.println("blah");
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        DBConnManager.close(connection);
        return list;
    }


}
