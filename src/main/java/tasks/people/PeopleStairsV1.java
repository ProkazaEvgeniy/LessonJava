package tasks.people;

import java.util.Arrays;

/**
 * Created by admin on 18.03.2016.
 */
public class PeopleStairsV1 {

    public static void main(String[] args) {

        People tail;
        People people01 = new People("Wihte", null);
        People people02 = new People("Black", null);
        People people03 = new People("Black", null);
        People people04 = new People("Wihte", null);
        People people05 = new People("Black", null);

        people05.next = people04;
        people04.next = people03;
        people03.next = people02;
        people02.next = people01;

        tail = people05;

        System.out.println(toStringRec(people01));
        System.out.println(toStringRec(people02));
        System.out.println(toStringRec(people03));
        System.out.println(toStringRec(people04));
        System.out.println(toStringRec(tail));
    }

    public static String toStringRec(People tail) {
        return (tail == null) ? "*" : tail.hatColor + "->" + toStringRec(tail.next);
    }
}
