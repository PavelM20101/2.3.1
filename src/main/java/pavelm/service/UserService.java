package pavelm.service;


import pavelm.entity.User;

import java.util.List;

public interface UserService {
    void deleteUser(int id);

    User getUser(int id);

    void createOrUpdateUser(User user);

    List<User> getAllUsers();
}
