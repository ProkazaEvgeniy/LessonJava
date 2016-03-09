package counterSalary;


import counterSalary.accountant.Booker;
import counterSalary.accountant.BookerInProfessionDE;
import counterSalary.accountant.BookerInProfessionUA;
import counterSalary.salaryCounter.Salary;
import counterSalary.salaryManDE.SalaryDE;
import counterSalary.salaryManUA.SalaryUA;

public class Main {

    public static void main(String[] args) {

        Booker booker = new Booker();
        Salary salaryDE = new SalaryDE();
        BookerInProfessionDE bookerInProfessionDE = new BookerInProfessionDE("DE", 1, 2, 3);
//        //        bookerInProfessionDE.wedSalaryMethod(salaryDE);
        System.out.println("\n");
//        bookerInProfessionDE.wedSalaryMethod(salaryDE, true);
//        booker.counter(salaryDE, "DE");
//        System.out.println("\n");

        Salary salaryUA = new SalaryUA();
        BookerInProfessionUA bookerInProfessionUA = new BookerInProfessionUA("UA");
//        bookerInProfessionUA.wedSalaryMethod(salaryUA);
            System.out.println("\n");
        bookerInProfessionUA.wedSalaryMethod(salaryUA, salaryDE, true);
//        booker.counter(salaryUA, "UA");
        System.out.println("\n");

//        Salary salaryUSA = new SalaryUSA();
//        BookerInProfessionUSA bookerInProfessionUSA = new BookerInProfessionUSA("USA", 1, 2, 3);
//        //        bookerInProfessionUA.wedSalaryMethod(salaryUSA);
//        System.out.println("\n");
//        bookerInProfessionUSA.wedSalaryMethod(salaryUSA, true);
//        booker.counter(salaryUSA, "USA");
//        System.out.println("\n");
//        int total;
//        total = booker.counterFofTotal(salaryDE) +
//                booker.counterFofTotal(salaryUA) +
//                booker.counterFofTotal(salaryUSA);
//        System.out.println("Total = " + total);
    }
}
