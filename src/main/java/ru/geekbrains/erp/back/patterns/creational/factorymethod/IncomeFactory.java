package ru.geekbrains.erp.back.patterns.creational.factorymethod;

public class IncomeFactory implements BudgetFactory {
    @Override
    public Money createMoneyTransferDirection() {
        return new IncomeMoney();
    }
}
