package com.demo;

import com.demo.abstractfactory.*;
import com.demo.factory.PaymentMethod;
import com.demo.payments.*;

public class AbstractApplication {
    private  static AbstractPaymentCreator payment;
    public static void main(String[] args) {
        PaymentMethod paymentMethod =  generatePaymentMethod();
        setUpPayment(paymentMethod);
        payment.makePayment();
    }

    static void setUpPayment(PaymentMethod paymentMethod) {
        if (paymentMethod == PaymentMethod.Cash) {
            payment = new CashCreator();
        } else if (paymentMethod == PaymentMethod.MoMo) {
            payment = new MoMoCreator();
        } else if (paymentMethod == PaymentMethod.CreditCard) {
            payment = new  CreditCreator();
        } else if (paymentMethod == PaymentMethod.DebitCard) {
            payment = new DebitCreator();
        } else payment = null;
    }

    static PaymentMethod generatePaymentMethod() {
        PaymentMethod paymentMethod = null;
        int min = 0, max = 3;

        int n = min + (int)(Math.random() * ((max - min) + 1));
        for (PaymentMethod method : PaymentMethod.values()){
            if (method.ordinal() == n)
                paymentMethod = method;
        }
        return paymentMethod;
    }
}
