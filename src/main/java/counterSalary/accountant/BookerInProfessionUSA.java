package counterSalary.accountant;


import counterSalary.salaryCounter.Salary;
import counterSalary.salaryManUSA.SalaryUSA;

/**
 * Created by admin on 11.02.2016.
 */
public class BookerInProfessionUSA extends SalaryUSA {

    public BookerInProfessionUSA(String s) {
        System.out.println("Salary IT for " + s + " is " + salaryIT());
        System.out.println("Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println("Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public BookerInProfessionUSA(String s, int a, int b, int c) {

        System.out.println(a + " Salary IT for " + s + " is " + salaryIT());
        System.out.println(b + " Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println(c + " Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public final void wedSalaryMethod(Salary salaryUSA) {
        if (salaryUSA.salaryIT() < salaryUSA.salaryEngineer()) {
            System.out.println("Salary IT USA < salary Engineer USA");
        } else {
            System.out.println("Salary IT USA > salary Engineer USA");
        }
        if (salaryUSA.salaryIT() < salaryUSA.salaryDoctor()) {
            System.out.println("Salary IT USA < salary Doctor USA");
        } else {
            System.out.println("Salary IT USA > salary Doctor USA");
        }
        if (salaryUSA.salaryEngineer() < salaryUSA.salaryDoctor()) {
            System.out.println("Salary Engineer USA < salary Doctor USA");
        } else {
            System.out.println("Salary Engineer USA > salary Doctor USA");
        }
    }

    public final void wedSalaryMethod(Salary salaryUSA, boolean choice) {
        if (salaryUSA.salaryIT() < salaryUSA.salaryEngineer()) {
            if (choice == true) {
                int b = salaryEngineer() - salaryIT();
                System.out.println("Salary IT USA < salary Engineer USA in " + b);
            } else {
                System.out.println("Salary IT USA < salary Engineer USA");
            }
        } else {
            if (choice == true) {
                int b = salaryIT() - salaryEngineer();
                System.out.println("Salary IT USA > salary Engineer USA in " + b);
            } else {
                System.out.println("Salary IT USA > salary Engineer USA");
            }
        }
        if (salaryUSA.salaryIT() < salaryUSA.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryIT();
                System.out.println("Salary IT USA < salary Doctor USA in " + b);
            } else {
                System.out.println("Salary IT USA < salary Doctor USA");
            }

        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDoctor();
                System.out.println("Salary IT USA > salary Doctor USA in " + b);
            } else {
                System.out.println("Salary IT USA > salary Doctor USA");
            }
        }
        if (salaryUSA.salaryEngineer() < salaryUSA.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryEngineer();
                System.out.println("Salary Engineer USA < salary Doctor USA in " + b);
            } else {
                System.out.println("Salary Engineer USA < salary Doctor USA");
            }

        } else {
            if (choice == true) {
                int b = salaryEngineer() - salaryDoctor();
                System.out.println("Salary Engineer USA > salary Doctor USA in " + b);
            } else {
                System.out.println("Salary Engineer USA > salary Doctor USA");
            }
        }
    }
}
