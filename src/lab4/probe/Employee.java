package lab4.probe;

import java.util.*;

public class Employee {
    public String name;
    public List<Account> accounts;

    public Employee(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acct){
        accounts.add(acct);
    }

    public Double computeUpdatedBalanceSum(){
        Double balSum = 0.0;
        for (Account acc: accounts){
            balSum += acc.computeUpdatedBalance();
        }
        return balSum;
    }
}
