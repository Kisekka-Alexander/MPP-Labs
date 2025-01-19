package lab4.probc;

abstract public class Employee {
    private String empId;

    public void print(){
        System.out.println("Test Print");
    }

    public void calcCompesation(int month, int year){

    }

    abstract public double calcGrossPay(int month, int yr);

}
