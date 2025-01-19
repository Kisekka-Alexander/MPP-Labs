package lab4.probc;

public class Salaried extends Employee {

    private double salary;

    public Salaried(String emp,double salary){
        super(emp);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int yr){
        return salary;
    }
}
