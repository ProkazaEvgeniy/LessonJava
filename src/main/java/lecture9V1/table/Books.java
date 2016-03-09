package lecture9V1.table;

import javax.persistence.*;

/**
 * Created by admin on 08.03.2016.
 */

@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "isbn")
    private int isbn;
    @Column(name = "description")
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }
}
