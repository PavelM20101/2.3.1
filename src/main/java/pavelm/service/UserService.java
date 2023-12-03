package pavelm.service;


import pavelm.entity.User;

import java.util.List;

public interface UserService {
    public void deleteUser(int id);
    public User getUser(int id);
    public void saveUser(User user);
    public List<User> getAllUsers();
}
