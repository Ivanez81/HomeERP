package ru.geekbrains.erp.back.patterns.behavioral.strategy;

import java.time.LocalDate;

public class CreditCard {
    private String cardNumber;
    private String cvcCode;
    private String name;
    private LocalDate validThru;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String cvcCode, String name, LocalDate validThru) {
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.name = name;
        this.validThru = validThru;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvcCode() {
        return cvcCode;
    }

    public void setCvcCode(String cvcCode) {
        this.cvcCode = cvcCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getValidThru() {
        return validThru;
    }

    public void setValidThru(LocalDate validThru) {
        this.validThru = validThru;
    }

}
