package ru.geekbrains.erp.back.patterns.creational.factorymethod;

public class ExpenseMoney implements Money {
    @Override
    public String getDescription() {
        return "Expense money - sad...";
    }
}
