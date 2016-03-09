package counterSalary.accountant;


import counterSalary.salaryCounter.Salary;
import counterSalary.salaryManDE.SalaryDE;

/**
 * Created by admin on 11.02.2016.
 */
public class BookerInProfessionDE extends SalaryDE {
    public BookerInProfessionDE(String s) {
        System.out.println("Salary IT for " + s + " is " + salaryIT());
        System.out.println("Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println("Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public BookerInProfessionDE(String s, int a, int b, int c) {

        System.out.println(a + " Salary IT for " + s + " is " + salaryIT());
        System.out.println(b + " Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println(c + " Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public final void wedSalaryMethod(Salary salaryDE) {
        if (salaryDE.salaryIT() < salaryDE.salaryEngineer()) {
            System.out.println("Salary IT DE < salary Engineer DE");
        } else {
            System.out.println("Salary IT DE > salary Engineer DE");
        }
        if (salaryDE.salaryIT() < salaryDE.salaryDoctor()) {
            System.out.println("Salary IT DE < salary Doctor DE");
        } else {
            System.out.println("Salary IT DE > salary Doctor DE");
        }
        if (salaryDE.salaryEngineer() < salaryDE.salaryDoctor()) {
            System.out.println("Salary Engineer DE < salary Doctor DE");
        } else {
            System.out.println("Salary Engineer DE > salary Doctor DE");
        }
    }

    public final void wedSalaryMethod(Salary salaryDE, boolean choice) {


        if (salaryDE.salaryIT() < salaryDE.salaryEngineer()) {
            if (choice == true) {
                int b = salaryEngineer() - salaryIT();
                System.out.println("Salary IT DE < salary Engineer DE in " + b);
            } else {
                System.out.println("Salary IT DE < salary Engineer DE");
            }
        } else {
            if (choice == true) {
                int b = salaryIT() - salaryEngineer();
                System.out.println("Salary IT DE > salary Engineer DE in " + b);
            } else {
                System.out.println("Salary IT DE > salary Engineer DE");
            }
        }
        if (salaryDE.salaryIT() < salaryDE.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryIT();
                System.out.println("Salary IT DE < salary Doctor DE in " + b);
            } else {
                System.out.println("Salary IT DE < salary Doctor DE");
            }

        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDoctor();
                System.out.println("Salary IT DE > salary Doctor DE in " + b);
            } else {
                System.out.println("Salary IT DE > salary Doctor DE");
            }
    }
        if (salaryDE.salaryEngineer() < salaryDE.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryEngineer();
                System.out.println("Salary Engineer DE < salary Doctor DE in " + b);
            } else {
                System.out.println("Salary Engineer DE < salary Doctor DE");
            }

        } else {
            if (choice == true) {
                int b = salaryEngineer() - salaryDoctor();
                System.out.println("Salary Engineer DE > salary Doctor DE in " + b);
            } else {
                System.out.println("Salary Engineer DE > salary Doctor DE");
            }
        }
    }
}
