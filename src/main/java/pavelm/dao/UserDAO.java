package pavelm.dao;


import pavelm.entity.User;

import java.util.List;

public interface UserDAO {
    public void deleteUser(int id);
    public User getUser(int id);
    public void saveUser(User user);
    public List<User> getAllUsers();
}
