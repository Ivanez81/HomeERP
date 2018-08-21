package ru.geekbrains.erp.back.patterns.creational.factorymethod;

public class ExpenseFactory implements BudgetFactory {
    @Override
    public Money createMoneyTransferDirection() {
        return new ExpenseMoney();
    }
}
