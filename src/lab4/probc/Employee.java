package lab4.probc;

abstract public class Employee {
    private String empId;

    public Employee(String emp){
        this.empId = emp;
    }
    public void print(){
    }

    public PayCheck calcCompesation(int month, int year){
        double grosspay = calcGrossPay(month,year);
        return new PayCheck(
                grosspay,
                0.23*grosspay,
                0.05*grosspay,
                0.01*grosspay,
                0.03*grosspay,
                0.075*grosspay);

    }

    public abstract double calcGrossPay(int month, int yr);

}
