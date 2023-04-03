package com.demo.payments;

public class MoMoPayment implements Payment{
    public void pay() {
        System.out.println("Mobile Money Payment!");
        System.out.println("Payment by deducting money from Mobile Money Account");
    }
}
