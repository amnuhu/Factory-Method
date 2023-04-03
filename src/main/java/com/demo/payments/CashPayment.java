package com.demo.payments;

public class CashPayment implements Payment {
    public void pay() {
        System.out.println("Cash Payment!");
        System.out.println("Payment through Cash after delivery!");
    }
}
