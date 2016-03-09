package lecture9;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "SuperMagazine")
public class Magazine {

    @Id
    @Column(name = "ID")
    private int id;
}
