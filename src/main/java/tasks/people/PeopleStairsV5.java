package tasks.people;

/**
 * Created by admin on 20.03.2016.
 */
public class PeopleStairsV5 {
    public static void main(String[] args) {
        String[] arrHat = {"White", "Black", "White", "Black", "Black", "White"};
        for (int i = 0; i < arrHat.length; i++) {
            if (arrHat[i] == arrHat[arrHat.length - 1]) {
                System.out.println(arrHat[i] + " = " + arrHat[arrHat.length - 1]);
            } else {
                System.out.println(arrHat[i] + " != " + arrHat[arrHat.length - 1]);
            }
        }
    }
}
