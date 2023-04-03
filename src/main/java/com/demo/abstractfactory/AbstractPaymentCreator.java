package com.demo.abstractfactory;

import com.demo.payments.Payment;

public abstract class AbstractPaymentCreator {
    public abstract Payment createPayment();

    public void makePayment() {
        Payment payment = createPayment();
        payment.pay();
    }
}
