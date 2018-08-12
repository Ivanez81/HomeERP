package ru.geekbrains.erp.back.moneyOperations;

public class ExpenseFactory implements BudgetFactory {
    @Override
    public Money createMoneyTransferDirection() {
        return new ExpenseMoney();
    }
}
