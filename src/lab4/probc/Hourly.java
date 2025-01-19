package lab4.probc;

public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;
    public Hourly(String emp,double hourlyWage, int hoursPerWeek){
        super(emp);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
    @Override
    public double calcGrossPay(int month, int yr){
        return hourlyWage * hoursPerWeek * 4;
    }
}
