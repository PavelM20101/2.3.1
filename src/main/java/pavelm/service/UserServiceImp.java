package pavelm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pavelm.dao.UserDAO;
import pavelm.entity.Car;
import pavelm.entity.User;

import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    @Transactional
    public void deleteUserCar(User user) {
        userDAO.deleteUserCar(user);
    }

    @Override
    @Transactional
    public void setUserCar(User user, Car car) {
        userDAO.setUserCar(user, car);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
