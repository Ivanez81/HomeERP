package ru.geekbrains.erp.back.moneyOperations;

public class TestMoneyOperations {

    private Money money;

    public void createBudget(final BudgetFactory budgetFactory) {
        setMoneyType(budgetFactory.moveMoney());
    }

    public Money getMoneyType(final BudgetFactory budgetFactory) {
        return budgetFactory.moveMoney();
    }

    public Money getMoneyType() {
        return money;
    }

    private void setMoneyType(final Money money) {
        this.money = money;
    }

    public static class FactoryMaker {

        public enum MoneyType {
            INCOME, EXPENSE
        }

        public static BudgetFactory makeFactory(MoneyType type) {
            switch (type) {
                case INCOME:
                    return new IncomeFactory();
                case EXPENSE:
                    return new ExpenseFactory();
                default:
                    throw new IllegalArgumentException("MoneyType not supported.");
            }
        }
    }

    public static void main(String[] args) {
        TestMoneyOperations testMoneyOperations = new TestMoneyOperations();

        testMoneyOperations.createBudget(FactoryMaker.makeFactory(FactoryMaker.MoneyType.INCOME));
        System.out.println(testMoneyOperations.getMoneyType().getDescription());

        testMoneyOperations.createBudget(FactoryMaker.makeFactory(FactoryMaker.MoneyType.EXPENSE));
        System.out.println(testMoneyOperations.getMoneyType().getDescription());
    }
}
