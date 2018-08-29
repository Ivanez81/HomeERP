package ru.geekbrains.erp.back.patterns.orm.datamapper;

import ru.geekbrains.erp.back.patterns.orm.datamapper.user.User;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {

    private Map<Integer, User> userMap = new HashMap<>();

    public User retrieve(User user) {
        if (!userMap.containsKey(user.getUserId())) {
            userMap.put(user.getUserId(), user);
        }
        return userMap.get(user.getUserId());
    }

}
