package ru.geekbrains.erp.back.patterns.orm.datamapper;

import ru.geekbrains.erp.back.patterns.orm.datamapper.user.User;
import ru.geekbrains.erp.back.patterns.orm.datamapper.user.UserDataMapper;
import ru.geekbrains.erp.back.patterns.orm.datamapper.user.UserDataMapperImpl;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        final UserDataMapper mapper = new UserDataMapperImpl();
        final IdentityMap im = new IdentityMap();

        User user1 = new User(1, "User1");
        User user2 = new User(2, "User2");
        User user3 = new User(3, "User3");
        User user4 = new User(4, "User4");

        mapper.insert(user1);
        mapper.insert(user2);
        mapper.insert(user3);
        mapper.insert(user4);
        System.out.println(user1 + " inserted");

        im.retrieve(user1);
        System.out.println("IM user1 - " + user1.hashCode());
        im.retrieve(user2);
        System.out.println("IM user2 - " + user2.hashCode());

        final Optional<User> userToBeFound = mapper.find(user1.getUserId());
        System.out.println(userToBeFound + " searched");

        user1 = new User(user1.getUserId(), "User1Upd");
        mapper.update(user1);
        System.out.println(user1 + " updated");

        im.retrieve(user1);
        System.out.println("IM user1 - " + user1.hashCode());
        im.retrieve(user2);
        System.out.println("IM user2 - " + user2.hashCode());

        System.out.println(user1 + " is going to delete");
        mapper.delete(user1);

    }
}
