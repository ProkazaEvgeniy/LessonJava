package counterSalary.salaryManDE;


import counterSalary.salaryCounter.Salary;

/**
 * Created by admin on 08.02.2016.
 */
public class SalaryDE implements Salary {
    private static final int TIME = 8;
    private static final int FACTOR_COMPLICATION = 1;


    @Override
    public int salaryIT() {
        int remunerationIT = 3000 * FACTOR_COMPLICATION;
        int resultIT;
        resultIT = remunerationIT * TIME;
        return resultIT;
    }

    @Override
    public int salaryEngineer() {
        int remunerationEngineer = 4500 * FACTOR_COMPLICATION;
        int resultEngineer;
        resultEngineer = remunerationEngineer * TIME;
        return resultEngineer;
    }

    @Override
    public int salaryDoctor() {
        int remunerationDoctor = 600 * FACTOR_COMPLICATION;
        int resultDoctor;
        resultDoctor = remunerationDoctor * TIME;
        return resultDoctor;
    }

    public void wedSalaryMethod(Salary salaryDE, Salary salaryUA) {
        SalaryDE salaryDE1 = (SalaryDE) salaryDE;
    }
}
