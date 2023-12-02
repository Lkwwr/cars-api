package kz.cars.carsapi.services.impl;

import kz.cars.carsapi.dtos.CarDTO;
import kz.cars.carsapi.entities.Car;
import kz.cars.carsapi.repositories.CarRepository;
import kz.cars.carsapi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car getCar(Long id) {
        return carRepository.getReferenceById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void addCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }

    @Override
    public CarDTO convertToDTO(Car car) {
        return new CarDTO(car.getId(), car.getBrand(), car.getModel(), car.getCost());
    }
}
