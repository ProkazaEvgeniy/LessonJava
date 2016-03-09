package lecture8;


import java.util.List;

public class Lecture8 {

    public static void main(String[] args) {

        BookDao bookDao = new BookDao();
//        List<Book> list = bookDao.readAll();
//        List<Book> list = bookDao.createTable();
//        List<Book> list = bookDao.saveBook(4, "The Lord of the Rings", "epic high-fantasy");
        System.out.println(bookDao.readById(4));

//        for (Book book : list) {
//            System.out.println(book);
//        }

    }

}
