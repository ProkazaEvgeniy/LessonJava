package counterSalary.salaryManUA;


import counterSalary.salaryCounter.Salary;

/**
 * Created by admin on 08.02.2016.
 */
public class SalaryUA implements Salary {
    private static final byte TIME = 8;
    private static final double FACTOR_COMPLICATION = 1;



    @Override
    public int salaryIT() {
        int remunerationIT = (int) (1000 * FACTOR_COMPLICATION);
        int resultIT;
        resultIT = remunerationIT * TIME;
        return resultIT;
    }

    @Override
    public int salaryEngineer() {
        int remunerationEngineer = (int) (50 * FACTOR_COMPLICATION);
        int resultEngineer;
        resultEngineer = remunerationEngineer * TIME;
        return resultEngineer;
    }

    @Override
    public int salaryDoctor() {
        int remunerationDoctor = (int) (80 * FACTOR_COMPLICATION);
        int resultDoctor;
        resultDoctor = remunerationDoctor * TIME;
        return resultDoctor;
    }
}
