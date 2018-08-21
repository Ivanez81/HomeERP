package ru.geekbrains.erp.back.patterns.structural.composite;

public class TestUser {

    public static void main(String[] args) {
        User husband = new Husband("Ivan", 150000);
        User wife = new Wife("Irina", 120000);

        Family family = new Family();
        family.setName("My Family");
        family.addFamilyMember(husband);
        family.addFamilyMember(wife);

        System.out.println(husband.getName() + " - " + husband.getClass().getSimpleName() + " - "
                + "Salary = " + husband.getSalary());
        System.out.println(family.getName() + " Net salary = " + family.getNetFamilySalary());
    }

}
