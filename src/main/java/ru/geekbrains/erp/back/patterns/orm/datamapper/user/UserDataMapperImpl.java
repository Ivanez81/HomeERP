package ru.geekbrains.erp.back.patterns.orm.datamapper.user;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDataMapperImpl implements UserDataMapper {

    @Getter @Setter
    private List<User> users = new ArrayList<>();

    @Override
    public Optional<User> find(int userId) {
        for (final User user : this.getUsers()) {
            if (user.getUserId() == userId) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public void insert(User userToInserted) throws DataMapperException {
        if (!this.getUsers().contains(userToInserted)) {
            this.getUsers().add(userToInserted);
        } else {
            throw new DataMapperException("User already [" + userToInserted.getName() + "] exists");
        }
    }

    @Override
    public void update(User userToBeUpdated) throws DataMapperException {
        if (this.getUsers().contains(userToBeUpdated)) {
            final int index = this.getUsers().indexOf(userToBeUpdated);
            this.getUsers().set(index, userToBeUpdated);
        } else {
            throw new DataMapperException("User [" + userToBeUpdated.getName() + "] is not found");
        }
    }

    @Override
    public void delete(User userToBeDeleted) throws DataMapperException {
        if (this.getUsers().contains(userToBeDeleted)) {
            this.getUsers().remove(userToBeDeleted);
        } else {
            throw new DataMapperException("User [" + userToBeDeleted.getName() + "] is not found");
        }
    }
}
