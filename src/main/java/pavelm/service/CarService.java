package pavelm.service;


import pavelm.entity.Car;

import java.util.List;

public interface CarService {
    public void deleteCar(int id);
    public Car getCar(int id);
    public void saveCar(Car car);
    public List<Car> getAllCars();
}
