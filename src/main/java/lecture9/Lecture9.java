package lecture9;


public class Lecture9 {

    public static void main(String[] args) {

        BookDao bookDao = new BookDao();
        Book book = new Book("Super Speed Maximum", "World Description");
        bookDao.create(book);
//        book = new Book("Super Speed Maximum", "); drop table book;");
//        System.out.println(bookDao.create(book));
//        System.out.println(bookDao.readAll());
        //

    }

}
