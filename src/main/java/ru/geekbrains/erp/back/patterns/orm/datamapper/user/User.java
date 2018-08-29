package ru.geekbrains.erp.back.patterns.orm.datamapper.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private int userId;

    @Getter
    @Setter
    private String name;

    public User() {
    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public boolean equals(final Object inputObject) {
        boolean isEqual = false;
        if (this == inputObject) {
            isEqual = true;
        } else if (inputObject != null && getClass() == inputObject.getClass()) {
            final User inputUser = (User) inputObject;
            if (this.getUserId() == inputUser.getUserId()) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
