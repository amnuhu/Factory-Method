package com.demo.payments;

public class DebitPayment implements  Payment{
    public void pay() {
        System.out.println("Debit Payment!");
        System.out.println("Payment by deducting money from bank account using Debit Account");
    }
}
