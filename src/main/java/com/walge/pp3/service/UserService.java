package com.walge.pp3.service;


import com.walge.pp3.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    void update(User updatedUser);

    void delete(int id);

    List<User> getUserList();

    User getUserById(int id);
}
