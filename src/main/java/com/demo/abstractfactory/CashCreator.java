package com.demo.abstractfactory;

import com.demo.payments.CashPayment;
import com.demo.payments.Payment;

public class CashCreator extends AbstractPaymentCreator{
    @Override
    public Payment createPayment() {
        System.out.println("Overriding the main Factory (Cash implementation)");
        System.out.println("Getting extra control to implement extra functionalities");
        return new CashPayment();
    }
}
