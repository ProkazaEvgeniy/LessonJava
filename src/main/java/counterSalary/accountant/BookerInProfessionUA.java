package counterSalary.accountant;


import counterSalary.salaryCounter.Salary;
import counterSalary.salaryManDE.SalaryDE;
import counterSalary.salaryManUA.SalaryUA;

/**
 * Created by admin on 11.02.2016.
 */
public class BookerInProfessionUA extends SalaryUA {

    public BookerInProfessionUA(String s) {
        System.out.println("Salary IT for " + s + " is " + salaryIT());
        System.out.println("Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println("Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public BookerInProfessionUA(String s, int a, int b, int c) {

        System.out.println(a + " Salary IT for " + s + " is " + salaryIT());
        System.out.println(b + " Salary Doctor for " + s + " is " + salaryDoctor());
        System.out.println(c + " Salary Engineer for " + s + " is " + salaryEngineer());
    }

    public final void wedSalaryMethod(Salary salaryUA, Salary salaryDE, boolean choice) {
        SalaryDE salaryDE1 = (SalaryDE) salaryDE;

        if (salaryUA.salaryIT() < salaryDE1.salaryEngineer()) {
            if (choice == true) {
                int b = salaryDE1.salaryEngineer() - salaryIT();
                System.out.println("Salary IT UA < salary Engineer DE in " + b);
            } else {
                System.out.println("Salary IT UA < salary Engineer DE");
            }
        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDE1.salaryEngineer();
                System.out.println("Salary IT UA > salary Engineer DE in " + b);
            } else {
                System.out.println("Salary IT UA > salary Engineer DE");
            }
        }
        if (salaryUA.salaryIT() < salaryDE1.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDE1.salaryDoctor() - salaryIT();
                System.out.println("Salary IT UA < salary Doctor UA in " + b);
            } else {
                System.out.println("Salary IT UA < salary Doctor UA");
            }

        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDE1.salaryDoctor();
                System.out.println("Salary IT UA > salary Doctor UA in " + b);
            } else {
                System.out.println("Salary IT UA > salary Doctor UA");
            }
        }
        if (salaryUA.salaryIT() < salaryDE1.salaryIT()) {
            if (choice == true) {
                int b = salaryDE1.salaryIT() - salaryIT();
                System.out.println("Salary IT UA < salary IT DE in " + b);
            } else {
                System.out.println("Salary IT UA < salary IT DE");
            }

        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDE1.salaryIT();
                System.out.println("Salary IT UA > salary IT DE in " + b);
            } else {
                System.out.println("Salary IT UA > salary IT DE");
            }
        }
    }

    public final void wedSalaryMethod(Salary salaryUA, boolean choice) {

        if (salaryUA.salaryIT() < salaryUA.salaryEngineer()) {
            if (choice == true) {
                int b = salaryEngineer() - salaryIT();
                System.out.println("Salary IT UA < salary Engineer UA in " + b);
            } else {
                System.out.println("Salary IT UA < salary Engineer UA");
            }
        } else {
            if (choice == true) {
                int b = salaryIT() - salaryEngineer();
                System.out.println("Salary IT UA > salary Engineer UA in " + b);
            } else {
                System.out.println("Salary IT UA > salary Engineer UA");
            }
        }
        if (salaryUA.salaryIT() < salaryUA.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryIT();
                System.out.println("Salary IT UA < salary Doctor UA in " + b);
            } else {
                System.out.println("Salary IT UA < salary Doctor UA");
            }

        } else {
            if (choice == true) {
                int b = salaryIT() - salaryDoctor();
                System.out.println("Salary IT UA > salary Doctor UA in " + b);
            } else {
                System.out.println("Salary IT UA > salary Doctor UA");
            }
        }
        if (salaryUA.salaryEngineer() < salaryUA.salaryDoctor()) {
            if (choice == true) {
                int b = salaryDoctor() - salaryEngineer();
                System.out.println("Salary Engineer UA < salary Doctor UA in " + b);
            } else {
                System.out.println("Salary Engineer UA < salary Doctor UA");
            }

        } else {
            if (choice == true) {
                int b = salaryEngineer() - salaryDoctor();
                System.out.println("Salary Engineer UA > salary Doctor UA in " + b);
            } else {
                System.out.println("Salary Engineer UA > salary Doctor UA");
            }
        }
    }
}
