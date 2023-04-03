package com.demo;

import com.demo.abstractfactory.AbstractPaymentCreator;
import com.demo.factory.PaymentCreator;
import com.demo.factory.PaymentMethod;
import com.demo.payments.Payment;

public class Application {
    private static final PaymentCreator paymentCreator = new PaymentCreator();

    public static void main(String[] args) {
        PaymentMethod paymentMethod =  generatePaymentMethod();
        makePayment(paymentMethod);
    }

    static void makePayment(PaymentMethod paymentMethod) {
        Payment payment = paymentCreator.createPayment(paymentMethod);
        payment.pay();
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



