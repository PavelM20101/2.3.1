package pavelm.dao;

import pavelm.entity.Car;

import java.util.List;

public interface CarDAO {
    public void deleteCar(int id);
    public Car getCar(int id);
    public void saveCar(Car car);
    public List<Car> getAllCars();
}
