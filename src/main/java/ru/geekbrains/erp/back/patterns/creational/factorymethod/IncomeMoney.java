package ru.geekbrains.erp.back.patterns.creational.factorymethod;

public class IncomeMoney implements Money {
    @Override
    public String getDescription() {
        return "Income money - great!";
    }
}
