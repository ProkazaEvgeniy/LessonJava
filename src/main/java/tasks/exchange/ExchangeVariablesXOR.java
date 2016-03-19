package tasks.exchange;

/**
 * Created by admin on 18.03.2016.
 */
public class ExchangeVariablesXOR {

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
