package OOP_1.extendsjava;

/**
 * Created by admin on 02.02.2016.
 */
public class Human extends Vertebrates {

    private String sHuman = "Human";

    public void indexHuman() {
        breathe();
        System.out.println(sHuman);
        see();
        System.out.println(sHuman);
    }


}
