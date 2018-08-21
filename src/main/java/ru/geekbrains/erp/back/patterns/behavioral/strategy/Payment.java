package ru.geekbrains.erp.back.patterns.behavioral.strategy;

public class Payment {

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay();
    }

}
