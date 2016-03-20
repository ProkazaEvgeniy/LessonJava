package tasks.people.merge;

import tasks.people.People;

import java.util.Arrays;

/**
 * Created by admin on 19.03.2016.
 */
public class AppMerge {
    public static void main(String[] args) {
        People tailA = _("White", "White");
        People tailB = _("Black", "Black");
        System.out.println(toString(tailA));
        System.out.println(toString(tailB));
        System.out.println(toString(merge(tailA, tailB)));
    }

    private static String toString(People tail) {
        String result = "";
        while (tail != null) {
            result += tail.hatColor + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    private static People merge(People tailA, People tailB) {
        if (tailA != null && tailB != null) {
            return new People(tailA.hatColor, merge(tailA.next, tailB));
        } else return (tailA == null) ? tailA : tailB;
    }

    public static People _(String... hatColor) {
        People tail = null;
        for (int i = hatColor.length - 1; i >= 0; i--) {
            tail = new People(hatColor[i], tail);
        }
        return tail;
    }

}
