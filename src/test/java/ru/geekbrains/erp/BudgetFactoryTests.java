package ru.geekbrains.erp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.erp.back.moneyOperations.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BudgetFactoryTests {

    private TestMoneyOperations testMoneyOperations = new TestMoneyOperations();
    private BudgetFactory incomeFactory;
    private BudgetFactory expenseFactory;

    @BeforeEach
    public void setUp() {
        incomeFactory = TestMoneyOperations.FactoryMaker.makeFactory(TestMoneyOperations.FactoryMaker.MoneyType.INCOME);
        expenseFactory = TestMoneyOperations.FactoryMaker.makeFactory(TestMoneyOperations.FactoryMaker.MoneyType.EXPENSE);
    }

    @Test
    public void money() {
        final Money incomeMoney = testMoneyOperations.getMoneyType(incomeFactory);
        assertTrue(incomeMoney instanceof IncomeMoney);
        final Money expenseMoney = testMoneyOperations.getMoneyType(expenseFactory);
        assertTrue(expenseMoney instanceof ExpenseMoney);
    }

}
