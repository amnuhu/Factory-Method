package com.demo.abstractfactory;

import com.demo.payments.CreditPayment;
import com.demo.payments.DebitPayment;
import com.demo.payments.Payment;

public class CreditCreator extends AbstractPaymentCreator{
    @Override
    public Payment createPayment() {
        System.out.println("Overriding the main Factory (Credit implementation)");
        System.out.println("Getting extra control to implement extra functionalities");
        return new CreditPayment();
    }
}
