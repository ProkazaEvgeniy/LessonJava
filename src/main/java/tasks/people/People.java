package tasks.people;

/**
 * Created by admin on 19.03.2016.
 */
public class People {

    public String hatColor;
    public People next;

    public People(String hatColor, People next) {
        this.hatColor = hatColor;
        this.next = next;
    }

}
