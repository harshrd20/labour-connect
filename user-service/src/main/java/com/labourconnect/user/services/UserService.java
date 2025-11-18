package com.labourconnect.user.services;

import com.labourconnect.user.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(UUID id);

    User createUser(User user);

    void deleteUser(UUID id);
}
