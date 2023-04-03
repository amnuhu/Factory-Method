package com.demo.factory;

import com.demo.payments.*;

public class PaymentCreator {
    public Payment createPayment(PaymentMethod paymentMethod) {
        if (paymentMethod == PaymentMethod.Cash) {
            return new CashPayment();
        } else if (paymentMethod == PaymentMethod.MoMo) {
            return new MoMoPayment();
        } else if (paymentMethod == PaymentMethod.CreditCard) {
            return new CreditPayment();
        } else if (paymentMethod == PaymentMethod.DebitCard) {
            return new DebitPayment();
        } else return null;
    }
}
