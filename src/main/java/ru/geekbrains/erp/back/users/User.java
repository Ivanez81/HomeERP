package ru.geekbrains.erp.back.users;

public interface User {
    void setName(String name);
    String getName();
    void setSalary(float salary);
    float getSalary();
}
