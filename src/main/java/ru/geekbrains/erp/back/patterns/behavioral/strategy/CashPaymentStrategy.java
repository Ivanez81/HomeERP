package ru.geekbrains.erp.back.patterns.behavioral.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    private final Currency currency;

    public CashPaymentStrategy(Currency currency) {
        this.currency = currency;
    }

    @Override
    public void pay() {
        System.out.println("cash processing in " + this.currency.getCurrencyName()
                + " amount " + this.currency.getAmount());
    }

}
