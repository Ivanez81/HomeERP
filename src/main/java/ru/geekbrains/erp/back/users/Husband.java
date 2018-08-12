package ru.geekbrains.erp.back.users;

public class Husband implements User {

    private String name;
    private float salary;

    public Husband(String name, float salary) {
        this.name = name;
        this.salary = salary;
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
