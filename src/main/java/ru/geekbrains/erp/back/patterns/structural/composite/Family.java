package ru.geekbrains.erp.back.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Family implements User {

    private String name;
    private float salary;

    private List<User> familyMembers = new ArrayList<>();

    public void addFamilyMember(User user) {
        this.familyMembers.add(user);
    }

    public float getNetFamilySalary() {
        this.salary = 0;
        for (User fm : this.familyMembers) {
            this.salary += fm.getSalary();
        }
        return this.salary;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }
}
