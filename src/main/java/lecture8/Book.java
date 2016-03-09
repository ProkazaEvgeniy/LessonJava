package lecture8;

public class Book {

    private long bookId;
    private String title;
    private String description;

    public Book() {
    }

    public Book(long bookId, String title, String description) {
        setBookId(bookId);
        setTitle(title);
        setDescription(description);
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book is {id: " + bookId + ", title: " + title + ", description: " + description + "}";
    }
}
