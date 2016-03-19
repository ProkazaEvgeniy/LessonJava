package tasks.people;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

/**
 * Created by admin on 19.03.2016.
 */
public class PeopleStairsV3 {
    public static void main(String[] args) {
        People tail = genIter("White","Black","White","White","Black");
    }

    public static People genIter(String... hatColor) {
        People tail = null;
        for (int i = hatColor.length - 1; i >= 0; i--) {
            tail = new People(hatColor[i], tail);
        }
        return tail;
    }

    public static People genRecFull(String... hatColor) {
        if (hatColor.length == 0) {
            return null;
        } else {
            String[] newArray = Arrays.copyOfRange(hatColor, 1, hatColor.length);
            People next = genRecFull(newArray);
            return new People(hatColor[0], next);
        }
    }

    public static People genRec(String... hatColor) {
        return hatColor.length == 0 ? null : genRec(copyOfRange(hatColor, 1, hatColor.length));
    }
}
