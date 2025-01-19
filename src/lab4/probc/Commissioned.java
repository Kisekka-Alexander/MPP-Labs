package lab4.probc;

import java.util.*;

public class Commissioned extends Employee{

    private double commission;
    private double baseSalary;
    private Order[] orders;
    public Commissioned(String emp,double commission, double baseSalary, Order[] orders){
        super(emp);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }


    @Override
    public double calcGrossPay(int month, int yr) {
        double totalOrderAmount = 0.0;
        for (Order ord: orders){
            if (ord.getOrderDate().getMonthValue() == month && ord.getOrderDate().getYear() == yr) {
                totalOrderAmount += ord.getOrderAmount();
            }
        }
        return baseSalary + (commission*totalOrderAmount);
    }
}
