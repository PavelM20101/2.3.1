package pavelm.dao;


import pavelm.entity.User;

import java.util.List;

public interface UserDAO {

    void deleteUser(int id);

    User getUser(int id);

    void updateUser(User user);

    void createUser(User user);

    List<User> getAllUsers();
}
