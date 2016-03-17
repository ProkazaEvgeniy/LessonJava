package lecture9V1.general;

import lecture9V1.dao.BooksDao;
import lecture9V1.table.Books;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 08.03.2016.
 */
public class Project {
    public static void main(String[] args) throws SQLException{
        Factory factory = Factory.getInstance();
        BooksDao booksDao = factory.getBooksDao();
        Books books = new Books();
        books.setTitle("Java Tutorial");
        books.setDescription("description java language");
        books.setIsbn(3448464);
        booksDao.addBooks(books);
        List<Books> list = booksDao.getBooks();

        for (Books book : list) {
            System.out.println( "id= "              + book.getId() +
                                ", title= "         + book.getTitle() +
                                ", isbn= "          + book.getIsbn() +
                                ", description= "   + book.getDescription() + ";");
        }
    }
}
