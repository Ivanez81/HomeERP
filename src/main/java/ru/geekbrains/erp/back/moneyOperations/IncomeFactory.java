package ru.geekbrains.erp.back.moneyOperations;

public class IncomeFactory implements BudgetFactory {
    @Override
    public Money moveMoney() {
        return new IncomeMoney();
    }
}
