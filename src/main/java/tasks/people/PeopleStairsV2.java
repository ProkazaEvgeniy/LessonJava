package tasks.people;

/**
 * Created by admin on 19.03.2016.
 */
public class PeopleStairsV2 {
    public static void main(String[] args) {
        People tail;
        tail = new People("Wihte", null);
        tail = new People("Black", tail);
        tail = new People("Black", tail);
        tail = new People("Wihte", tail);
        tail = new People("Black", tail);

        System.out.println(toStringRec(tail));
    }

    public static String toStringRec(People tail) {
        return (tail == null) ? "*" : tail.hatColor + "->" + toStringRec(tail.next);
    }
}
