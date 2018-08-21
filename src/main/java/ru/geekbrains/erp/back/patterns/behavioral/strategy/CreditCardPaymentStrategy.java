package ru.geekbrains.erp.back.patterns.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private final CreditCard creditCard;
    private final Currency currency;

    public CreditCardPaymentStrategy(CreditCard creditCard, Currency currency) {
        this.creditCard = creditCard;
        this.currency = currency;
    }

    @Override
    public void pay() {
        System.out.println("processing via credit card " + this.creditCard.getCardNumber() + " in "
                + this.currency.getCurrencyName() + " amount " + this.currency.getAmount());
    }
}
