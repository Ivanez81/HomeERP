package ru.geekbrains.erp.back.patterns.behavioral.strategy;

public class Currency {
    private String currencyName;
    private float amount;

    public Currency() {
    }

    public Currency(String currencyName) {
        this.currencyName = currencyName;
    }

    public Currency(String currencyName, float amount) {
        this.currencyName = currencyName;
        this.amount = amount;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
