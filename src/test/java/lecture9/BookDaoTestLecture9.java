package lecture9;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 08.03.2016.
 */
public class BookDaoTestLecture9 {

    @Test
    public void testNew() throws Exception {
        BookDao bookDao = new BookDao();
        Book book = new Book("terr", "rere");
        bookDao.create(book);
        Assert.assertEquals(Book.class, Book.class);

    }

}