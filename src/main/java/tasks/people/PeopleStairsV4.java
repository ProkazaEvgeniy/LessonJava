package tasks.people;

/**
 * Created by admin on 18.03.2016.
 */
public class PeopleStairsV4 {

    public static void main(String[] args) {

        People tail = _("White", "Black", "White", "White");
        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));
        System.out.println(toStringRecFull(tail));
    }

    private static String toStringIter(People tail) {
        String result = "";
        while (tail != null) {
            result += tail.hatColor + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    public static String toStringRec(People tail) {
        return (tail == null) ? "*" : tail.hatColor + "->" + toStringRec(tail.next);
    }

    public static String toStringRecFull(People tail) {
        if (tail == null) return  "*";
        else return tail.hatColor + "->" + toStringRec(tail.next);
    }

    public static People _(String... hatColor) {
        People tail = null;
        for (int i = hatColor.length - 1; i >= 0; i--) {
            tail = new People(hatColor[i], tail);
        }
        return tail;
    }


}
