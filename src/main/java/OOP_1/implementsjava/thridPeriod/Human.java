package OOP_1.implementsjava.thridPeriod;


import OOP_1.implementsjava.firstPeriod.Mammals;

/**
 * Created by admin on 02.02.2016.
 */
public class Human implements Mammals {

    @Override
    public void breathe() {
        System.out.println("I breathe like a human");
    }

    @Override
    public void see() {
        System.out.println("I see how a human");
    }
}
