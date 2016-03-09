package OOP_1.implementsjava;


import OOP_1.implementsjava.firstPeriod.Mammals;
import OOP_1.implementsjava.secondPeriod.Vertebrates;
import OOP_1.implementsjava.thridPeriod.Dolphins;
import OOP_1.implementsjava.thridPeriod.Human;

/**
 * Created by admin on 02.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        Vertebrates vertebrates = new Vertebrates();
        Mammals mammals = new Dolphins();
        vertebrates.skillVertebrates(mammals);
        Mammals mammals1 = new Human();
        vertebrates.skillVertebrates(mammals1);
    }

}