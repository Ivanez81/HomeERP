package ru.geekbrains.erp.back.patterns.mvc;

public class DBLayer implements ModelLayer {
    @Override
    public User getUser() {
        return new User(); //тут код доставания User'a из базы должен быть.
    }
}
