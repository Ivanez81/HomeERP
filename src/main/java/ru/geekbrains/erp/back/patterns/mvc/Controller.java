package ru.geekbrains.erp.back.patterns.mvc;

public class Controller {
    ModelLayer modelLayer = new DBLayer();
    View view = new ConsoleView();
    void execute() {
        User user = modelLayer.getUser();
        view.showUser(user);
    }
}
