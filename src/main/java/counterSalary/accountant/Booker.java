package counterSalary.accountant;


import counterSalary.salaryCounter.Salary;

/**
 * Created by admin on 08.02.2016.
 */
public class Booker {

    public Booker() {
    }

    public void counter(Salary salary, String country) {
        int resultCount;
        resultCount = salary.salaryDoctor() +
                salary.salaryEngineer() +
                salary.salaryIT();
        System.out.println("Result " + country + " = " + resultCount);
    }

    public int counterFofTotal(Salary salary) {
        int resultCount;
        resultCount = salary.salaryDoctor() +
                salary.salaryEngineer() +
                salary.salaryIT();
        return resultCount;
    }
}
