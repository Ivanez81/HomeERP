package ru.geekbrains.erp.back.users;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<User> familyMembers = new ArrayList<>();

    public void addFamilyMember(User user) {
        this.familyMembers.add(user);
    }

    public float getNetFamilySalary() {
        float result = 0;
        for (User fm : this.familyMembers) {
            result += fm.getSalary();
        }
        return result;
    }
}
