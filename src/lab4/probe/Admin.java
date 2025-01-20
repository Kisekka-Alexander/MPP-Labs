package lab4.probe;

import java.util.List;

public class Admin {

    public static Double computeUpdatedBalanceSum(List<Employee> emps){
        Double updatedBalSum = 0.0;
        for (Employee emp: emps){
            updatedBalSum += emp.computeUpdatedBalanceSum();
        }

        return  updatedBalSum;
    }
}
