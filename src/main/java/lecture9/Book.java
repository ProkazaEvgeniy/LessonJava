package lecture9;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long bookId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

//    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn (name = "teacher", referencedColumnName = "book_id")
//    private List<Teacher> teachers;

    public Book() {
    }

    public Book(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book is {id: " + bookId + ", name:" + name + ", description: " + description + "}";
    }

}
