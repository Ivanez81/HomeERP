package ru.geekbrains.erp.back.patterns.structural.composite;

public class TestUser {

    public final static float HUSBAND_SALARY = 150000;
    public final static float WIFE_SALARY = 120000;

    public static void main(String[] args) {
        User husband = new Husband("Ivan", HUSBAND_SALARY);
        User wife = new Wife("Irina", WIFE_SALARY);

        Family family = new Family();
        family.setName("My Family");
        family.addFamilyMember(husband);
        family.addFamilyMember(wife);

        System.out.println(husband.getName() + " - " + husband.getClass().getSimpleName() + " - "
                + "Salary = " + husband.getSalary());
        System.out.println(family.getName() + " Net salary = " + family.getNetFamilySalary());
    }

}
