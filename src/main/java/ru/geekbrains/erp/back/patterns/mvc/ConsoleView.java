package ru.geekbrains.erp.back.patterns.mvc;

public class ConsoleView implements View {
    @Override
    public void showUser(User user) {
        System.out.println("UserId = " + user.getUserId() + ", UserName = " + user.getName());
    }
}
