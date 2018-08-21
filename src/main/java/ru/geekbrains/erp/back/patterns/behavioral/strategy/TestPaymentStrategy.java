package ru.geekbrains.erp.back.patterns.behavioral.strategy;

import java.time.LocalDate;

public class TestPaymentStrategy {

    public static void main(String[] args) {
        Payment payment = new Payment();

        PaymentStrategy cashPaymentStrategy = new CashPaymentStrategy(new Currency("Ruble", 1230));
        payment.pay(cashPaymentStrategy);

        PaymentStrategy creditCardPaymentStrategy =
                new CreditCardPaymentStrategy(
                        new CreditCard("1234 5678 9012 3456", "123",
                                "MR. PUPKIN", LocalDate.now()
                        ), new Currency("Euro", 345)
                );
        payment.pay(creditCardPaymentStrategy);
    }
}
