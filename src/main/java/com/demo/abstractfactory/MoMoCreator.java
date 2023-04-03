package com.demo.abstractfactory;

import com.demo.payments.MoMoPayment;
import com.demo.payments.Payment;

public class MoMoCreator extends AbstractPaymentCreator{
    @Override
    public Payment createPayment() {
        System.out.println("Overriding the main Factory (MoMo implementation)");
        System.out.println("Getting extra control to implement extra functionalities");
        return new MoMoPayment();
    }
}
