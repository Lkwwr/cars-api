package kz.cars.carsapi.services;

import kz.cars.carsapi.dtos.CarDTO;
import kz.cars.carsapi.entities.Car;

import java.util.List;

public interface CarService {
    Car getCar(Long id);
    List<Car> getAllCars();
    void addCar(Car car);
    void saveCar(Car car);
    void deleteCar(Car car);
    CarDTO convertToDTO(Car car);
}
