package pavelm.dao;


import pavelm.entity.Car;
import pavelm.entity.User;

import java.util.List;

public interface UserDAO {
    public void deleteUserCar(User user);
    public void setUserCar(User user, Car car);
    public void deleteUser(int id);
    public User getUser(int id);
    public void saveUser(User user);
    public List<User> getAllUsers();
}