package lab4.probc;

import java.time.LocalDate;

public class Order {

    private String orderNo;
    private LocalDate orderDate;
    private double orderAmount;
//    private Commissioned emp;

    Order(String orderNo, LocalDate orderDate, double orderAmount){
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
