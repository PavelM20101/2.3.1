package pavelm.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pavelm.dao.CarDAO;
import pavelm.entity.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDAO carDAO;
    @Override
    @Transactional
    public void deleteCar(int id) {
        carDAO.deleteCar(id);
    }

    @Override
    @Transactional
    public Car getCar(int id) {
        return carDAO.getCar(id);
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        carDAO.saveCar(car);
    }

    @Override
    @Transactional
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }
}
