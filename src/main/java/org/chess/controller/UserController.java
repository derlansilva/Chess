package org.chess.controller;

import org.chess.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users;

    public UserController() {
        users = new ArrayList<User>();
    }

    public void userAdd(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
