package ru.geekbrains.erp.back.users;

public class TestUser {
    public static void main(String[] args) {
        User husband = new Husband("Ivan", 150000);
        User wife = new Wife("Irina", 150000);

        Family family = new Family();
        family.addFamilyMember(husband);
        family.addFamilyMember(wife);

        System.out.println("Net family salary = " + family.getNetFamilySalary());
    }
}
