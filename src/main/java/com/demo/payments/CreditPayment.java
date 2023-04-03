package com.demo.payments;

public class CreditPayment implements Payment{
    public void pay() {
        System.out.println("Credit Payment!");
        System.out.println("Payment through Credit Card");
    }
}
